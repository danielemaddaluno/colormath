package com.github.ajalt.colorconvert

import com.github.ajalt.testing.softly
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HSLTest {
    @Test
    fun `HSL to RGB`() {
        softly {
            assertThat(HSL(0, 0, 0).toRGB()).isEqualTo(RGB(0, 0, 0))
            assertThat(HSL(96, 48, 59).toRGB()).isEqualTo(RGB(140, 201, 100))
            assertThat(HSL(279, 73, 13).toRGB()).isEqualTo(RGB(40, 9, 57))
            assertThat(HSL(0, 0, 100).toRGB()).isEqualTo(RGB(255, 255, 255))
        }
    }
}
