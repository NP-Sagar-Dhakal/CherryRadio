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

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

import net.programmierecke.radiodroid2.R;
import net.programmierecke.radiodroid2.RadioDroidApp;

public class LoadInterstitialAd {

    @SuppressLint("StaticFieldLeak")
    public static Context context = RadioDroidApp.context;
    public static InterstitialAd interstitialAd;
    public static InterstitialAdListener adListener;

    public static void loadInterstitialAd() {
        interstitialAd = new InterstitialAd(context.getApplicationContext(), context.getResources().getString(R.string.interstitial_ad));

        adListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };

        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(adListener)
                        .build());
    }
}
