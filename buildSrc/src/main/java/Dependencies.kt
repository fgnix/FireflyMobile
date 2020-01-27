object Dependencies{

    const val minSdk = 23
    const val targetSdk = 29
    const val compileSdk = 29
    const val kotlinVersion = "1.3.61"
    private const val retrofitVersion = "2.7.1"
    private const val lifecycleVersion = "2.2.0-rc02"
    private const val roomVersion = "2.2.3"
    private const val coroutineVersion = "1.3.3"
    private const val appCompatVersion = "1.1.0"
    private const val androidxFragmentVersion = "1.2.0-rc04"
    private const val androidxAnnotationVersion = "1.1.0"
    private const val androidxRecyclerViewVersion = "1.1.0-rc01"
    private const val materialDesignVersion = "1.2.0-alpha03"
    private const val swipeRefreshVersion = "1.1.0-alpha03"
    private const val androidxCoreVersion = "1.2.0-rc01"
    private const val androidxConstraintLayoutVersion = "1.1.3"
    private const val androidxPrefVersion = "1.1.0"
    private const val androidxWorkVersion = "2.3.0-rc01"
    private const val materialDrawerVersion = "8.0.0-a02"
    private const val iconicsVersion = "4.0.2"
    private const val toastyVersion = "1.4.2"
    private const val threeTenVersion = "1.2.1"
    private const val chartVersion = "3.1.0"
    private const val aboutLibVersion = "2.4.2"
    private const val glideVersion = "4.10.0"
    private const val debugDbVersion = "1.0.6"
    private const val nachosVersion = "1.2.0"
    private const val acraVersion = "5.5.0"
    private const val osmdroidVersion = "6.1.5"
    private const val jUnitVersion = "4.12"
    private const val espressoVersion = "3.1.1"
    private const val androidTestVersion = "1.1.1"
    private const val androidTestCoreVersion = "1.0.0"
    private const val accordionViewVersion = "1.2.2"
    private const val multiDexVersion = "2.0.1"
    private const val fancyshowcaseviewVersion = "1.2.1"
    private const val markdownVersion = "0.13.0"
    private const val biometricVersion = "1.0.1"

    val lifecycleLibs = "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
    val lifecyclerLiveDataCore = "androidx.lifecycle:lifecycle-livedata-core-ktx:$lifecycleVersion"
    val retrofitLibs = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    val retrofitScalar = "com.squareup.retrofit2:converter-scalars:$retrofitVersion"
    val mockWebServer = "org.mock-server:mockserver-netty:5.8.1"
    val roomLibs = "androidx.room:room-runtime:$roomVersion"
    val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
    val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"
    val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshVersion"
    val androidxFragment = "androidx.fragment:fragment-ktx:$androidxFragmentVersion"
    val androidxAnnotation = "androidx.annotation:annotation:$androidxAnnotationVersion"
    val androidxRecyclerView = "androidx.recyclerview:recyclerview:$androidxRecyclerViewVersion"
    val materialDesign = "com.google.android.material:material:$materialDesignVersion"
    val androidxCore = "androidx.core:core-ktx:$androidxCoreVersion"
    val androidxConstraintLayout = "androidx.constraintlayout:constraintlayout:$androidxConstraintLayoutVersion"
    val androidxPref = "androidx.preference:preference:$androidxPrefVersion"
    val androidxWork = "androidx.work:work-runtime-ktx:$androidxWorkVersion"
    val materialDrawer = "com.mikepenz:materialdrawer:$materialDrawerVersion"
    val iconics = "com.mikepenz:iconics-core:$iconicsVersion"
    val googleMaterialIcons  = "com.mikepenz:google-material-typeface:3.0.1.4.original-kotlin@aar"
    val fontAwesome = "com.mikepenz:fontawesome-typeface:5.9.0.0-kotlin@aar"
    val toasty = "com.github.GrenderG:Toasty:$toastyVersion"
    val threeTenBp = "com.jakewharton.threetenabp:threetenabp:$threeTenVersion"
    val chart = "com.github.PhilJay:MPAndroidChart:$chartVersion"
    val aboutLib = "com.github.daniel-stoneuk:material-about-library:$aboutLibVersion"
    val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    val glideLib = "com.github.bumptech.glide:glide:$glideVersion"
    val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"
    val glideOkHttpExtension = "com.github.bumptech.glide:okhttp3-integration:$glideVersion"
    val debugDb = "com.amitshekhar.android:debug-db:$debugDbVersion"
    val nachos = "com.hootsuite.android:nachos:$nachosVersion"
    val acraMail = "ch.acra:acra-mail:$acraVersion"
    val osmdroid = "org.osmdroid:osmdroid-android:$osmdroidVersion"
    val jUnit = "junit:junit:$jUnitVersion"
    val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
    val androidTest = "androidx.test:runner:$androidTestVersion"
    val androidTestCore = "androidx.test:core:$androidTestCoreVersion"
    val androidTestExt = "androidx.test.ext:junit:$androidTestCoreVersion"
    val accordionView = "com.github.florent37:expansionpanel:$accordionViewVersion"
    val multiDex = "androidx.multidex:multidex:$multiDexVersion"
    val fancyshowcaseview = "me.toptas.fancyshowcase:fancyshowcaseview:$fancyshowcaseviewVersion"
    val markdownLib = "com.atlassian.commonmark:commonmark:$markdownVersion"
    val markdownStrikeThroughExtension = "com.atlassian.commonmark:commonmark-ext-gfm-strikethrough:$markdownVersion"
    val markdownAutoLink = "com.atlassian.commonmark:commonmark-ext-autolink:$markdownVersion"
    val biometricLib = "androidx.biometric:biometric:$biometricVersion"
}