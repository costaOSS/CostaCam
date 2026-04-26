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
 * GIF capture settings for animated photo capture.
 *
 * Captures multiple frames and compiles them into an animated GIF.
 */
data class GifCaptureSettings(
    val frameCount: Int = 10,
    val frameDelayMs: Int = 100,
    val resolution: GifResolution = GifResolution.MEDIUM,
    val quality: Int = 80
) {
    enum class GifResolution(val width: Int, val height: Int) {
        LOW(240, 180),
        MEDIUM(480, 360),
        HIGH(640, 480)
    }

    companion object {
        val MAX_FRAMES = 30
        val MIN_FRAMES = 2
        val DEFAULT_FPS = 10
    }
}

enum class GifCaptureState {
    IDLE,
    RECORDING,
    PROCESSING,
    COMPLETED,
    ERROR
}