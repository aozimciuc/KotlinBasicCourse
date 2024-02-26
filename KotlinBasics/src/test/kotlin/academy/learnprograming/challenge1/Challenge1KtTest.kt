package academy.learnprograming.challenge1

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class Challenge1KtTest {

    @Test
    fun `get any should return non null object`() {
        val result = getAny()

        assertNotNull(result)
    }
}