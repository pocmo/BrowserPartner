package com.androidzeitgeist.browserpartner.customizations;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class PartnerBrowserCustomizationsProvider extends ContentProvider {
    private static final int URI_MATCH_HOMEPAGE = 0;
    private static final int URI_MATCH_DISABLE_INCOGNITO_MODE = 1;
    private static final int URI_MATCH_DISABLE_BOOKMARKS_EDITING = 2;

    private static final String AUTHORITY = "com.android.partnerbrowsercustomizations.test";

    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);
    static {
        URI_MATCHER.addURI(AUTHORITY, "homepage", URI_MATCH_HOMEPAGE);
        URI_MATCHER.addURI(AUTHORITY, "disableincognitomode", URI_MATCH_DISABLE_INCOGNITO_MODE);
        URI_MATCHER.addURI(AUTHORITY, "disablebookmarksediting", URI_MATCH_DISABLE_BOOKMARKS_EDITING);
    }

    private static final String HOMEPAGE_URI = "http://www.example.org";

    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        switch (URI_MATCHER.match(uri)) {
            case URI_MATCH_HOMEPAGE: {
                MatrixCursor cursor = new MatrixCursor(new String[] { "homepage" }, 1);
                cursor.addRow(new Object[] { HOMEPAGE_URI });
                return cursor;
            }

            case URI_MATCH_DISABLE_INCOGNITO_MODE: {
                MatrixCursor cursor = new MatrixCursor(new String[] { "disableincognitomode" }, 1);
                cursor.addRow(new Object[] { 1 });
                return cursor;
            }

            case URI_MATCH_DISABLE_BOOKMARKS_EDITING: {
                MatrixCursor cursor = new MatrixCursor(
                        new String[] { "disablebookmarksediting" }, 1);
                cursor.addRow(new Object[] { 1 });
                return cursor;
            }

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override
    public Uri insert(@NonNull Uri uri, ContentValues values) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int update(@NonNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException();
    }
}