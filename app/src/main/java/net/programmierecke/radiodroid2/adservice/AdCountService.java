/*
 *
 *   CherryCalendar
 *   <p/>
 *   Copyright (c) 2019-2022 Sagar Dhakal
 *   <p/>
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   <p/>
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *   <p/>
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package net.programmierecke.radiodroid2.adservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import net.programmierecke.radiodroid2.RadioDroidApp;

public class AdCountService {
    @SuppressLint("StaticFieldLeak")
    public static Context context = RadioDroidApp.context;
    public static String primaryButtonClickCount = "PRIMARY_BUTTON_CLICK_COUNT";
    public static String secondaryButtonClickCount = "SECONDARY_BUTTON_CLICK_COUNT";
    public static String radioClickCount = "RADIO_CLICK_COUNT";


    public static void putAdCount(String key, int value) {
        SharedPreferences m = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = m.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getAdCount(String key, int defValue) {
        SharedPreferences m = PreferenceManager.getDefaultSharedPreferences(context);
        return m.getInt(key, defValue);
    }

}
