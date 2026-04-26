/*
 * Copyright (C) 2025 CostaCam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.jetpackcamera.model

/**
 * Manual camera settings for Pro Mode photography.
 *
 * Provides control over ISO, shutter speed, white balance, and focus.
 */
data class ProModeSettings(
    val iso: Int? = null,
    val shutterSpeed: Long? = null,
    val whiteBalance: WhiteBalanceMode = WhiteBalanceMode.AUTO,
    val focusDistance: Float? = null,
    val exposureCompensation: Int = 0
) {
    enum class WhiteBalanceMode(val temperatureKelvin: Int) {
        AUTO(0),
        CLOUDY(6500),
        DAYLIGHT(5500),
        INCANDESCENT(2850),
        FLUORESCENT(4000),
        SHADE(7500)
    }

    companion object {
        val ISO_VALUES = listOf(100, 200, 400, 800, 1600, 3200, 6400)
        val SHUTTER_SPEEDS = listOf(
            1_000_000L,       // 1ms
            2_000L,           // 2ms
            4_000L,           // 4ms
            8_000L,           // 8ms
            15_625L,          // 1/64s
            31_250L,          // 1/32s
            62_500L,          // 1/16s
            125_000L,         // 1/8s
            250_000L,         // 1/4s
            500_000L,         // 1/2s
            1_000_000L,       // 1s
            2_000_000L,       // 2s
            4_000_000L,       // 4s
            8_000_000L        // 8s
        )
    }
}