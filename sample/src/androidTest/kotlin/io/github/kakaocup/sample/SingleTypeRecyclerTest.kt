package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.TestRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SingleTypeRecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(SingleTypeRecyclerActivity::class.java)

    @Test
    fun testContentItemsRecyclerView() {
        onScreen<TestRecyclerScreen> {
            recycler {
                isVisible()
                hasSize(5)

                firstChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Title 0") }
                }

                lastChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Final Title") }
                }

                children<TestRecyclerScreen.MainItem> {
                    subtitle { hasText("This is a test subtitle character sequence") }
                }

                childWith<TestRecyclerScreen.MainItem> { withDescendant { withText("Title 1") } } perform {
                    title {
                        isDisplayed()
                        hasText("Title 1")
                    }
                }

                childWith<TestRecyclerScreen.MainItem> { withDescendant { withText("Title 2") } } perform {
                    title {
                        isDisplayed()
                        hasText("Title 2")
                    }
                }
            }
        }
    }
}
