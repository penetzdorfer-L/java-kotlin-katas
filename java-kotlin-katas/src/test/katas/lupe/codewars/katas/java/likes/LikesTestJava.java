package lupe.codewars.katas.java.likes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LikesTestJava {
    private Likes likes = new Likes();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new String[]{}, "no one likes this"),
                Arguments.of(new String[]{"Paul"}, "Paul likes this"),
                Arguments.of(new String[]{"Paul", "Mel"}, "Paul and Mel like this"),
                Arguments.of(new String[]{"Paul", "Mel", "Totti"}, "Paul, Mel and Totti like this"),
                Arguments.of(new String[]{"Paul", "Mel", "Totti", "Mike"}, "Paul, Mel and 2 others like this"),
                Arguments.of(new String[]{"Paul", "Mel", "Totti", "Mike", "a", "a", "a", "a", "a"}, "Paul, Mel and 7 others like this")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testLikes(String[] source, String expected) {
        assertEquals(likes.likes(source), expected);
    }
}