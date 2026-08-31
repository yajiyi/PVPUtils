package com.pvp_utils.client.gui.clickgui.theme;

/**
 * 白色主题：纯白底 + 蓝色强调，接近原版浅色但更纯净。
 */
public final class WhiteTheme implements ClickGuiTheme {
    private static final ClickGuiThemePalette PALETTE = new ClickGuiThemePalette(
            0xFFFFFFFF,
            0xFFFAFAFA,
            0xFFFFFFFF,
            0xFFFFFFFF,
            0xFFF8F8FA,
            0xFF2F54EB,
            0xFF111111,
            0xFFAAAAAA,
            0xFFE7E7EA
    );
    private static final ClickGuiThemeMetrics METRICS = new ClickGuiThemeMetrics(16f, 10f, 8f, 1f, 0f);

    @Override
    public String id() {
        return "white";
    }

    @Override
    public String displayName() {
        return "White";
    }

    @Override
    public ClickGuiThemePalette palette() {
        return PALETTE;
    }

    @Override
    public ClickGuiThemeMetrics metrics() {
        return METRICS;
    }
}
