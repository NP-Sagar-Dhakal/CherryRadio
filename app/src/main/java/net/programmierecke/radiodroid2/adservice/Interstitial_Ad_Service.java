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

public class Interstitial_Ad_Service {

    public static void primaryButtonClick() {
        int clickValue = AdCountService.getAdCount(AdCountService.primaryButtonClickCount, 0) + 1;
        if (clickValue > 10) {
            if (LoadInterstitialAd.interstitialAd.isAdLoaded() &&
                    !LoadInterstitialAd.interstitialAd.isAdInvalidated()) {
                LoadInterstitialAd.interstitialAd.show();
                AdCountService.putAdCount(AdCountService.primaryButtonClickCount, 0);
            } else {
                LoadInterstitialAd.loadInterstitialAd();
            }
        } else {
            AdCountService.putAdCount(AdCountService.primaryButtonClickCount, clickValue);
        }
    }

    public static void directLoadAd() {
        if (LoadInterstitialAd.interstitialAd.isAdLoaded() &&
                !LoadInterstitialAd.interstitialAd.isAdInvalidated()) {
            LoadInterstitialAd.interstitialAd.show();
        } else {
            LoadInterstitialAd.loadInterstitialAd();
        }
    }
}
