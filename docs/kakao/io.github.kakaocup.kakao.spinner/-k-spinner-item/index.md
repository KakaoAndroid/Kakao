[kakao](../../index.md) / [io.github.kakaocup.kakao.spinner](../index.md) / [KSpinnerItem](./index.md)

# KSpinnerItem

`class KSpinnerItem : `[`KAdapterItem`](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md)`<`[`KTextView`](../../io.github.kakaocup.kakao.text/-k-text-view/index.md)`>, `[`TextViewAssertions`](../../io.github.kakaocup.kakao.text/-text-view-assertions/index.md)

KTextView implementation of KAdapterItem

Use this if you want to perform/assert on the root view of adapter item

### Parameters

`parent` - Matcher of the root view of adapter item

**See Also**

[KAdapterItem](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `KSpinnerItem(parent: DataInteraction)`<br>KTextView implementation of KAdapterItem |

### Inherited Properties

| Name | Summary |
|---|---|
| [root](../../io.github.kakaocup.kakao.list/-k-adapter-item/root.md) | `open var root: Matcher<Root!>!` |
| [view](../../io.github.kakaocup.kakao.list/-k-adapter-item/view.md) | `open val view: `[`ViewInteractionDelegate`](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [containsText](../../io.github.kakaocup.kakao.text/-text-view-assertions/contains-text.md) | `open fun containsText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view contains given text |
| [hasAnyText](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-any-text.md) | `open fun hasAnyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has any text |
| [hasContentDescription](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-content-description.md) | `open fun hasContentDescription(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given content description |
| [hasEmptyText](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-empty-text.md) | `open fun hasEmptyText(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view have not any text |
| [hasHint](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-hint.md) | `open fun hasHint(hint: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasHint(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given hint |
| [hasNoText](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-no-text.md) | `open fun hasNoText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasNoText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view does not have a given text |
| [hasText](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-text.md) | `open fun hasText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`open fun hasText(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text`open fun hasText(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has text that matches given matcher |
| [hasTextColor](../../io.github.kakaocup.kakao.text/-text-view-assertions/has-text-color.md) | `open fun hasTextColor(resId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view has given text color |
| [invoke](../../io.github.kakaocup.kakao.list/-k-adapter-item/invoke.md) | `operator fun invoke(function: `[`T`](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Operator that allows usage of DSL style |
| [perform](../../io.github.kakaocup.kakao.list/-k-adapter-item/perform.md) | `infix fun perform(function: `[`T`](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md#T)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`T`](../../io.github.kakaocup.kakao.list/-k-adapter-item/index.md#T)<br>Infix function for invoking lambda on your view |
| [startsWithText](../../io.github.kakaocup.kakao.text/-text-view-assertions/starts-with-text.md) | `open fun startsWithText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the view text start with given substring |
