# OverscrollScrollView
Overscroll layout for NestedScrollView and RecyclerView
<br><br><br>

thanks to [Bouncy Library](https://github.com/valkriaine/Bouncy) and [Juan Mengual](https://github.com/juanmeanwhile/BounceRecyclerView) repository
## Nested Scroll View
just use layout from the dependency by using :
```
 <com.factor.bouncy.BouncyNestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        < ...
          ...
        />

 </com.factor.bouncy.BouncyNestedScrollView>
 ```
 ## Recycler View
You have two option for recycler view, using from the dependency or build your own bounce factory 
1. Bounce Factory
here are the factory code that i modify little bit

 [BounceEffectFactory.kt](https://github.com/bennyfajri/OverscrollScrollView/blob/master/app/src/main/java/com/drsync/overscrolllayout/BounceEffectFactory.kt) <br>
 [SecondActivity](https://github.com/bennyfajri/OverscrollScrollView/blob/master/app/src/main/java/com/drsync/overscrolllayout/SecondActivity.kt)
 
 2. From [Bouncy Library](https://github.com/valkriaine/Bouncy)
 using in xml code, just like using an original recycler view :
 ```
  <com.factor.bouncy.BouncyRecyclerView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        ...
  />
 ```
 
 
 
## Preview
<img src="https://github.com/bennyfajri/OverscrollScrollView/blob/master/preview/2023-03-12%2000-33-53.gif" alt="drawing" width="250" height="480"/>
 
