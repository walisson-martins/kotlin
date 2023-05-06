import org.junit.jupiter.api.*

class MainTest {
    @Test
    @DisplayName("Teste método countXO")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xooo")) },
            { Assertions.assertTrue(countXO("xxxoo")) },
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {
    }

    @Test
    fun falhar() {
        fail("Não posso terminar o teste")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assumptions.assumeTrue((countXO("só roda se for true")))
    }

    @Test
    fun excp() {
        assertThrows<NullPointerException> {
        }
    }
}