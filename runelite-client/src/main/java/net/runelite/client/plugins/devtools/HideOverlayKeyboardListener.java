package net.runelite.client.plugins.devtools;

import net.runelite.client.input.KeyListener;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.event.KeyEvent;

@Singleton
public class HideOverlayKeyboardListener implements KeyListener
{
	@Inject
	private DevToolsConfig devToolsConfig;

	@Inject
	private DevToolsPlugin devToolsPlugin;

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (devToolsConfig.hideOverlayToggle().matches(e))
		{
			devToolsPlugin.toggle();
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}
}