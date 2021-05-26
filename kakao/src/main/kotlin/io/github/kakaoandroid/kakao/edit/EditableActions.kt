@file:Suppress("unused")

package io.github.kakaoandroid.kakao.edit

import androidx.test.espresso.action.ViewActions
import io.github.kakaoandroid.kakao.common.actions.BaseActions

/**
 * Provides editable actions for views
 */
interface EditableActions : BaseActions {
    /**
     * Types the given text into the view
     *
     * @param text Text to input
     */
    fun typeText(text: String) {
        view.perform(ViewActions.typeText(text))
    }

    /**
     * Replaces the current view text with given
     *
     * @param text Text to input instead of current
     */
    fun replaceText(text: String) {
        view.perform(ViewActions.replaceText(text))
    }

    /**
     * Clears current text in the view
     */
    fun clearText() {
        replaceText("")
    }
}
