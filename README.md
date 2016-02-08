# Fragments
* How to create a dynamic user experience with fragments and optimize your app's user experience for devices with different screen sizes(Android)
* Part of the series Mastering Android

* FragmentActivity is a special activity provided in the Support Library to handle fragments on system versions older than API level 11. If the lowest system version you support is API level 11 or higher, then you can use a regular Activity.
* When you add a fragment to an activity layout by defining the fragment in the layout XML file, you cannot remove the fragment at runtime.
* When you remove or replace a fragment and add the transaction to the back stack, the fragment that is removed is stopped (not destroyed). If the user navigates back to restore the fragment, it restarts. If you do not add the transaction to the back stack, then the fragment is destroyed when removed or replaced.
* All Fragment-to-Fragment communication is done through the associated Activity. Two Fragments should never communicate directly.
