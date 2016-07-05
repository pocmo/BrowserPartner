# BrowserPartner

A sample/test application with a PartnerBookmarksProvider and PartnerBrowserCustomizationsProvider implementation
with test data.

Just add ".test" to the authority of the content providers to access the test data from this application:

| Original authority                       | Test authority                                |
|------------------------------------------|-----------------------------------------------|
| com.android.partnerbookmarks             | com.android.partnerbookmarks.test             |
| com.android.partnerbrowsercustomizations | com.android.partnerbrowsercustomizations.test |

## Test Data

### Bookmarks

content://com.android.partnerbookmarks**.test**

| Bookmark                                                      | Favicon | Touch Icon |
|---------------------------------------------------------------|---------|------------|
| Android Zeitgeist : http://www.androidzeitgeist.com           | ✘       | ✘          |
| Hacker News : https://news.ycombinator.com/                   | ✓       | ✘          |
| Developing Android Apps : https://www.reddit.com/r/androiddev | ✘       | ✓          |
| GitHub : https://github.com/                                  | ✓       | ✓          |

