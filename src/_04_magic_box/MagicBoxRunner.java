package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.SwingUtilities;

public class MagicBoxRunner {
	public static void main(String[] args) throws Exception {
		MagicBox mb = new MagicBox();
		SwingUtilities.invokeLater(mb);
	}
}
