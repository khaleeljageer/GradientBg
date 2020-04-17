[![](https://jitpack.io/v/khaleeljageer/GradientBg.svg)](https://jitpack.io/#khaleeljageer/GradientBg)

# GradientBg
To generate Gradient Drawable...

# How to
To get a Git project into your build:

## Gradle
**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

**Step 2.** Add the dependency

	dependencies {
	        implementation 'com.github.khaleeljageer:GradientBg:1.0'
	}

**Step 3.** Sync.

# Example
	# minColors - Minimum Number of colors applied to Gradient(Should be > 1)
	# maxColors - Maximum Number of colors applied to Gradient(Should be > minColors)
	# orientation - Graident Orientation from "GradientDrawable.Orientation"
	
	val gradientBg = GradientBg.Builder()
		.setColorsCount(minColors, maxColors)
		.setOrientation(orientation)
		.build()
		
	yourView.setBackground(gradientBg.generateGradient())

