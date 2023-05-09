import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Testa os cenários da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "Comum", "xt254"), "Welcome.")
        Assertions.assertEquals(portaria(25, "Comum", "452112"), "Negado.")

        Assertions.assertEquals(portaria(25, "premium", "xt254"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "452112"), "Negado.")
        Assertions.assertEquals(portaria(25, "premium", "xl452112"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xl452112"), "Welcome.")

        Assertions.assertAll({
            Assertions.assertEquals(portaria(25, "premium", "xl452112"), "Welcome.")
            Assertions.assertEquals(portaria(25, "luxo", "xl452112"), "Welcome.")
        })
    }
}