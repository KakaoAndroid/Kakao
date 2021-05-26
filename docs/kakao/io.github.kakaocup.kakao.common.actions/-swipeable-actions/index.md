[kakao](../../index.md) / [io.github.kakaocup.kakao.common.actions](../index.md) / [SwipeableActions](./index.md)

# SwipeableActions

`interface SwipeableActions : `[`BaseActions`](../-base-actions/index.md)

Provides swipe actions for views

### Inherited Properties

| Name | Summary |
|---|---|
| [view](../-base-actions/view.md) | `abstract val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Functions

| Name | Summary |
|---|---|
| [swipeDown](swipe-down.md) | `open fun swipeDown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes down on the view |
| [swipeLeft](swipe-left.md) | `open fun swipeLeft(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes left on the view |
| [swipeRight](swipe-right.md) | `open fun swipeRight(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes right on the view |
| [swipeUp](swipe-up.md) | `open fun swipeUp(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Swipes up on the view |

### Inherited Functions

| Name | Summary |
|---|---|
| [act](../-base-actions/act.md) | `open fun act(function: () -> ViewAction): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs custom action on a view |
| [click](../-base-actions/click.md) | `open fun click(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs click on view |
| [doubleClick](../-base-actions/double-click.md) | `open fun doubleClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs double click on view |
| [longClick](../-base-actions/long-click.md) | `open fun longClick(location: GeneralLocation = GeneralLocation.VISIBLE_CENTER): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Performs long click on view |
| [onFailure](../-base-actions/on-failure.md) | `open fun onFailure(function: (error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, matcher: Matcher<`[`View`](https://developer.android.com/reference/android/view/View.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds failure handler to the view |
| [pressImeAction](../-base-actions/press-ime-action.md) | `open fun pressImeAction(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Presses IME action, if supported view is in focus |
| [repeatUntil](../-base-actions/repeat-until.md) | `open fun repeatUntil(maxAttempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 1, action: () -> ViewAction, matcher: `[`ViewBuilder`](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Repeats given action on the view until this view will match the given matcher |
| [scrollTo](../-base-actions/scroll-to.md) | `open fun scrollTo(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Scrolls to the view, if possible |

### Inheritors

| Name | Summary |
|---|---|
| [KSwipeView](../../io.github.kakaocup.kakao.common.views/-k-swipe-view/index.md) | `class KSwipeView : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KSwipeView`](../../io.github.kakaocup.kakao.common.views/-k-swipe-view/index.md)`>, `[`SwipeableActions`](./index.md)<br>View with SwipeableActions and BaseAssertions |
| [KViewPager](../../io.github.kakaocup.kakao.pager/-k-view-pager/index.md) | `class KViewPager : `[`KBaseView`](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)`<`[`KViewPager`](../../io.github.kakaocup.kakao.pager/-k-view-pager/index.md)`>, `[`SwipeableActions`](./index.md)`, `[`ViewPagerAssertions`](../../io.github.kakaocup.kakao.pager/-view-pager-assertions/index.md)<br>View with SwipeableActions and ViewPagerAssertions |
| [KViewPager2](../../io.github.kakaocup.kakao.pager2/-k-view-pager2/index.md) | `class KViewPager2 : `[`ViewPager2Actions`](../../io.github.kakaocup.kakao.pager2/-view-pager2-actions/index.md)`, `[`ViewPager2AdapterAssertions`](../../io.github.kakaocup.kakao.pager2/-view-pager2-adapter-assertions/index.md)`, `[`SwipeableActions`](./index.md)`, `[`BaseAssertions`](../../io.github.kakaocup.kakao.common.assertions/-base-assertions/index.md)<br>View with SwipeableActions and ViewPager2Assertions |
| [RecyclerActions](../../io.github.kakaocup.kakao.recycler/-recycler-actions/index.md) | `interface RecyclerActions : `[`ScrollableActions`](../-scrollable-actions/index.md)`, `[`SwipeableActions`](./index.md)<br>Provides ScrollableActions implementation for RecyclerView |
| [ScrollViewActions](../../io.github.kakaocup.kakao.scroll/-scroll-view-actions/index.md) | `interface ScrollViewActions : `[`ScrollableActions`](../-scrollable-actions/index.md)`, `[`SwipeableActions`](./index.md)<br>Provides ScrollableActions implementation for ScrollView |
| [SwipeRefreshLayoutActions](../../io.github.kakaocup.kakao.swiperefresh/-swipe-refresh-layout-actions/index.md) | `interface SwipeRefreshLayoutActions : `[`SwipeableActions`](./index.md)<br>Provides actions for SwipeRefreshLayout |
| [ViewPager2Actions](../../io.github.kakaocup.kakao.pager2/-view-pager2-actions/index.md) | `interface ViewPager2Actions : `[`ScrollableActions`](../-scrollable-actions/index.md)`, `[`SwipeableActions`](./index.md)<br>Provides ScrollableActions implementation for ViewPager2 |
