package io.github.kakaocup.kakao.slider

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.SliderMatcher

interface SliderAssertions : BaseAssertions {
    fun hasValue(value: Float) {
        view.check(
            ViewAssertions.matches(SliderMatcher(value))
        )
    }
}
