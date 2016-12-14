import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import org.jdesktop.swingx.autocomplete.*;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;

public class ActivityFrame extends JFrame {
	int fontSizeBeforeChanges;
	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final JButton ProfPic1 = new JButton();
	private final JButton ProfPic2 = new JButton();
	private final JButton ProfPic3 = new JButton();
	private final JButton ProfPic4 = new JButton();
	private final JButton ProfPic5 = new JButton();
	private final JButton ProfPic6 = new JButton();
	private final JButton ProfPic7 = new JButton();
	private final JButton ProfPic8 = new JButton();
	private final JButton ProfName1 = new JButton("Tim Holly");
	private final JButton ProfName2 = new JButton("Santa Clause");
	private final JButton ProfName3 = new JButton("Alex Dane");
	private final JButton ProfName4 = new JButton("Zane Dylan");
	private final JButton ProfName5 = new JButton("Mary Jane");
	private final JButton ProfName6 = new JButton("Penny Bun");
	private final JButton ProfName7 = new JButton("Hallow Man");
	private final JButton ProfName8 = new JButton("Harry Jane");
	private final JLabel lblLikes = new JLabel("likes");
	private final JLabel lblLikes1 = new JLabel("likes");
	private final JLabel lblLikes2 = new JLabel("likes");
	private final JLabel lblLikes3 = new JLabel("likes");
	private final JLabel lblFollowed = new JLabel("followed");
	private final JButton profPic11 = new JButton("New button");
	private final JButton profPic9 = new JButton("New button");
	private final JButton profPic10 = new JButton("New button");
	private final JButton profPic12 = new JButton("New button");
	private final JButton profPic13 = new JButton("New button");
	private final JButton profPic14 = new JButton("New button");
	private final JButton profPic15 = new JButton("Tim Holly");
	private final JButton btnS = new JButton("Stew Bob");
	private final JButton buttnrnew14 = new JButton("Alex Dane");
	private final JButton btnElanIrun = new JButton("Elan Irun");
	private final JButton btnMaryHas = new JButton("Mary Has");
	private final JButton btnNanDo = new JButton("Nan Do");
	private final JButton btnHanGo = new JButton("Han Go");
	private final JButton btnBottNar = new JButton("Bott Nar");
	private final JButton btnAleeBane = new JButton("Alee Bane");
	private final JButton btnPenCli = new JButton("Pen Cli");
	private final JButton btnSidLui = new JButton("Sid Lui");
	private final JButton btnNando2 = new JButton("Nan Do");
	private final JButton btnIWantChocolate = new JButton("I want chocolate");
	private final JButton btnHowDoYou = new JButton("how do you do");
	private final JButton btnRomeoAndJuliet = new JButton("mcmaster exam season");
	private final JPanel followingNotifsPanel = new JPanel();
	private JTextField filterTextField;
	private String defaultFilterMessage = "Enter word, phrase, or hashtag";
	
	JTextPane user1_post,user2_post,user3_post,user4_post;
	JPanel user1_HTpanel,user2_HTpanel,user3_HTpanel,user4_HTpanel;
	
	JTextPane[] userposts = {user1_post,user2_post,user3_post,user4_post};
	JPanel[] userpanels = {user1_HTpanel,user2_HTpanel,user3_HTpanel,user4_HTpanel};
	
	JPanel notiftabPanel = new JPanel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivityFrame frame = new ActivityFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int msgNum;
	String[][] messages = new String[10][100];
	private final JLabel lblfollow1 = new JLabel("followed you");
	private final JLabel lblfollow2 = new JLabel("followed you");
	private final JLabel lblfollow3 = new JLabel("followed you");
	private final JButton btntimothery = new JButton("Tim Holly");
	private final JButton btnpicpic = new JButton();
	private final JButton butnpic2 = new JButton();
	private final JButton btnpic3 = new JButton("Santa Clause");
	private final JButton btnpic4 = new JButton();
	private final JButton btnpic5 = new JButton("Alex Dane");
	private final JButton btnpic6 = new JButton();
	private final JButton btnpic7 = new JButton("Zane Dylan");
	private final JButton btnpic8 = new JButton();
	private final JButton btnpic9 = new JButton("Mary Jane");
	private final JButton btnpic10 = new JButton("Penny Bun");
	private final JButton butnpic11 = new JButton("Hallow Man");
	private final JButton btnpic12 = new JButton("Harry Jane");
	private final JButton butnpic13 = new JButton();
	private final JButton btnpic14 = new JButton();
	private final JButton butnpic15 = new JButton();
	private final JLabel lblPostsYouHave = new JLabel("Posts you have been tagged in:");
	private final JLabel label_3 = new JLabel("followed you");
	private final JLabel label_4 = new JLabel("followed you");
	private final JLabel lblh = new JLabel("1h");
	private final JLabel label_6 = new JLabel("1h");
	private final JLabel label_7 = new JLabel("1h");
	private final JLabel label_8 = new JLabel("1h");
	private final JLabel label_9 = new JLabel("1h");
	private final JLabel label_10 = new JLabel("1h");
	private final JPanel likePanel = new JPanel();
	private final JButton button = new JButton();
	private final JButton button_11 = new JButton("Tim Holly");
	private final JButton button_12 = new JButton();
	private final JButton button_13 = new JButton("Santa Clause");
	private final JButton button_14 = new JButton();
	private final JButton button_15 = new JButton("Alex Dane");
	private final JButton button_16 = new JButton();
	private final JButton button_17 = new JButton("Zane Dylan");
	private final JButton button_18 = new JButton();
	private final JButton button_19 = new JButton("Mary Jane");
	private final JButton button_20 = new JButton();
	private final JButton button_21 = new JButton("Penny Bun");
	private final JLabel lblYourPostsHave = new JLabel("Your posts have been liked:");
	private final JPanel panel_5 = new JPanel();
	private final JButton button_27 = new JButton("New button");
	private final JButton button_28 = new JButton("Tim Holly");
	private final JButton button_29 = new JButton("Hello, good day, goodbye ");
	private final JButton button_30 = new JButton("#Trending");
	private final JButton button_31 = new JButton("New button");
	private final JButton button_32 = new JButton("Stew Bob");
	private final JButton button_33 = new JButton("New button");
	private final JButton button_34 = new JButton("New button");
	private final JButton button_35 = new JButton("Elan Irun");
	private final JButton button_36 = new JButton("mcmaster exam season");
	private final JButton button_37 = new JButton("#Trending");
	private final JButton button_38 = new JButton("Hello, good day, goodbye ");
	private final JButton button_39 = new JButton("Hello, good day, goodbye ");
	private final JButton button_40 = new JButton("New button");
	private final JButton button_41 = new JButton("New button");
	private final JButton button_42 = new JButton("Stew Bob");
	private final JButton button_43 = new JButton("Stew Bob");
	private final JButton button_44 = new JButton("mcmaster exam season");
	private final JButton button_45 = new JButton("mcmaster exam season");
	private final JButton button_46 = new JButton("Stew Bob");
	private final JButton button_47 = new JButton("#Trending");
	private final JButton button_48 = new JButton("#Trending");
	private final JButton button_49 = new JButton("#Trending");
	private final JButton button_50 = new JButton("#Trending");
	private final JButton btnTrendingposts = new JButton("TrendingPosts");
	private final JButton btnTrendingDave = new JButton("Trending Dave");
	private final JButton btnMrtrending = new JButton("Mr.Trending");
	private final JButton btnTrendingMan = new JButton("Trending Man");
	private final JButton btnTreening = new JButton("Treending");
	private final JPanel panel_8 = new JPanel();
	private final JLabel label_23 = new JLabel("New label");
	private final JLabel label_24 = new JLabel("New label");
	private final JPanel panel_9 = new JPanel();
	private final JLabel label_26 = new JLabel("New label");
	private final JLabel label_27 = new JLabel("Ann Barber");
	private final JLabel label_28 = new JLabel("@userhandle");
	private final JLabel label_29 = new JLabel("3h");
	private final JTextPane textPane_1 = new JTextPane();
	private final JPanel panel_10 = new JPanel();
	private final JLabel label_30 = new JLabel("User Name");
	private final JLabel label_31 = new JLabel("@userhandle");
	private final JLabel label_32 = new JLabel("4h");
	private final JLabel label_33 = new JLabel("New label");
	private final JTextPane textPane_2 = new JTextPane();
	private final JPanel panel_11 = new JPanel();
	private final JLabel label_34 = new JLabel("New label");
	private final JLabel label_35 = new JLabel("Ann Barber");
	private final JLabel label_36 = new JLabel("@userhandle");
	private final JLabel label_37 = new JLabel("3h");
	private final JTextPane textPane_3 = new JTextPane();
	private final JPanel panel_12 = new JPanel();
	private final JLabel label_38 = new JLabel("New label");
	private final JLabel label_39 = new JLabel("Ann Barber");
	private final JLabel label_40 = new JLabel("@userhandle");
	private final JLabel label_41 = new JLabel("3h");
	private final JTextPane textPane_4 = new JTextPane();
	private final JLabel label_42 = new JLabel("");
	private final JButton button_51 = new JButton("");
	private final JLabel label_43 = new JLabel("John Doe");
	private final JLabel label_44 = new JLabel("@JohnDoe");
	private final JButton button_52 = new JButton("Today was super cooool                                       1h");
	private final JButton button_53 = new JButton("Water is important for the body                           2h");
	private final JButton button_54 = new JButton("cole world                                                           12h");
	private final JButton button_55 = new JButton("hello world                                                           14h");
	/**
	 * Create the frame.
	 */
	public ActivityFrame() {
		setTitle("Poster");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.WHITE);
		contentPane.add(tabbedPane);
		
		JPanel hometabPanel = new JPanel();
		hometabPanel.setBackground(Color.WHITE);
		hometabPanel.setForeground(new Color(0, 0, 0));
		ImageIcon tab1Icon = new ImageIcon(this.getClass().getResource("home.png"));
		tabbedPane.addTab("", tab1Icon, hometabPanel, "");
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		/**********************************Jade's Part**********************************************/
		hometabPanel.setLayout(null);
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 299, 415);
		tabbedPane_2.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane_2.setBorder(null);
		hometabPanel.add(tabbedPane_2);
		
		JPanel panel_MainFeed = new JPanel();
		panel_MainFeed.setPreferredSize(new Dimension(21, 21));
		panel_MainFeed.setMinimumSize(new Dimension(21, 21));
		tabbedPane_2.addTab("MAIN FEED", null, panel_MainFeed, null);
		panel_MainFeed.setLayout(new BoxLayout(panel_MainFeed, BoxLayout.Y_AXIS));
		
		JPanel controls_HTpanel = new JPanel();
		controls_HTpanel.setMaximumSize(new Dimension(32767, 12000));
		panel_MainFeed.add(controls_HTpanel);
		controls_HTpanel.setLayout(null);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setIcon(new ImageIcon(this.getClass().getResource("settings26.png")));
		label_11.setBounds(6, 0, 26, 26);
		controls_HTpanel.add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon(this.getClass().getResource("write.png")));
		label_12.setBounds(246, 0, 26, 26);
		controls_HTpanel.add(label_12);
		
		user1_HTpanel = new JPanel();
		user1_HTpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_MainFeed.add(user1_HTpanel);
		user1_HTpanel.setLayout(null);
		
		JLabel user1_icon = new JLabel("New label");
		user1_icon.setIcon(new ImageIcon(this.getClass().getResource("default_avatar45.png")));
		user1_icon.setBounds(6, 6, 45, 45);
		user1_HTpanel.add(user1_icon);
		
		JLabel user1_name = new JLabel("Ann Barber");
		user1_name.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		user1_name.setBounds(56, 6, 105, 16);
		user1_HTpanel.add(user1_name);
		
		JLabel user1_handle = new JLabel("@userhandle");
		user1_handle.setBounds(148, 6, 110, 16);
		user1_HTpanel.add(user1_handle);
		
		JLabel user1_time = new JLabel("3h");
		user1_time.setHorizontalAlignment(SwingConstants.RIGHT);
		user1_time.setBounds(230, 6, 42, 16);
		user1_HTpanel.add(user1_time);
		
		user1_post = new JTextPane();
		user1_post.setBackground(SystemColor.window);
		user1_post.setEditable(false);
		user1_post.setText("test test test test test test test test test test test test test test test \n\n");
		user1_post.setBounds(56, 25, 202, 57);
		user1_HTpanel.add(user1_post);
		
		
		user2_HTpanel = new JPanel();
		user2_HTpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_MainFeed.add(user2_HTpanel);
		user2_HTpanel.setLayout(null);
		
		JLabel user2_name = new JLabel("User Name");
		user2_name.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		user2_name.setBounds(56, 6, 105, 16);
		user2_HTpanel.add(user2_name);
		
		JLabel user2_handle = new JLabel("@userhandle");
		user2_handle.setBounds(148, 6, 110, 16);
		user2_HTpanel.add(user2_handle);
		
		JLabel user2_time = new JLabel("4h");
		user2_time.setHorizontalAlignment(SwingConstants.RIGHT);
		user2_time.setBounds(230, 6, 42, 16);
		user2_HTpanel.add(user2_time);
		
		JLabel user2_icon = new JLabel("New label");
		user2_icon.setIcon(new ImageIcon(this.getClass().getResource("default_avatar45.png")));
		user2_icon.setBounds(6, 6, 45, 45);
		user2_HTpanel.add(user2_icon);
		
		user2_post = new JTextPane();
		user2_post.setText("test test test test test test test test test test test test test test test #hashtag\n\n\n");
		user2_post.setEditable(false);
		user2_post.setBackground(SystemColor.window);
		user2_post.setBounds(56, 25, 202, 57);
		user2_HTpanel.add(user2_post);
		
		user3_HTpanel = new JPanel();
		user3_HTpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_MainFeed.add(user3_HTpanel);
		user3_HTpanel.setLayout(null);
		
		JLabel user3_name = new JLabel("User Name");
		user3_name.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		user3_name.setBounds(56, 6, 105, 16);
		user3_HTpanel.add(user3_name);
		
		JLabel user3_handle = new JLabel("@userhandle");
		user3_handle.setBounds(148, 6, 110, 16);
		user3_HTpanel.add(user3_handle);
		
		JLabel user3_time = new JLabel("4h");
		user3_time.setHorizontalAlignment(SwingConstants.RIGHT);
		user3_time.setBounds(230, 6, 42, 16);
		user3_HTpanel.add(user3_time);
		
		JLabel user3_icon = new JLabel("New label");
		user3_icon.setIcon(new ImageIcon(this.getClass().getResource("default_avatar45.png")));
		user3_icon.setBounds(6, 6, 45, 45);
		user3_HTpanel.add(user3_icon);
		
		user3_post = new JTextPane();
		user3_post.setText("test test test test test test test test test test test test test test test \n\n");
		user3_post.setEditable(false);
		user3_post.setBackground(SystemColor.window);
		user3_post.setBounds(56, 25, 202, 57);
		user3_HTpanel.add(user3_post);
		
		user4_HTpanel = new JPanel();
		user4_HTpanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_MainFeed.add(user4_HTpanel);
		user4_HTpanel.setLayout(null);
		
		JLabel user4_name = new JLabel("User Name");
		user4_name.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		user4_name.setBounds(56, 6, 105, 16);
		user4_HTpanel.add(user4_name);
		
		JLabel user4_handle = new JLabel("@userhandle");
		user4_handle.setBounds(148, 6, 110, 16);
		user4_HTpanel.add(user4_handle);
		
		JLabel user4_time = new JLabel("4h");
		user4_time.setHorizontalAlignment(SwingConstants.RIGHT);
		user4_time.setBounds(230, 6, 42, 16);
		user4_HTpanel.add(user4_time);
		
		JLabel user4_icon = new JLabel("New label");
		user4_icon.setIcon(new ImageIcon(this.getClass().getResource("default_avatar45.png")));
		user4_icon.setBounds(6, 6, 45, 45);
		user4_HTpanel.add(user4_icon);
		
		user4_post = new JTextPane();
		user4_post.setText("test test test test test test test test test test test test test test test \n\n");
		user4_post.setEditable(false);
		user4_post.setBackground(SystemColor.window);
		user4_post.setBounds(56, 31, 202, 57);
		user4_HTpanel.add(user4_post);
		
		JPanel panel_CustFeed1 = new JPanel();
		tabbedPane_2.addTab("CUSTOM FEED1", null, panel_CustFeed1, null);
		panel_CustFeed1.setLayout(null);
		panel_8.setLayout(null);
		panel_8.setMaximumSize(new Dimension(32767, 12000));
		panel_8.setBounds(0, 0, 294, 33);
		
		panel_CustFeed1.add(panel_8);
		label_23.setBounds(6, 0, 26, 26);
		label_23.setIcon(new ImageIcon(this.getClass().getResource("settings26.png")));
		panel_8.add(label_23);
		label_24.setBounds(246, 0, 26, 26);
		label_24.setIcon(new ImageIcon(this.getClass().getResource("write.png")));
		panel_8.add(label_24);
		panel_9.setLayout(null);
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_9.setBounds(0, 33, 294, 88);
		
		panel_CustFeed1.add(panel_9);
		label_26.setBounds(6, 6, 45, 45);
		
		panel_9.add(label_26);
		label_27.setFont(new Font("Dialog", Font.BOLD, 13));
		label_27.setBounds(56, 6, 105, 16);
		
		panel_9.add(label_27);
		label_28.setBounds(148, 6, 110, 16);
		
		panel_9.add(label_28);
		label_29.setHorizontalAlignment(SwingConstants.RIGHT);
		label_29.setBounds(230, 6, 42, 16);
		
		panel_9.add(label_29);
		textPane_1.setText("test test test test test test test test test test test test test test test \n\n");
		textPane_1.setEditable(false);
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setBounds(56, 25, 202, 57);
		
		panel_9.add(textPane_1);
		panel_10.setLayout(null);
		panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_10.setBounds(0, 209, 294, 88);
		
		panel_CustFeed1.add(panel_10);
		label_30.setFont(new Font("Dialog", Font.BOLD, 13));
		label_30.setBounds(56, 6, 105, 16);
		
		panel_10.add(label_30);
		label_31.setBounds(148, 6, 110, 16);
		
		panel_10.add(label_31);
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setBounds(230, 6, 42, 16);
		
		panel_10.add(label_32);
		label_33.setBounds(6, 6, 45, 45);
		
		panel_10.add(label_33);
		textPane_2.setText("test test test test test test test test test test test test test test test \n\n");
		textPane_2.setEditable(false);
		textPane_2.setBackground(Color.WHITE);
		textPane_2.setBounds(56, 25, 202, 57);
		
		panel_10.add(textPane_2);
		panel_11.setLayout(null);
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_11.setBounds(0, 122, 294, 88);
		
		panel_CustFeed1.add(panel_11);
		label_34.setBounds(6, 6, 45, 45);
		
		panel_11.add(label_34);
		label_35.setFont(new Font("Dialog", Font.BOLD, 13));
		label_35.setBounds(56, 6, 105, 16);
		
		panel_11.add(label_35);
		label_36.setBounds(148, 6, 110, 16);
		
		panel_11.add(label_36);
		label_37.setHorizontalAlignment(SwingConstants.RIGHT);
		label_37.setBounds(230, 6, 42, 16);
		
		panel_11.add(label_37);
		textPane_3.setText("test test test test test test test test test test test test test test test \n\n");
		textPane_3.setEditable(false);
		textPane_3.setBackground(Color.WHITE);
		textPane_3.setBounds(56, 25, 202, 57);
		
		panel_11.add(textPane_3);
		panel_12.setLayout(null);
		panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_12.setBounds(0, 299, 294, 88);
		
		panel_CustFeed1.add(panel_12);
		label_38.setBounds(6, 6, 45, 45);
		
		panel_12.add(label_38);
		label_39.setFont(new Font("Dialog", Font.BOLD, 13));
		label_39.setBounds(56, 6, 105, 16);
		
		panel_12.add(label_39);
		label_40.setBounds(148, 6, 110, 16);
		
		panel_12.add(label_40);
		label_41.setHorizontalAlignment(SwingConstants.RIGHT);
		label_41.setBounds(230, 6, 42, 16);
		
		panel_12.add(label_41);
		textPane_4.setText("test test test test test test test test test test test test test test test \n\n");
		textPane_4.setEditable(false);
		textPane_4.setBackground(Color.WHITE);
		textPane_4.setBounds(56, 25, 202, 57);
		
		panel_12.add(textPane_4);
		
		JPanel settings_panel = new JPanel();
		
		
		
		
		/************************************ my part*************************************/
		JPanel searchtabPanel = new JPanel();
		searchtabPanel.setBackground(Color.WHITE);
		ImageIcon tab2Icon = new ImageIcon(this.getClass().getResource("search.png"));
		tabbedPane.addTab("", tab2Icon, searchtabPanel, null);
		searchtabPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "trending"}));
		comboBox.setAutoscrolls(true);
		AutoCompleteDecorator.decorate(comboBox);
		comboBox.setBackground(SystemColor.activeCaption);
		comboBox.setEditable(true);
		comboBox.setBounds(0, 0, 299, 30);
		searchtabPanel.add(comboBox);
		
		JPanel searchmainPanel = new JPanel();
		searchmainPanel.setBounds(0, 29, 299, 386);
		searchtabPanel.add(searchmainPanel);
		searchmainPanel.setLayout(new CardLayout(0,0));
		
		JTabbedPane blanksearchTab = new JTabbedPane(JTabbedPane.TOP);
		blanksearchTab.setBounds(-10010, -10062, 299, 386);
		searchmainPanel.add(blanksearchTab, "blank");
		
		JPanel suggestionsPanel = new JPanel();
		blanksearchTab.addTab("Suggestions", null, suggestionsPanel, null);
		suggestionsPanel.setLayout(null);
		
		JButton butnpic100 = new JButton("New button");
		
		JButton butnpic101 = new JButton("New button");
		butnpic101.setBounds(10, 69, 51, 47);
		suggestionsPanel.add(butnpic101);
		
		JButton butnpic102 = new JButton("New button");
		butnpic102.setBounds(10, 127, 51, 47);
		suggestionsPanel.add(butnpic102);
		
		JButton btnpic103 = new JButton("New button");
		btnpic103.setBounds(10, 185, 51, 47);
		suggestionsPanel.add(btnpic103);
		
		JButton btnpic104 = new JButton("New button");
		btnpic104.setBounds(10, 243, 51, 47);
		suggestionsPanel.add(btnpic104);
		
		JButton btnpic105 = new JButton("New button");
		btnpic105.setBounds(10, 301, 51, 47);
		suggestionsPanel.add(btnpic105);
		btnHanGo.setMargin(new Insets(2, 0, 2, 0));
		btnHanGo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHanGo.setHorizontalAlignment(SwingConstants.LEFT);
		btnHanGo.setContentAreaFilled(false);
		btnHanGo.setBorderPainted(false);
		btnHanGo.setBounds(67, 11, 75, 17);
		
		suggestionsPanel.add(btnHanGo);
		btnBottNar.setMargin(new Insets(2, 0, 2, 0));
		btnBottNar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBottNar.setContentAreaFilled(false);
		btnBottNar.setBorderPainted(false);
		btnBottNar.setBounds(67, 70, 89, 17);
		
		suggestionsPanel.add(btnBottNar);
		btnAleeBane.setMargin(new Insets(2, 0, 2, 0));
		btnAleeBane.setHorizontalAlignment(SwingConstants.LEFT);
		btnAleeBane.setContentAreaFilled(false);
		btnAleeBane.setBorderPainted(false);
		btnAleeBane.setBounds(67, 127, 75, 17);
		
		suggestionsPanel.add(btnAleeBane);
		btnPenCli.setMargin(new Insets(2, 0, 2, 0));
		btnPenCli.setHorizontalAlignment(SwingConstants.LEFT);
		btnPenCli.setContentAreaFilled(false);
		btnPenCli.setBorderPainted(false);
		btnPenCli.setBounds(67, 185, 89, 17);
		
		suggestionsPanel.add(btnPenCli);
		btnSidLui.setMargin(new Insets(2, 0, 2, 0));
		btnSidLui.setHorizontalAlignment(SwingConstants.LEFT);
		btnSidLui.setContentAreaFilled(false);
		btnSidLui.setBorderPainted(false);
		btnSidLui.setBounds(67, 243, 75, 17);
		
		suggestionsPanel.add(btnSidLui);
		btnNando2.setMargin(new Insets(2, 0, 2, 0));
		btnNando2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNando2.setContentAreaFilled(false);
		btnNando2.setBorderPainted(false);
		btnNando2.setBounds(67, 301, 89, 17);
		
		suggestionsPanel.add(btnNando2);
		
		JButton btnhelloGoodDay = new JButton("Hello, good day, goodbye ");
		btnhelloGoodDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnhelloGoodDay.setMargin(new Insets(2, 0, 2, 0));
		btnhelloGoodDay.setHorizontalTextPosition(SwingConstants.CENTER);
		btnhelloGoodDay.setHorizontalAlignment(SwingConstants.LEFT);
		btnhelloGoodDay.setContentAreaFilled(false);
		btnhelloGoodDay.setBorderPainted(false);
		btnhelloGoodDay.setBounds(67, 23, 150, 35);
		suggestionsPanel.add(btnhelloGoodDay);
		
		JButton btnTag1 = new JButton("#Trending");
		btnTag1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTag1.setMargin(new Insets(2, 0, 2, 0));
		btnTag1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTag1.setHorizontalAlignment(SwingConstants.LEFT);
		btnTag1.setContentAreaFilled(false);
		btnTag1.setBorderPainted(false);
		btnTag1.setBounds(209, 29, 75, 23);
		suggestionsPanel.add(btnTag1);
		btnIWantChocolate.setMargin(new Insets(2, 0, 2, 0));
		btnIWantChocolate.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIWantChocolate.setHorizontalAlignment(SwingConstants.LEFT);
		btnIWantChocolate.setContentAreaFilled(false);
		btnIWantChocolate.setBorderPainted(false);
		btnIWantChocolate.setBounds(67, 81, 150, 35);
		
		suggestionsPanel.add(btnIWantChocolate);
		btnHowDoYou.setMargin(new Insets(2, 0, 2, 0));
		btnHowDoYou.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHowDoYou.setHorizontalAlignment(SwingConstants.LEFT);
		btnHowDoYou.setContentAreaFilled(false);
		btnHowDoYou.setBorderPainted(false);
		btnHowDoYou.setBounds(67, 139, 108, 35);
		
		suggestionsPanel.add(btnHowDoYou);
		btnRomeoAndJuliet.setMargin(new Insets(2, 0, 2, 0));
		btnRomeoAndJuliet.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRomeoAndJuliet.setHorizontalAlignment(SwingConstants.LEFT);
		btnRomeoAndJuliet.setContentAreaFilled(false);
		btnRomeoAndJuliet.setBorderPainted(false);
		btnRomeoAndJuliet.setBounds(67, 197, 150, 35);
		
		suggestionsPanel.add(btnRomeoAndJuliet);
		
		JButton btnCatsAreCool = new JButton("cats are cool");
		btnCatsAreCool.setMargin(new Insets(2, 0, 2, 0));
		btnCatsAreCool.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCatsAreCool.setHorizontalAlignment(SwingConstants.LEFT);
		btnCatsAreCool.setContentAreaFilled(false);
		btnCatsAreCool.setBorderPainted(false);
		btnCatsAreCool.setBounds(67, 255, 89, 35);
		suggestionsPanel.add(btnCatsAreCool);
		
		JButton btnTomorrowWillCome = new JButton("tomorrow will come");
		btnTomorrowWillCome.setMargin(new Insets(2, 0, 2, 0));
		btnTomorrowWillCome.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTomorrowWillCome.setHorizontalAlignment(SwingConstants.LEFT);
		btnTomorrowWillCome.setContentAreaFilled(false);
		btnTomorrowWillCome.setBorderPainted(false);
		btnTomorrowWillCome.setBounds(67, 313, 150, 35);
		suggestionsPanel.add(btnTomorrowWillCome);
		
		JButton btntag2 = new JButton("#Trending");
		btntag2.setMargin(new Insets(2, 0, 2, 0));
		btntag2.setHorizontalTextPosition(SwingConstants.CENTER);
		btntag2.setHorizontalAlignment(SwingConstants.LEFT);
		btntag2.setContentAreaFilled(false);
		btntag2.setBorderPainted(false);
		btntag2.setBounds(209, 203, 75, 23);
		suggestionsPanel.add(btntag2);
		
		JButton btncool = new JButton("#cool");
		btncool.setMargin(new Insets(2, 0, 2, 0));
		btncool.setHorizontalTextPosition(SwingConstants.CENTER);
		btncool.setHorizontalAlignment(SwingConstants.LEFT);
		btncool.setContentAreaFilled(false);
		btncool.setBorderPainted(false);
		btncool.setBounds(150, 145, 75, 23);
		suggestionsPanel.add(btncool);
		
		JButton btncooltag = new JButton("#cool");
		btncooltag.setMargin(new Insets(2, 0, 2, 0));
		btncooltag.setHorizontalTextPosition(SwingConstants.CENTER);
		btncooltag.setHorizontalAlignment(SwingConstants.LEFT);
		btncooltag.setContentAreaFilled(false);
		btncooltag.setBorderPainted(false);
		btncooltag.setBounds(179, 261, 75, 23);
		suggestionsPanel.add(btncooltag);
		
		JButton btncats = new JButton("#cats");
		btncats.setMargin(new Insets(2, 0, 2, 0));
		btncats.setHorizontalTextPosition(SwingConstants.CENTER);
		btncats.setHorizontalAlignment(SwingConstants.LEFT);
		btncats.setContentAreaFilled(false);
		btncats.setBorderPainted(false);
		btncats.setBounds(145, 261, 75, 23);
		suggestionsPanel.add(btncats);
		
		JButton btnliving = new JButton("#living");
		btnliving.setMargin(new Insets(2, 0, 2, 0));
		btnliving.setHorizontalTextPosition(SwingConstants.CENTER);
		btnliving.setHorizontalAlignment(SwingConstants.LEFT);
		btnliving.setContentAreaFilled(false);
		btnliving.setBorderPainted(false);
		btnliving.setBounds(182, 319, 75, 23);
		suggestionsPanel.add(btnliving);
		
		JPanel popularPanel = new JPanel();
		blanksearchTab.addTab("Popular", null, popularPanel, null);
		popularPanel.setLayout(null);
		profPic11.setBounds(10, 11, 51, 47);
		
		popularPanel.add(profPic11);
		profPic9.setBounds(10, 69, 51, 47);
		
		popularPanel.add(profPic9);
		profPic10.setBounds(10, 127, 51, 47);
		
		popularPanel.add(profPic10);
		profPic12.setBounds(10, 185, 51, 47);
		
		popularPanel.add(profPic12);
		profPic13.setBounds(10, 243, 51, 47);
		
		popularPanel.add(profPic13);
		profPic14.setBounds(10, 301, 51, 47);
		
		popularPanel.add(profPic14);
		profPic15.setMargin(new Insets(2, 0, 2, 0));
		profPic15.setHorizontalTextPosition(SwingConstants.CENTER);
		profPic15.setHorizontalAlignment(SwingConstants.LEFT);
		profPic15.setContentAreaFilled(false);
		profPic15.setBorderPainted(false);
		profPic15.setBounds(64, 11, 75, 17);
		
		popularPanel.add(profPic15);
		btnS.setMargin(new Insets(2, 0, 2, 0));
		btnS.setHorizontalAlignment(SwingConstants.LEFT);
		btnS.setContentAreaFilled(false);
		btnS.setBorderPainted(false);
		btnS.setBounds(64, 70, 89, 17);
		
		popularPanel.add(btnS);
		buttnrnew14.setMargin(new Insets(2, 0, 2, 0));
		buttnrnew14.setHorizontalAlignment(SwingConstants.LEFT);
		buttnrnew14.setContentAreaFilled(false);
		buttnrnew14.setBorderPainted(false);
		buttnrnew14.setBounds(64, 127, 75, 17);
		
		popularPanel.add(buttnrnew14);
		btnElanIrun.setMargin(new Insets(2, 0, 2, 0));
		btnElanIrun.setHorizontalAlignment(SwingConstants.LEFT);
		btnElanIrun.setContentAreaFilled(false);
		btnElanIrun.setBorderPainted(false);
		btnElanIrun.setBounds(64, 185, 89, 17);
		
		popularPanel.add(btnElanIrun);
		btnMaryHas.setMargin(new Insets(2, 0, 2, 0));
		btnMaryHas.setHorizontalAlignment(SwingConstants.LEFT);
		btnMaryHas.setContentAreaFilled(false);
		btnMaryHas.setBorderPainted(false);
		btnMaryHas.setBounds(64, 243, 75, 17);
		
		popularPanel.add(btnMaryHas);
		btnNanDo.setMargin(new Insets(2, 0, 2, 0));
		btnNanDo.setHorizontalAlignment(SwingConstants.LEFT);
		btnNanDo.setContentAreaFilled(false);
		btnNanDo.setBorderPainted(false);
		btnNanDo.setBounds(64, 301, 89, 17);
		
		popularPanel.add(btnNanDo);
		
		JButton btnpost1 = new JButton("Hello, good day, goodbye ");
		btnpost1.setMargin(new Insets(2, 0, 2, 0));
		btnpost1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost1.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost1.setContentAreaFilled(false);
		btnpost1.setBorderPainted(false);
		btnpost1.setBounds(64, 23, 150, 35);
		popularPanel.add(btnpost1);
		
		JButton btnpost2 = new JButton("#Trending");
		btnpost2.setMargin(new Insets(2, 0, 2, 0));
		btnpost2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost2.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost2.setContentAreaFilled(false);
		btnpost2.setBorderPainted(false);
		btnpost2.setBounds(206, 29, 75, 23);
		popularPanel.add(btnpost2);
		
		JButton btnpost3 = new JButton("I want chocolate");
		btnpost3.setMargin(new Insets(2, 0, 2, 0));
		btnpost3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost3.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost3.setContentAreaFilled(false);
		btnpost3.setBorderPainted(false);
		btnpost3.setBounds(64, 81, 150, 35);
		popularPanel.add(btnpost3);
		
		JButton btnpost4 = new JButton("how do you do");
		btnpost4.setMargin(new Insets(2, 0, 2, 0));
		btnpost4.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost4.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost4.setContentAreaFilled(false);
		btnpost4.setBorderPainted(false);
		btnpost4.setBounds(64, 139, 108, 35);
		popularPanel.add(btnpost4);
		
		JButton btnpost5 = new JButton("#cool");
		btnpost5.setMargin(new Insets(2, 0, 2, 0));
		btnpost5.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost5.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost5.setContentAreaFilled(false);
		btnpost5.setBorderPainted(false);
		btnpost5.setBounds(147, 145, 75, 23);
		popularPanel.add(btnpost5);
		
		JButton btnpost6 = new JButton("mcmaster exam season");
		btnpost6.setMargin(new Insets(2, 0, 2, 0));
		btnpost6.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost6.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost6.setContentAreaFilled(false);
		btnpost6.setBorderPainted(false);
		btnpost6.setBounds(64, 197, 150, 35);
		popularPanel.add(btnpost6);
		
		JButton btnpost7 = new JButton("#Trending");
		btnpost7.setMargin(new Insets(2, 0, 2, 0));
		btnpost7.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost7.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost7.setContentAreaFilled(false);
		btnpost7.setBorderPainted(false);
		btnpost7.setBounds(206, 203, 75, 23);
		popularPanel.add(btnpost7);
		
		JButton butnpost8 = new JButton("Hello, good day, goodbye ");
		butnpost8.setMargin(new Insets(2, 0, 2, 0));
		butnpost8.setHorizontalTextPosition(SwingConstants.CENTER);
		butnpost8.setHorizontalAlignment(SwingConstants.LEFT);
		butnpost8.setContentAreaFilled(false);
		butnpost8.setBorderPainted(false);
		butnpost8.setBounds(64, 255, 150, 35);
		popularPanel.add(butnpost8);
		
		JButton btnpost9 = new JButton("Hello, good day, goodbye ");
		btnpost9.setMargin(new Insets(2, 0, 2, 0));
		btnpost9.setHorizontalTextPosition(SwingConstants.CENTER);
		btnpost9.setHorizontalAlignment(SwingConstants.LEFT);
		btnpost9.setContentAreaFilled(false);
		btnpost9.setBorderPainted(false);
		btnpost9.setBounds(64, 313, 150, 35);
		popularPanel.add(btnpost9);
		
		JPanel searchblankCard = new JPanel();
		searchblankCard.setBounds(-10010, -10062, 299, 386);
		searchmainPanel.add(searchblankCard, "nothing");
		
		JTabbedPane searchTrending = new JTabbedPane(JTabbedPane.TOP);
		searchTrending.setBounds(-10010, -10062, 299, 386);
		searchmainPanel.add(searchTrending, "Trending");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		searchTrending.addTab("People", null, scrollPane_2, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		scrollPane_2.setViewportView(panel_4);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(10, 11, 56, 55);
		panel_4.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(10, 88, 56, 55);
		panel_4.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(10, 169, 56, 55);
		panel_4.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(10, 253, 56, 55);
		panel_4.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(10, 324, 56, 55);
		panel_4.add(button_26);
		btnTrendingposts.setBounds(76, 27, 120, 23);
		
		panel_4.add(btnTrendingposts);
		btnTrendingDave.setBounds(76, 181, 120, 23);
		
		panel_4.add(btnTrendingDave);
		btnMrtrending.setBounds(76, 106, 120, 23);
		
		panel_4.add(btnMrtrending);
		btnTrendingMan.setBounds(76, 270, 120, 23);
		
		panel_4.add(btnTrendingMan);
		btnTreening.setBounds(76, 343, 120, 23);
		
		panel_4.add(btnTreening);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		searchTrending.addTab("Tags", null, scrollPane_3, null);
		panel_5.setLayout(null);
		
		scrollPane_3.setViewportView(panel_5);
		button_27.setBounds(10, 11, 51, 47);
		
		panel_5.add(button_27);
		button_28.setMargin(new Insets(2, 0, 2, 0));
		button_28.setHorizontalTextPosition(SwingConstants.CENTER);
		button_28.setHorizontalAlignment(SwingConstants.LEFT);
		button_28.setContentAreaFilled(false);
		button_28.setBorderPainted(false);
		button_28.setBounds(64, 11, 75, 17);
		
		panel_5.add(button_28);
		button_29.setMargin(new Insets(2, 0, 2, 0));
		button_29.setHorizontalTextPosition(SwingConstants.CENTER);
		button_29.setHorizontalAlignment(SwingConstants.LEFT);
		button_29.setContentAreaFilled(false);
		button_29.setBorderPainted(false);
		button_29.setBounds(64, 23, 150, 35);
		
		panel_5.add(button_29);
		button_30.setMargin(new Insets(2, 0, 2, 0));
		button_30.setHorizontalTextPosition(SwingConstants.CENTER);
		button_30.setHorizontalAlignment(SwingConstants.LEFT);
		button_30.setContentAreaFilled(false);
		button_30.setBorderPainted(false);
		button_30.setBounds(206, 29, 75, 23);
		
		panel_5.add(button_30);
		button_31.setBounds(10, 69, 51, 47);
		
		panel_5.add(button_31);
		button_32.setMargin(new Insets(2, 0, 2, 0));
		button_32.setHorizontalAlignment(SwingConstants.LEFT);
		button_32.setContentAreaFilled(false);
		button_32.setBorderPainted(false);
		button_32.setBounds(64, 70, 89, 17);
		
		panel_5.add(button_32);
		button_33.setBounds(10, 127, 51, 47);
		
		panel_5.add(button_33);
		button_34.setBounds(10, 185, 51, 47);
		
		panel_5.add(button_34);
		button_35.setMargin(new Insets(2, 0, 2, 0));
		button_35.setHorizontalAlignment(SwingConstants.LEFT);
		button_35.setContentAreaFilled(false);
		button_35.setBorderPainted(false);
		button_35.setBounds(64, 185, 89, 17);
		
		panel_5.add(button_35);
		button_36.setMargin(new Insets(2, 0, 2, 0));
		button_36.setHorizontalTextPosition(SwingConstants.CENTER);
		button_36.setHorizontalAlignment(SwingConstants.LEFT);
		button_36.setContentAreaFilled(false);
		button_36.setBorderPainted(false);
		button_36.setBounds(64, 197, 150, 35);
		
		panel_5.add(button_36);
		button_37.setMargin(new Insets(2, 0, 2, 0));
		button_37.setHorizontalTextPosition(SwingConstants.CENTER);
		button_37.setHorizontalAlignment(SwingConstants.LEFT);
		button_37.setContentAreaFilled(false);
		button_37.setBorderPainted(false);
		button_37.setBounds(206, 203, 75, 23);
		
		panel_5.add(button_37);
		button_38.setMargin(new Insets(2, 0, 2, 0));
		button_38.setHorizontalTextPosition(SwingConstants.CENTER);
		button_38.setHorizontalAlignment(SwingConstants.LEFT);
		button_38.setContentAreaFilled(false);
		button_38.setBorderPainted(false);
		button_38.setBounds(64, 81, 150, 35);
		
		panel_5.add(button_38);
		button_39.setMargin(new Insets(2, 0, 2, 0));
		button_39.setHorizontalTextPosition(SwingConstants.CENTER);
		button_39.setHorizontalAlignment(SwingConstants.LEFT);
		button_39.setContentAreaFilled(false);
		button_39.setBorderPainted(false);
		button_39.setBounds(64, 139, 150, 35);
		
		panel_5.add(button_39);
		button_40.setBounds(10, 243, 51, 47);
		
		panel_5.add(button_40);
		button_41.setBounds(10, 309, 51, 47);
		
		panel_5.add(button_41);
		button_42.setMargin(new Insets(2, 0, 2, 0));
		button_42.setHorizontalAlignment(SwingConstants.LEFT);
		button_42.setContentAreaFilled(false);
		button_42.setBorderPainted(false);
		button_42.setBounds(64, 127, 89, 17);
		
		panel_5.add(button_42);
		button_43.setMargin(new Insets(2, 0, 2, 0));
		button_43.setHorizontalAlignment(SwingConstants.LEFT);
		button_43.setContentAreaFilled(false);
		button_43.setBorderPainted(false);
		button_43.setBounds(64, 243, 89, 17);
		
		panel_5.add(button_43);
		button_44.setMargin(new Insets(2, 0, 2, 0));
		button_44.setHorizontalTextPosition(SwingConstants.CENTER);
		button_44.setHorizontalAlignment(SwingConstants.LEFT);
		button_44.setContentAreaFilled(false);
		button_44.setBorderPainted(false);
		button_44.setBounds(64, 255, 150, 35);
		
		panel_5.add(button_44);
		button_45.setMargin(new Insets(2, 0, 2, 0));
		button_45.setHorizontalTextPosition(SwingConstants.CENTER);
		button_45.setHorizontalAlignment(SwingConstants.LEFT);
		button_45.setContentAreaFilled(false);
		button_45.setBorderPainted(false);
		button_45.setBounds(64, 321, 150, 35);
		
		panel_5.add(button_45);
		button_46.setMargin(new Insets(2, 0, 2, 0));
		button_46.setHorizontalAlignment(SwingConstants.LEFT);
		button_46.setContentAreaFilled(false);
		button_46.setBorderPainted(false);
		button_46.setBounds(64, 309, 89, 17);
		
		panel_5.add(button_46);
		button_47.setMargin(new Insets(2, 0, 2, 0));
		button_47.setHorizontalTextPosition(SwingConstants.CENTER);
		button_47.setHorizontalAlignment(SwingConstants.LEFT);
		button_47.setContentAreaFilled(false);
		button_47.setBorderPainted(false);
		button_47.setBounds(206, 261, 75, 23);
		
		panel_5.add(button_47);
		button_48.setMargin(new Insets(2, 0, 2, 0));
		button_48.setHorizontalTextPosition(SwingConstants.CENTER);
		button_48.setHorizontalAlignment(SwingConstants.LEFT);
		button_48.setContentAreaFilled(false);
		button_48.setBorderPainted(false);
		button_48.setBounds(206, 321, 75, 23);
		
		panel_5.add(button_48);
		button_49.setMargin(new Insets(2, 0, 2, 0));
		button_49.setHorizontalTextPosition(SwingConstants.CENTER);
		button_49.setHorizontalAlignment(SwingConstants.LEFT);
		button_49.setContentAreaFilled(false);
		button_49.setBorderPainted(false);
		button_49.setBounds(206, 145, 75, 23);
		
		panel_5.add(button_49);
		button_50.setMargin(new Insets(2, 0, 2, 0));
		button_50.setHorizontalTextPosition(SwingConstants.CENTER);
		button_50.setHorizontalAlignment(SwingConstants.LEFT);
		button_50.setContentAreaFilled(false);
		button_50.setBorderPainted(false);
		button_50.setBounds(206, 87, 75, 23);
		
		panel_5.add(button_50);

		/*********************SEARCH BOX CODE***************************************/
		if (comboBox.getSelectedItem() == "") {
		}
		
		
		
		ImageIcon tab3Icon = new ImageIcon(this.getClass().getResource("bell.png"));
		tabbedPane.addTab("", tab3Icon, notiftabPanel, null);
		notiftabPanel.setLayout(new CardLayout(0, 0));
		
		JTabbedPane notiftaaabPane = new JTabbedPane(JTabbedPane.TOP);
		notiftaaabPane.setBackground(Color.WHITE);
		notiftaaabPane.setBorder(null);
		notiftabPanel.add(notiftaaabPane, "Notif");
		
		JScrollPane followingtabPanel = new JScrollPane();
		followingtabPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		followingtabPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		followingtabPanel.setBackground(Color.WHITE);
		followingtabPanel.setBounds(10, 63, 320, 700);
		followingtabPanel.setViewportView(followingNotifsPanel);   
		notiftaaabPane.addTab("Following", null, followingtabPanel, null);
		followingtabPanel.setViewportView(followingNotifsPanel);
		followingNotifsPanel.setLayout(null);
		
		
		ProfName1.setHorizontalTextPosition(SwingConstants.CENTER);
		ProfName1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ProfName1.setBorderPainted(false);
		ProfName1.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName1.setMargin(new Insets(2, 0, 2, 0));
		ProfName1.setContentAreaFilled(false);
		ProfName1.setBounds(59, 20, 75, 23);
		
		followingNotifsPanel.add(ProfName1);
		ProfName2.setBorderPainted(false);
		ProfName2.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName2.setMargin(new Insets(2, 0, 2, 0));
		ProfName2.setContentAreaFilled(false);
		ProfName2.setBounds(59, 71, 89, 23);
		
		followingNotifsPanel.add(ProfName2);
		ProfName3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ProfName3.setBorderPainted(false);
		ProfName3.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName3.setMargin(new Insets(2, 0, 2, 0));
		ProfName3.setContentAreaFilled(false);
		ProfName3.setBounds(59, 122, 75, 23);
		
		followingNotifsPanel.add(ProfName3);
		ProfName4.setBorderPainted(false);
		ProfName4.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName4.setMargin(new Insets(2, 0, 2, 0));
		ProfName4.setContentAreaFilled(false);
		ProfName4.setBounds(59, 173, 89, 23);
		
		followingNotifsPanel.add(ProfName4);
		ProfName5.setBorderPainted(false);
		ProfName5.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName5.setMargin(new Insets(2, 0, 2, 0));
		ProfName5.setContentAreaFilled(false);
		ProfName5.setBounds(59, 224, 75, 23);
		
		followingNotifsPanel.add(ProfName5);
		ProfName6.setBorderPainted(false);
		ProfName6.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName6.setMargin(new Insets(2, 0, 2, 0));
		ProfName6.setContentAreaFilled(false);
		ProfName6.setBounds(59, 275, 75, 23);
		
		followingNotifsPanel.add(ProfName6);
		ProfName7.setBorderPainted(false);
		ProfName7.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName7.setMargin(new Insets(2, 0, 2, 0));
		ProfName7.setContentAreaFilled(false);
		ProfName7.setBounds(59, 326, 89, 23);
		
		followingNotifsPanel.add(ProfName7);
		ProfName8.setBorderPainted(false);
		ProfName8.setHorizontalAlignment(SwingConstants.LEFT);
		ProfName8.setMargin(new Insets(2, 0, 2, 0));
		ProfName8.setContentAreaFilled(false);
		ProfName8.setBounds(59, 377, 82, 23);
		
		followingNotifsPanel.add(ProfName8);
		lblLikes.setBounds(120, 24, 46, 14);
		
		followingNotifsPanel.add(lblLikes);
		lblLikes1.setBounds(140, 75, 46, 14);
		
		followingNotifsPanel.add(lblLikes1);
		lblLikes2.setBounds(127, 228, 46, 14);
		
		followingNotifsPanel.add(lblLikes2);
		lblLikes3.setBounds(132, 330, 46, 14);
		
		followingNotifsPanel.add(lblLikes3);
		
		lblFollowed.setBounds(125, 126, 64, 14);
		followingNotifsPanel.add(lblFollowed);
		
		JLabel lblFollowed2 = new JLabel("followed");
		lblFollowed2.setBounds(130, 177, 66, 14);
		followingNotifsPanel.add(lblFollowed2);
		
		JLabel lblFollowed3 = new JLabel("followed");
		lblFollowed3.setBounds(127, 279, 69, 14);
		followingNotifsPanel.add(lblFollowed3);
		
		JButton pstlink1 = new JButton("\"Today is a good day, tomorrow will be better\"");
		pstlink1.setBorderPainted(false);
		pstlink1.setContentAreaFilled(false);
		pstlink1.setMargin(new Insets(2, 0, 2, 0));
		pstlink1.setHorizontalAlignment(SwingConstants.LEFT);
		pstlink1.setBounds(153, 20, 106, 23);
		followingNotifsPanel.add(pstlink1);
		
		JLabel label_5 = new JLabel("likes");
		label_5.setBounds(137, 381, 46, 14);
		followingNotifsPanel.add(label_5);
		
		JButton pstlink2 = new JButton("\"The weather is atrocious\"");
		pstlink2.setBorderPainted(false);
		pstlink2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		pstlink2.setContentAreaFilled(false);
		pstlink2.setMargin(new Insets(2, 0, 2, 0));
		pstlink2.setHorizontalAlignment(SwingConstants.LEFT);
		pstlink2.setBounds(168, 71, 89, 23);
		followingNotifsPanel.add(pstlink2);
		
		JButton pstlink3 = new JButton("\"Many exams, very little time\"");
		pstlink3.setBorderPainted(false);
		pstlink3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		pstlink3.setContentAreaFilled(false);
		pstlink3.setMargin(new Insets(2, 0, 2, 0));
		pstlink3.setHorizontalAlignment(SwingConstants.LEFT);
		pstlink3.setBounds(160, 224, 89, 23);
		followingNotifsPanel.add(pstlink3);
		
		JLabel timeLabel1 = new JLabel("1h");
		timeLabel1.setBounds(254, 24, 21, 14);
		followingNotifsPanel.add(timeLabel1);
		
		JLabel timeLabel2 = new JLabel("1h");
		timeLabel2.setBounds(254, 75, 21, 14);
		followingNotifsPanel.add(timeLabel2);
		
		JLabel timeLabel3 = new JLabel("1h");
		timeLabel3.setBounds(254, 126, 21, 14);
		followingNotifsPanel.add(timeLabel3);
		
		JLabel timeLabel4 = new JLabel("1h");
		timeLabel4.setBounds(254, 177, 21, 14);
		followingNotifsPanel.add(timeLabel4);
		
		JLabel timeLabel5 = new JLabel("1h");
		timeLabel5.setBounds(254, 228, 21, 14);
		followingNotifsPanel.add(timeLabel5);
		
		JLabel timeLabel6 = new JLabel("1h");
		timeLabel6.setBounds(254, 279, 21, 14);
		followingNotifsPanel.add(timeLabel6);
		
		JLabel timeLabel7 = new JLabel("1h");
		timeLabel7.setBounds(254, 330, 21, 14);
		followingNotifsPanel.add(timeLabel7);
		
		JLabel timeLabel8 = new JLabel("1h");
		timeLabel8.setBounds(254, 381, 21, 14);
		followingNotifsPanel.add(timeLabel8);
		
		JButton pstLink4 = new JButton("\"Coffee is life\"");
		pstLink4.setBorderPainted(false);
		pstLink4.setMargin(new Insets(2, 0, 2, 0));
		pstLink4.setHorizontalAlignment(SwingConstants.LEFT);
		pstLink4.setContentAreaFilled(false);
		pstLink4.setBounds(162, 326, 95, 23);
		followingNotifsPanel.add(pstLink4);
		
		JButton pstLink5 = new JButton("Tommy Hills");
		pstLink5.setBorderPainted(false);
		pstLink5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pstLink5.setMargin(new Insets(2, 0, 2, 0));
		pstLink5.setHorizontalAlignment(SwingConstants.LEFT);
		pstLink5.setContentAreaFilled(false);
		pstLink5.setBounds(178, 122, 75, 23);
		followingNotifsPanel.add(pstLink5);
		
		JButton pstLink6 = new JButton("Timothy Hels");
		pstLink6.setBorderPainted(false);
		pstLink6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pstLink6.setMargin(new Insets(2, 0, 2, 0));
		pstLink6.setHorizontalAlignment(SwingConstants.LEFT);
		pstLink6.setContentAreaFilled(false);
		pstLink6.setBounds(176, 173, 99, 23);
		followingNotifsPanel.add(pstLink6);
		
		JButton pstLink7 = new JButton("Jeane Claud");
		pstLink7.setBorderPainted(false);
		pstLink7.setMargin(new Insets(2, 0, 2, 0));
		pstLink7.setHorizontalAlignment(SwingConstants.LEFT);
		pstLink7.setContentAreaFilled(false);
		pstLink7.setBounds(175, 275, 84, 23);
		followingNotifsPanel.add(pstLink7);
		notiftaaabPane.setBackgroundAt(0, Color.WHITE);
		
		JPanel youtabPanel = new JPanel();
		youtabPanel.setBackground(Color.WHITE);
		notiftaaabPane.addTab("You", null, youtabPanel, null);
		youtabPanel.setLayout(null);
		
		JPanel togglePanels = new JPanel();
		togglePanels.setBounds(0, 46, 294, 341);
		youtabPanel.add(togglePanels);
		togglePanels.setLayout(new CardLayout(0, 0));
		
		JScrollPane mentionPanel = new JScrollPane();
		mentionPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		mentionPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		mentionPanel.setBackground(Color.WHITE);
		togglePanels.add(mentionPanel, "mentionCard");
		
		JPanel panelle = new JPanel();
		mentionPanel.setViewportView(panelle);
		panelle.setLayout(null);
		btntimothery.setMargin(new Insets(2, 0, 2, 0));
		btntimothery.setHorizontalTextPosition(SwingConstants.CENTER);
		btntimothery.setHorizontalAlignment(SwingConstants.LEFT);
		btntimothery.setContentAreaFilled(false);
		btntimothery.setBorderPainted(false);
		btntimothery.setBounds(59, 38, 75, 23);
		
		panelle.add(btntimothery);
		btnpicpic.setBounds(10, 29, 45, 40);
		
		panelle.add(btnpicpic);
		butnpic2.setBounds(10, 80, 45, 40);
		
		panelle.add(butnpic2);
		btnpic3.setMargin(new Insets(2, 0, 2, 0));
		btnpic3.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic3.setContentAreaFilled(false);
		btnpic3.setBorderPainted(false);
		btnpic3.setBounds(59, 89, 89, 23);
		
		panelle.add(btnpic3);
		btnpic4.setBounds(10, 131, 45, 40);
		
		panelle.add(btnpic4);
		btnpic5.setMargin(new Insets(2, 0, 2, 0));
		btnpic5.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic5.setContentAreaFilled(false);
		btnpic5.setBorderPainted(false);
		btnpic5.setBounds(59, 140, 75, 23);
		
		panelle.add(btnpic5);
		btnpic6.setBounds(10, 182, 45, 40);
		
		panelle.add(btnpic6);
		btnpic7.setMargin(new Insets(2, 0, 2, 0));
		btnpic7.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic7.setContentAreaFilled(false);
		btnpic7.setBorderPainted(false);
		btnpic7.setBounds(59, 191, 89, 23);
		
		panelle.add(btnpic7);
		btnpic8.setBounds(10, 233, 45, 40);
		
		panelle.add(btnpic8);
		btnpic9.setMargin(new Insets(2, 0, 2, 0));
		btnpic9.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic9.setContentAreaFilled(false);
		btnpic9.setBorderPainted(false);
		btnpic9.setBounds(59, 242, 75, 23);
		
		panelle.add(btnpic9);
		btnpic10.setMargin(new Insets(2, 0, 2, 0));
		btnpic10.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic10.setContentAreaFilled(false);
		btnpic10.setBorderPainted(false);
		btnpic10.setBounds(59, 293, 75, 23);
		
		panelle.add(btnpic10);
		butnpic11.setMargin(new Insets(2, 0, 2, 0));
		butnpic11.setHorizontalAlignment(SwingConstants.LEFT);
		butnpic11.setContentAreaFilled(false);
		butnpic11.setBorderPainted(false);
		butnpic11.setBounds(59, 344, 89, 23);
		
		panelle.add(butnpic11);
		btnpic12.setMargin(new Insets(2, 0, 2, 0));
		btnpic12.setHorizontalAlignment(SwingConstants.LEFT);
		btnpic12.setContentAreaFilled(false);
		btnpic12.setBorderPainted(false);
		btnpic12.setBounds(59, 395, 82, 23);
		
		panelle.add(btnpic12);
		butnpic13.setBounds(10, 386, 45, 40);
		
		panelle.add(butnpic13);
		btnpic14.setBounds(10, 335, 45, 40);
		
		panelle.add(btnpic14);
		butnpic15.setBounds(10, 284, 45, 40);
		
		panelle.add(butnpic15);
		lblPostsYouHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostsYouHave.setBounds(39, 11, 189, 14);
		
		panelle.add(lblPostsYouHave);
		
		JScrollPane followPanel = new JScrollPane();
		followPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		followPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		followPanel.setBackground(Color.WHITE);
		togglePanels.add(followPanel, "followCard");
		
		JPanel panelle2 = new JPanel();
		followPanel.setViewportView(panelle2);
		panelle2.setLayout(null);
		
		JButton btttttn18 = new JButton();
		btttttn18.setBounds(10, 39, 45, 40);
		panelle2.add(btttttn18);
		
		JButton btttttn19 = new JButton();
		btttttn19.setBounds(10, 90, 45, 40);
		panelle2.add(btttttn19);
		
		JButton btttttn20 = new JButton();
		btttttn20.setBounds(10, 141, 45, 40);
		panelle2.add(btttttn20);
		
		JButton btttttn21 = new JButton();
		btttttn21.setBounds(10, 192, 45, 40);
		panelle2.add(btttttn21);
		
		JButton btttttn22 = new JButton();
		btttttn22.setBounds(10, 243, 45, 40);
		panelle2.add(btttttn22);
		
		JButton btttttn23 = new JButton();
		btttttn23.setBounds(10, 294, 45, 40);
		panelle2.add(btttttn23);
		
		JButton btttttn24 = new JButton();
		btttttn24.setBounds(10, 345, 45, 40);
		panelle2.add(btttttn24);
		
		JButton btttttn25 = new JButton();
		btttttn25.setBounds(10, 396, 45, 40);
		panelle2.add(btttttn25);
		
		JButton btttttn26 = new JButton("Hallow Man");
		btttttn26.setMargin(new Insets(2, 0, 2, 0));
		btttttn26.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn26.setContentAreaFilled(false);
		btttttn26.setBorderPainted(false);
		btttttn26.setBounds(59, 354, 89, 23);
		panelle2.add(btttttn26);
		
		JButton btttttn27 = new JButton("Harry Jane");
		btttttn27.setMargin(new Insets(2, 0, 2, 0));
		btttttn27.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn27.setContentAreaFilled(false);
		btttttn27.setBorderPainted(false);
		btttttn27.setBounds(59, 405, 82, 23);
		panelle2.add(btttttn27);
		
		JButton btttttn28 = new JButton("Penny Bun");
		btttttn28.setMargin(new Insets(2, 0, 2, 0));
		btttttn28.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn28.setContentAreaFilled(false);
		btttttn28.setBorderPainted(false);
		btttttn28.setBounds(59, 303, 75, 23);
		panelle2.add(btttttn28);
		
		JButton btttttn29 = new JButton("Mary Jane");
		btttttn29.setMargin(new Insets(2, 0, 2, 0));
		btttttn29.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn29.setContentAreaFilled(false);
		btttttn29.setBorderPainted(false);
		btttttn29.setBounds(59, 252, 75, 23);
		panelle2.add(btttttn29);
		
		JButton btttttn30 = new JButton("Zane Dylan");
		btttttn30.setMargin(new Insets(2, 0, 2, 0));
		btttttn30.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn30.setContentAreaFilled(false);
		btttttn30.setBorderPainted(false);
		btttttn30.setBounds(59, 201, 89, 23);
		panelle2.add(btttttn30);
		
		JButton btttttn31 = new JButton("Alex Dane");
		btttttn31.setMargin(new Insets(2, 0, 2, 0));
		btttttn31.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn31.setContentAreaFilled(false);
		btttttn31.setBorderPainted(false);
		btttttn31.setBounds(59, 150, 75, 23);
		panelle2.add(btttttn31);
		
		JButton btttttn32 = new JButton("Santa Clause");
		btttttn32.setMargin(new Insets(2, 0, 2, 0));
		btttttn32.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn32.setContentAreaFilled(false);
		btttttn32.setBorderPainted(false);
		btttttn32.setBounds(59, 99, 89, 23);
		panelle2.add(btttttn32);
		
		JButton btttttn33 = new JButton("Tim Holly");
		btttttn33.setMargin(new Insets(2, 0, 2, 0));
		btttttn33.setHorizontalTextPosition(SwingConstants.CENTER);
		btttttn33.setHorizontalAlignment(SwingConstants.LEFT);
		btttttn33.setContentAreaFilled(false);
		btttttn33.setBorderPainted(false);
		btttttn33.setBounds(59, 48, 75, 23);
		panelle2.add(btttttn33);
		
		JLabel lblFollowingYou = new JLabel("You've been followed:");
		lblFollowingYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblFollowingYou.setBounds(73, 11, 151, 14);
		panelle2.add(lblFollowingYou);
		
		JLabel lblFollowedYou = new JLabel("followed you");
		lblFollowedYou.setBounds(125, 52, 89, 14);
		panelle2.add(lblFollowedYou);
		lblfollow1.setBounds(144, 103, 89, 14);
		
		panelle2.add(lblfollow1);
		lblfollow2.setBounds(135, 154, 97, 14);
		
		panelle2.add(lblfollow2);
		lblfollow3.setBounds(144, 205, 97, 14);
		
		panelle2.add(lblfollow3);
		label_3.setBounds(144, 256, 97, 14);
		
		panelle2.add(label_3);
		label_4.setBounds(144, 307, 97, 14);
		
		panelle2.add(label_4);
		lblh.setBounds(240, 52, 25, 14);
		
		panelle2.add(lblh);
		label_6.setBounds(240, 103, 25, 14);
		
		panelle2.add(label_6);
		label_7.setBounds(240, 154, 25, 14);
		
		panelle2.add(label_7);
		label_8.setBounds(240, 205, 25, 14);
		
		panelle2.add(label_8);
		label_9.setBounds(240, 256, 25, 14);
		
		panelle2.add(label_9);
		label_10.setBounds(240, 307, 25, 14);
		
		panelle2.add(label_10);
		
		JScrollPane likerepostPanel = new JScrollPane();
		likerepostPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		likerepostPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		likerepostPanel.setBackground(Color.WHITE);
		togglePanels.add(likerepostPanel, "likeCard");
		
		likerepostPanel.setViewportView(likePanel);
		likePanel.setLayout(null);
		button.setBounds(10, 33, 45, 40);
		
		likePanel.add(button);
		button_11.setMargin(new Insets(2, 0, 2, 0));
		button_11.setHorizontalTextPosition(SwingConstants.CENTER);
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setContentAreaFilled(false);
		button_11.setBorderPainted(false);
		button_11.setBounds(59, 42, 75, 23);
		
		likePanel.add(button_11);
		button_12.setBounds(10, 84, 45, 40);
		
		likePanel.add(button_12);
		button_13.setMargin(new Insets(2, 0, 2, 0));
		button_13.setHorizontalAlignment(SwingConstants.LEFT);
		button_13.setContentAreaFilled(false);
		button_13.setBorderPainted(false);
		button_13.setBounds(59, 93, 89, 23);
		
		likePanel.add(button_13);
		button_14.setBounds(10, 135, 45, 40);
		
		likePanel.add(button_14);
		button_15.setMargin(new Insets(2, 0, 2, 0));
		button_15.setHorizontalAlignment(SwingConstants.LEFT);
		button_15.setContentAreaFilled(false);
		button_15.setBorderPainted(false);
		button_15.setBounds(59, 144, 75, 23);
		
		likePanel.add(button_15);
		button_16.setBounds(10, 186, 45, 40);
		
		likePanel.add(button_16);
		button_17.setMargin(new Insets(2, 0, 2, 0));
		button_17.setHorizontalAlignment(SwingConstants.LEFT);
		button_17.setContentAreaFilled(false);
		button_17.setBorderPainted(false);
		button_17.setBounds(59, 195, 89, 23);
		
		likePanel.add(button_17);
		button_18.setBounds(10, 237, 45, 40);
		
		likePanel.add(button_18);
		button_19.setMargin(new Insets(2, 0, 2, 0));
		button_19.setHorizontalAlignment(SwingConstants.LEFT);
		button_19.setContentAreaFilled(false);
		button_19.setBorderPainted(false);
		button_19.setBounds(59, 246, 75, 23);
		
		likePanel.add(button_19);
		button_20.setBounds(10, 288, 45, 40);
		
		likePanel.add(button_20);
		button_21.setMargin(new Insets(2, 0, 2, 0));
		button_21.setHorizontalAlignment(SwingConstants.LEFT);
		button_21.setContentAreaFilled(false);
		button_21.setBorderPainted(false);
		button_21.setBounds(59, 297, 75, 23);
		
		likePanel.add(button_21);
		lblYourPostsHave.setBounds(76, 11, 133, 14);
		
		likePanel.add(lblYourPostsHave);
		
		JLabel lblNewLabel_5 = new JLabel("likes");
		lblNewLabel_5.setBounds(121, 46, 46, 14);
		likePanel.add(lblNewLabel_5);
		
		JLabel lblLikes_1 = new JLabel("likes");
		lblLikes_1.setBounds(140, 97, 46, 14);
		likePanel.add(lblLikes_1);
		
		JLabel lblLikes_2 = new JLabel("likes");
		lblLikes_2.setBounds(140, 148, 46, 14);
		likePanel.add(lblLikes_2);
		
		JLabel label_21 = new JLabel("likes");
		label_21.setBounds(140, 199, 46, 14);
		likePanel.add(label_21);
		
		JLabel label_19 = new JLabel("likes");
		label_19.setBounds(140, 250, 46, 14);
		likePanel.add(label_19);
		
		JLabel label_20 = new JLabel("likes");
		label_20.setBounds(144, 301, 46, 14);
		likePanel.add(label_20);
		JToggleButton mentionToggle = new JToggleButton();
		JToggleButton followToggle = new JToggleButton();
		JToggleButton likerepostToggle = new JToggleButton();
		
//**************************** Cole's Part ************************************************************************
		JPanel dmtabpanel = new JPanel();
		ImageIcon tab4Icon = new ImageIcon(this.getClass().getResource("message.png"));
		tabbedPane.addTab("", tab4Icon, dmtabpanel, null);
		dmtabpanel.setLayout(new BorderLayout());
		
// *********************************Card Layout which other panels are added to *************************
		JPanel cardardLayoutPanel = new JPanel();
		cardardLayoutPanel.setLayout(new CardLayout());
		dmtabpanel.add(cardardLayoutPanel);
		
//***************************************create all panels**********************************************
		JPanel messageScreen = new JPanel();
		JPanel dmPanel = new JPanel();
		JPanel profilePanel = new JPanel();
		JPanel composePostPanel = new JPanel();
			
//***************************************Messages Panel Components****************************************
		JLabel messageTitle = new JLabel("Messages");
		JScrollPane messagePanel = new JScrollPane();
		messagePanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		messagePanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JButton composeMessage = new JButton("Compose");
		JSeparator separator = new JSeparator();
		JSeparator separator_1 = new JSeparator();
		JSeparator separator_2 = new JSeparator();
		JLabel msg1NameLabel = new JLabel("Kathy");
		JLabel msg2NameLabel = new JLabel("John");
		JLabel msg1TimeLabel = new JLabel("15 mins ago");
		JLabel msg2TimeLabel = new JLabel("3 hours ago");
		JLabel msg2Msg = new JLabel("");
		JLabel msg1Msg = new JLabel("");
		JLabel newLabel = new JLabel("New!");
		JLabel msg2 = new JLabel("");
		JLabel msg1 = new JLabel("");
		JLabel dmName = new JLabel("");	
		//for dm panel
		JTextPane textPane = new JTextPane();
		StyledDocument doc = textPane.getStyledDocument();
		SimpleAttributeSet left = new SimpleAttributeSet();
		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
		StyleConstants.setForeground(left, Color.RED);
		SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT); 
        StyleConstants.setForeground(right, Color.BLUE);
		
        
		messages[0][0] = "Are you busy tonight?\n";
		messages[0][1] = "No\n";
		messages[0][2] = "Feel like going to a movie?\n";
		messages[0][3] = "Sure\n";
		
		messages[1][0] = "How do you feel about the exam?\n";
		messages[1][1] = "Pretty good, I've been studying all night\n";
		
		messageScreen.setLayout(null);
		messageScreen.setPreferredSize(new Dimension(297, 443));
		messageTitle.setBounds(100, 30, 100, 30);
		messageTitle.setBorder(null);
		messageTitle.setHorizontalAlignment(JLabel.CENTER);
		messageTitle.setFont(new Font("Serif", Font.BOLD, 20));		
		messageScreen.add(messageTitle);
		
		composeMessage.setBounds(203, 0, 70, 30);
		composeMessage.setHorizontalAlignment(JLabel.CENTER);
		composeMessage.setFont(new Font("Serif", Font.PLAIN, 9));
		composeMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagePanel.setVisible(false);
                composePostPanel.setVisible(true);
            }
        });
		
		
		cardardLayoutPanel.add(messagePanel, "name_860164260632972");
		messagePanel.setViewportView(messageScreen);
		
		messageScreen.add(composeMessage);
		
		messageScreen.add(messageTitle);
		messageScreen.add(composeMessage);
				
		separator.setBounds(0, 141, 297, 2);
		messageScreen.add(separator);
				
		separator_1.setBounds(0, 241, 297, 2);
		messageScreen.add(separator_1);
		
		separator_2.setBounds(0, 341, 297, 2);
		messageScreen.add(separator_2);
			
		msg1NameLabel.setBounds(10, 156, 38, 16);
		messageScreen.add(msg1NameLabel);	
		
		msg2NameLabel.setBounds(10, 256, 56, 16);
		messageScreen.add(msg2NameLabel);	
		
		msg1TimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		msg1TimeLabel.setBounds(198, 156, 70, 16);
		messageScreen.add(msg1TimeLabel);		
		
		msg2TimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		msg2TimeLabel.setBounds(198, 256, 70, 16);
		messageScreen.add(msg2TimeLabel);
			
		msg2Msg.setBounds(10, 312, 263, 16);
		for (int i=0;i<=99;i++){
			if (messages[1][i] ==null){
				break;
			}
			msg2Msg.setText(messages[1][i]+ "...");
		}
		messageScreen.add(msg2Msg);
				
		msg1Msg.setBounds(10, 212, 263, 16);
		for (int i=0;i<=99;i++){
			if (messages[0][i] ==null){
				break;
			}
			msg1Msg.setText(messages[0][i] + "...");
		}
		messageScreen.add(msg1Msg);
				
		newLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		newLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		newLabel.setBounds(246, 141, 22, 16);
		messageScreen.add(newLabel);
		msg2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				msg2.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				msg2.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dmName.setText(msg2NameLabel.getText());
				messagePanel.setVisible(false);
				dmPanel.setVisible(true);
				textPane.setText("");
				msgNum = 1;
				for (int i = 0; i <= 99; i+=2){
					if(messages[0][i] != null){
						try{
							doc.setParagraphAttributes(doc.getLength(), 1, left, false);
							doc.insertString(doc.getLength(), messages[1][i], left );
							
						} catch(BadLocationException e1) {
							
							e1.printStackTrace();
						}
						
					}
					if (messages[0][i+1] != null){
						try{
							doc.setParagraphAttributes(doc.getLength(), 1, right, false);
							doc.insertString(doc.getLength(), messages[1][i+1], right );
							
						} catch(BadLocationException e1) {	
							e1.printStackTrace();
						}
					}
					if(messages[0][i+1] == null){
						break;
					}
				}
				
			}
		});
		msg2.setBounds(0, 241, 276, 100);
		messageScreen.add(msg2);	
		
		msg1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				msg1.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				msg1.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dmName.setText(msg1NameLabel.getText());
				messagePanel.setVisible(false);
				dmPanel.setVisible(true);
				newLabel.setText("");
				textPane.setText("");
				msgNum = 0;
				for (int i = 0; i <= 99; i+=2){
					if(messages[0][i] != null){
						try{
							doc.setParagraphAttributes(doc.getLength(), 1, left, false);
							doc.insertString(doc.getLength(), messages[0][i], left );
							
						} catch(BadLocationException e1) {
							
							e1.printStackTrace();
						}
						
					}
					if (messages[0][i+1] != null){
						try{
							doc.setParagraphAttributes(doc.getLength(), 1, right, false);
							doc.insertString(doc.getLength(), messages[0][i+1], right );
							
						} catch(BadLocationException e1) {	
							e1.printStackTrace();
						}
					}
					if(messages[0][i+1] == null){
						break;
					}
				}
			}
		});
		msg1.setBounds(0, 141, 276, 100);
		messageScreen.add(msg1);
		
		dmName.setBounds(61, 13, 180, 43);
		dmName.setHorizontalAlignment(SwingConstants.CENTER);
		
//******************************************end of Messages Panel***************************************
		
//******************************************Direct Messages Panel Components****************************
		
		cardardLayoutPanel.add(dmPanel, "name_247023874062748");
		
		JTextField txtSearch = new JTextField();
		JLabel topLabel = new JLabel("");
		JButton butoonn = new JButton("");
		butoonn.setIcon(new ImageIcon(ActivityFrame.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		JSeparator separator_4 = new JSeparator();
		JTextField enterUsrtxt = new JTextField();
		JButton sendButton = new JButton("Send");
		
		txtSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtSearch.setText("");
				txtSearch.setForeground(Color.BLACK);
			}
		});
		txtSearch.setForeground(Color.LIGHT_GRAY);
		txtSearch.setText("Search...");
		txtSearch.setBounds(67, 87, 165, 22);
		messageScreen.add(txtSearch);
		txtSearch.setColumns(10);
				
		topLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtSearch.getText().equals("")){
					txtSearch.setText("Search...");
					txtSearch.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profilePanel.setVisible(true);
				messagePanel.setVisible(false);
			}
		});
		btnProfile.setBounds(-1, 1, 97, 25);
		messageScreen.add(btnProfile);
		topLabel.setBounds(0, 0, 297, 143);
		messageScreen.add(topLabel);			
		
		butoonn.setBounds(0, 0, 27, 27);
		butoonn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				messagePanel.setVisible(true);
				dmPanel.setVisible(false);
			}
		});
		dmPanel.setLayout(null);
		dmPanel.add(butoonn);
				
		dmName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dmPanel.add(dmName);
				
		separator_4.setBounds(0, 373, 297, 2);
		dmPanel.add(separator_4);
				
		enterUsrtxt.setBounds(33, 388, 180, 22);
		dmPanel.add(enterUsrtxt);
		enterUsrtxt.setColumns(10);
		
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (!enterUsrtxt.getText().equals("")){
					try{
						doc.insertString(doc.getLength(), enterUsrtxt.getText()+ "\n", right );
			            doc.setParagraphAttributes(doc.getLength(), 1, right, false);
						
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
					for (int i = 0;i<=99; i+=2){
						if(messages[msgNum][i+1] == null){
							messages[msgNum][i+1] = enterUsrtxt.getText()+"\n";
							break;
						}
					}
					enterUsrtxt.setText("");
					
					
					
					
				}
			}
		});
		sendButton.setBackground(Color.GREEN);
		sendButton.setBounds(218, 388, 67, 22);
		dmPanel.add(sendButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		scrollPane_1.setBounds(10, 63, 275, 290);
		dmPanel.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(textPane);      
		
		
//**********************************************end of Direct Message Panel********************************************
		
//*********************************************User Profile Panel Components***********************************
		cardardLayoutPanel.add(profilePanel, "name_355071876155899");
		profilePanel.setLayout(null);
		
		JLabel profPicLabel = new JLabel("");
		JLabel usrNameLabel = new JLabel("Mr. Smiley");
		JButton btnSendMessage = new JButton("Send Message");
		JButton btnNbutt_1 = new JButton("Add to Custom Feed");
		
		profPicLabel.setBounds(24, 53, 100, 100);
		profPicLabel.setIcon(new ImageIcon(new ImageIcon("face.png").getImage().getScaledInstance(profPicLabel.getWidth(), profPicLabel.getHeight(), Image.SCALE_DEFAULT)));
		profPicLabel.setBorder(LineBorder.createBlackLineBorder());
		profilePanel.add(profPicLabel);
		
		usrNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usrNameLabel.setBounds(24, 166, 100, 16);
		profilePanel.add(usrNameLabel);
		
		
		btnSendMessage.setBounds(136, 53, 149, 49);
		profilePanel.add(btnSendMessage);
		
		
		btnNbutt_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNbutt_1.setBounds(136, 133, 149, 49);
		profilePanel.add(btnNbutt_1);
		
		JButton closeProfilebtn = new JButton("X");
		closeProfilebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profilePanel.setVisible(false);
				//messagePanel.setVisible(true);
			}
		});
		closeProfilebtn.setBounds(0, 0, 51, 40);
		profilePanel.add(closeProfilebtn);
//*******************************************end of User Profile Panel***************************************
		
//*******************************************Compose Post Panel Components***************************************
		cardardLayoutPanel.add(composePostPanel, "name_414136068082115");
		composePostPanel.setLayout(null);
		JButton postBtn = new JButton("Post");
		JButton closePostBtn = new JButton("X");
		closePostBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				composePostPanel.setVisible(false);
				messagePanel.setVisible(true);
			}
		});
		JLabel GIFLabel = new JLabel("GIF");
		JLabel cameraLabel = new JLabel("");
		JLabel videoLabel = new JLabel("");
		JLabel audioLabel = new JLabel("");
		JLabel atLabel = new JLabel("@");
		JLabel keyboardLabel = new JLabel("Keyboard Here");
		JSeparator separator_5 = new JSeparator();
		JSeparator separator_6 = new JSeparator();
		JLabel keyboardDownArea = new JLabel("");
		JScrollPane scrollPane = new JScrollPane();
		JTextArea postTextField1 = new JTextArea();
		
		
		closePostBtn.setBounds(0, 0, 50, 50);
		composePostPanel.add(closePostBtn);
		
		
		postBtn.setBounds(217, 0, 80, 50);
		composePostPanel.add(postBtn);
		
		GIFLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				GIFLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				GIFLabel.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				postTextField1.append("\n*Added GIF*\n");
			}
		});
		
		GIFLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		GIFLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GIFLabel.setBounds(0, 369, 56, 50);
		composePostPanel.add(GIFLabel);
		
		
		cameraLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cameraLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cameraLabel.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				postTextField1.append("\n*Added Photo*\n");
			}
		});
		
		cameraLabel.setBounds(58, 369, 56, 50);	
		cameraLabel.setIcon(new ImageIcon(new ImageIcon("camera.png").getImage().getScaledInstance(cameraLabel.getWidth(), cameraLabel.getHeight(), Image.SCALE_DEFAULT)));
		composePostPanel.add(cameraLabel);
		
		
		videoLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				videoLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				videoLabel.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				postTextField1.append("\n*Added Video*\n");
			}
		});
		videoLabel.setBounds(120, 369, 62, 50);
		videoLabel.setIcon(new ImageIcon(new ImageIcon("video.png").getImage().getScaledInstance(videoLabel.getWidth(), videoLabel.getHeight(), Image.SCALE_DEFAULT)));
		composePostPanel.add(videoLabel);
		
		
		audioLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				audioLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				audioLabel.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				postTextField1.append("\n*Added Audio Clip*\n");
			}
		});
		audioLabel.setBounds(190, 369, 56, 50);
		audioLabel.setIcon(new ImageIcon(new ImageIcon("audio.png").getImage().getScaledInstance(audioLabel.getWidth(), audioLabel.getHeight(), Image.SCALE_DEFAULT)));
		composePostPanel.add(audioLabel);
		
		
		atLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				atLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			@Override
			public void mouseExited(MouseEvent e) {
				atLabel.setBorder(null);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				postTextField1.append("\n*Tag*\n");
			}
		});
		atLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		atLabel.setHorizontalAlignment(SwingConstants.CENTER);
		atLabel.setBounds(247, 369, 50, 50);
		composePostPanel.add(atLabel);
		
		
		separator_5.setBounds(0, 369, 297, 2);
		composePostPanel.add(separator_5);
		
		
		separator_6.setBounds(0, 421, 297, 2);
		composePostPanel.add(separator_6);
		
		keyboardLabel.setBounds(0, 269, 297, 150);
		keyboardLabel.setHorizontalAlignment(SwingConstants.CENTER);
		composePostPanel.add(keyboardLabel);
		
		
		keyboardDownArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				scrollPane.setBounds(0, 66, 297, 300);
				postTextField1.setBounds(0, 66, 297, 300);
				separator_5.setBounds(0, 369, 297, 2);
				separator_6.setBounds(0, 421, 297, 2);
				GIFLabel.setBounds(0, 369, 56, 50);
				cameraLabel.setBounds(58, 369, 56, 50);
				videoLabel.setBounds(120, 369, 62, 50);
				audioLabel.setBounds(190, 369, 56, 50);
				atLabel.setBounds(247, 369, 50, 50);
				keyboardLabel.setVisible(false);
			}
		});
		keyboardDownArea.setBounds(0, 0, 297, 65);
		composePostPanel.add(keyboardDownArea);
		
		
		scrollPane.setBounds(0, 66, 297, 300);
		composePostPanel.add(scrollPane);
		
		
		scrollPane.setViewportView(postTextField1);
		postTextField1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				scrollPane.setBounds(0, 66, 297, 150);
				postTextField1.setBounds(0, 66, 297, 150);
				separator_5.setBounds(0, 369-150, 297, 2);
				separator_6.setBounds(0, 421-150, 297, 2);
				GIFLabel.setBounds(0, 369-150, 56, 50);
				cameraLabel.setBounds(58, 369-150, 56, 50);
				videoLabel.setBounds(120, 369-150, 62, 50);
				audioLabel.setBounds(190, 369-150, 56, 50);
				atLabel.setBounds(247, 369-150, 50, 50);
				keyboardLabel.setVisible(true);
				keyboardLabel.setBorder(LineBorder.createBlackLineBorder());
			}
			
		});
		keyboardLabel.setVisible(false);
//***************************************end of Compose Post**************************************************

		
		
//*****************toggle panels within notifications tab************************************************************
		
		//makes them mutually exclusive
		ButtonGroup Togglebutts = new ButtonGroup();
		Togglebutts.add(likerepostToggle);
		Togglebutts.add(followToggle);
		Togglebutts.add(mentionToggle);
	
	
		//when buttons clicked switches cards - initially shows mentions card
		CardLayout cardLayout = (CardLayout) togglePanels.getLayout();
		
		//Mention Toggle Button Settings & action listener
		ImageIcon mentionIcon = new ImageIcon(this.getClass().getResource("atyes.png"));
		ImageIcon mentionnoIcon = new ImageIcon(this.getClass().getResource("atno.png"));
		mentionToggle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(togglePanels, "mentionCard");
			}
		});
		mentionToggle.setAction(action);
		mentionToggle.setIcon(mentionnoIcon);
		mentionToggle.setBorder(BorderFactory.createEmptyBorder());
		mentionToggle.setContentAreaFilled(false);
		mentionToggle.setSelected(true);
		mentionToggle.setBounds(45, 11, 45, 35);
		mentionToggle.setDisabledIcon(mentionnoIcon);
		mentionToggle.setSelectedIcon(mentionIcon);
		youtabPanel.add(mentionToggle);

		
		//Like/Repost Toggle Button Settings & Action Listener
		ImageIcon likerepostIcon = new ImageIcon(this.getClass().getResource("likeyes.png"));
		ImageIcon likenoIcon = new ImageIcon(this.getClass().getResource("likeno.png"));
		likerepostToggle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(togglePanels, "likeCard");
			}
		});
		likerepostToggle.setAction(action);
		likerepostToggle.setIcon(likenoIcon);
		likerepostToggle.setBorder(BorderFactory.createEmptyBorder());
		likerepostToggle.setContentAreaFilled(false);
		likerepostToggle.setSelected(false);
		likerepostToggle.setBounds(205, 11, 45, 35);
		likerepostToggle.setDisabledIcon(likenoIcon);
		likerepostToggle.setSelectedIcon(likerepostIcon);
		youtabPanel.add(likerepostToggle);
		
		
		/*Follow Toggle button settings & action listener*/
		ImageIcon followIcon = new ImageIcon(this.getClass().getResource("plus.png"));
		ImageIcon follownoIcon = new ImageIcon(this.getClass().getResource("plusno.png"));
		followToggle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cardLayout.show(togglePanels, "followCard");
			}
		});
		followToggle.setAction(action);
		followToggle.setIcon(follownoIcon);
		followToggle.setBorder(BorderFactory.createEmptyBorder());
		followToggle.setContentAreaFilled(false);
		followToggle.setSelected(false);
		followToggle.setBounds(126, 11, 45, 35);
		followToggle.setDisabledIcon(follownoIcon);
		followToggle.setSelectedIcon(followIcon);
		youtabPanel.add(followToggle);
		
		JScrollPane Profile = new JScrollPane();
		notiftabPanel.add(Profile, "Profile");
		
		JPanel profilepanel = new JPanel();
		profilepanel.setLayout(null);
		Profile.setViewportView(profilepanel);
		
		JLabel profilepiclblNot = new JLabel("");
		profilepiclblNot.setBounds(24, 24, 96, 87);
		profilepanel.add(profilepiclblNot);
		
		JLabel profnamelblNot = new JLabel("John Doe");
		profnamelblNot.setBounds(130, 11, 159, 27);
		profilepanel.add(profnamelblNot);
		
		JLabel usrLblNotif = new JLabel("@JohnDoe");
		usrLblNotif.setBounds(130, 54, 110, 14);
		profilepanel.add(usrLblNotif);
		
		JButton profpost1 = new JButton("Today was super cooool                                       1h");
		profpost1.setHorizontalAlignment(SwingConstants.LEFT);
		profpost1.setVerticalAlignment(SwingConstants.TOP);
		profpost1.setBounds(10, 108, 279, 72);
		profilepanel.add(profpost1);
		
		JButton profpost2 = new JButton("Water is important for the body                           2h");
		profpost2.setHorizontalAlignment(SwingConstants.LEFT);
		profpost2.setVerticalAlignment(SwingConstants.TOP);
		profpost2.setBounds(10, 183, 279, 72);
		profilepanel.add(profpost2);
		
		JButton profpost3 = new JButton("cole world                                                           12h");
		profpost3.setHorizontalAlignment(SwingConstants.LEFT);
		profpost3.setVerticalAlignment(SwingConstants.TOP);
		profpost3.setBounds(10, 258, 279, 72);
		profilepanel.add(profpost3);
		
		JButton profpost4 = new JButton("hello world                                                           14h");
		profpost4.setHorizontalAlignment(SwingConstants.LEFT);
		profpost4.setVerticalAlignment(SwingConstants.TOP);
		profpost4.setBounds(10, 332, 279, 72);
		profilepanel.add(profpost4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ActivityFrame.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		
		
		CardLayout cardLayoutduo = (CardLayout) notiftabPanel.getLayout();

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayoutduo.show(notiftabPanel, "Notif");
			}
		});
		btnNewButton_1.setBounds(0, 0, 23, 23);
		profilepanel.add(btnNewButton_1);
		
		ProfPic1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		ProfPic1.setBounds(10, 11, 45, 40);
		ImageIcon Prof1Icon = new ImageIcon(this.getClass().getResource("bell.png"));
		ProfPic1.setIcon(Prof1Icon);
		followingNotifsPanel.add(ProfPic1);
		
		ProfPic2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		ProfPic2.setBounds(10, 62, 45, 40);
		followingNotifsPanel.add(ProfPic2);
		
		ProfPic3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		
		ProfPic3.setBounds(10, 113, 45, 40);
		followingNotifsPanel.add(ProfPic3);
		
		ProfPic4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		ProfPic4.setBounds(10, 164, 45, 40);
		followingNotifsPanel.add(ProfPic4);
		
		ProfPic5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		ProfPic5.setBounds(10, 215, 45, 40);
		followingNotifsPanel.add(ProfPic5);
		
		ProfPic6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		ProfPic6.setBounds(10, 266, 45, 40);
		
		ProfPic7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		followingNotifsPanel.add(ProfPic6);
		ProfPic7.setBounds(10, 317, 45, 40);
		followingNotifsPanel.add(ProfPic7);
		ProfPic8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		
		ProfPic8.setBounds(10, 368, 45, 40);
		followingNotifsPanel.add(ProfPic8);
		
		
		
		butnpic100.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			cardLayoutduo.show(notiftabPanel, "Profile");
			}
		});
		butnpic100.setBounds(10, 11, 51, 47);
		suggestionsPanel.add(butnpic100);
		
		JScrollPane ProfileSearch = new JScrollPane();
		ProfileSearch.setBounds(0, 0, 299, 386);
		searchmainPanel.add(ProfileSearch, "Profile");
		
		JPanel panel_13 = new JPanel();
		ProfileSearch.setViewportView(panel_13);
		panel_13.setLayout(null);
		label_42.setBounds(24, 23, 96, 87);
		
		panel_13.add(label_42);
		button_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_51.setIcon(new ImageIcon(ActivityFrame.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-error.png")));
		button_51.setBounds(0, 0, 23, 23);
		
		panel_13.add(button_51);
		label_43.setBounds(130, 11, 159, 27);
		
		panel_13.add(label_43);
		label_44.setBounds(130, 54, 110, 14);
		
		panel_13.add(label_44);
		button_52.setVerticalAlignment(SwingConstants.TOP);
		button_52.setHorizontalAlignment(SwingConstants.LEFT);
		button_52.setBounds(10, 108, 279, 72);
		
		panel_13.add(button_52);
		button_53.setVerticalAlignment(SwingConstants.TOP);
		button_53.setHorizontalAlignment(SwingConstants.LEFT);
		button_53.setBounds(10, 183, 279, 72);
		
		panel_13.add(button_53);
		button_54.setVerticalAlignment(SwingConstants.TOP);
		button_54.setHorizontalAlignment(SwingConstants.LEFT);
		button_54.setBounds(10, 258, 279, 72);
		
		panel_13.add(button_54);
		button_55.setVerticalAlignment(SwingConstants.TOP);
		button_55.setHorizontalAlignment(SwingConstants.LEFT);
		button_55.setBounds(10, 332, 279, 72);
		
		panel_13.add(button_55);
		
		
		
		
		
		
		
		
		JScrollPane ConvoView = new JScrollPane();
		notiftabPanel.add(ConvoView, "Convo");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ConvoView.setViewportView(panel);
		
		JButton profilepic = new JButton("");
		profilepic.setBounds(10, 11, 95, 90);
		panel.add(profilepic);
		
		JButton profilename = new JButton("John Doe");
		profilename.setContentAreaFilled(false);
		profilename.setBounds(115, 11, 174, 34);
		panel.add(profilename);
		
		JButton btnjohndoe = new JButton("@JohnDoe");
		btnjohndoe.setMargin(new Insets(2, 0, 2, 14));
		btnjohndoe.setHorizontalAlignment(SwingConstants.LEFT);
		btnjohndoe.setBorderPainted(false);
		btnjohndoe.setContentAreaFilled(false);
		btnjohndoe.setBounds(115, 56, 89, 23);
		panel.add(btnjohndoe);
		
		JLabel lblexamplePostHashtag = new JLabel("\"Example Post hashtag blahdy blah\"");
		lblexamplePostHashtag.setVerticalAlignment(SwingConstants.TOP);
		lblexamplePostHashtag.setHorizontalAlignment(SwingConstants.LEFT);
		lblexamplePostHashtag.setAlignmentY(Component.TOP_ALIGNMENT);
		lblexamplePostHashtag.setBounds(10, 112, 279, 123);
		panel.add(lblexamplePostHashtag);
		
		JLabel lblJaneDoe = new JLabel("Example Reply                                                             1h");
		lblJaneDoe.setBounds(10, 264, 287, 45);
		panel.add(lblJaneDoe);
		
		JLabel lblNewLabel = new JLabel("Jane Doe");
		lblNewLabel.setBounds(10, 252, 46, 14);
		panel.add(lblNewLabel);
		
		
		
		
		
		
		/*********************************Jade's Part********************************/
		
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//user2_HTpanel.setVisible(false);
				settings_panel.setVisible(true);
				tabbedPane.setVisible(false);
				
				
			}
		});
		settings_panel.setBackground(new Color(238,238,238,123));
		contentPane.add(settings_panel, "name_367919083241537");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		lblNewLabel_1.setIcon(new ImageIcon(ActivityFrame.class.getResource("general100.png")));
		lblNewLabel_1.setBounds(110, 89, 100, 100);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label_13 = new JLabel("New label");

		label_13.setIcon(new ImageIcon(ActivityFrame.class.getResource("notifications100.png")));
		label_13.setBounds(34, 258, 100, 100);
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label_14 = new JLabel("New label");

		label_14.setIcon(new ImageIcon(ActivityFrame.class.getResource("timeline100.png")));
		label_14.setBounds(192, 258, 100, 100);
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon(ActivityFrame.class.getResource("settings26.png")));
		label_15.setBounds(149, 224, 26, 26);
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		settings_panel.setLayout(null);
		settings_panel.add(label_13);
		settings_panel.add(label_14);
		settings_panel.add(label_15);
		settings_panel.add(lblNewLabel_1);
		
		JLabel lblGeneral = new JLabel("General");
		lblGeneral.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblGeneral.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneral.setBounds(6, 187, 308, 37);
		settings_panel.add(lblGeneral);
		
		JLabel lblNewLabel_2 = new JLabel("Notifications");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 370, 100, 16);
		settings_panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Timeline");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(192, 370, 100, 16);
		settings_panel.add(lblNewLabel_3);
		
		JPanel settings_toppanel = new JPanel();
		settings_toppanel.setBounds(0, 0, 320, 37);
		settings_panel.add(settings_toppanel);
		settings_toppanel.setLayout(null);
		
		JButton button_1 = new JButton("<");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hometabPanel.setVisible(true);
				settings_panel.setVisible(false);
			}
		});
		button_1.setBounds(6, 1, 44, 34);
		settings_toppanel.add(button_1);
		
		JLabel lblSettings = new JLabel("SETTINGS");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSettings.setBounds(66, 1, 192, 34);
		settings_toppanel.add(lblSettings);
		
		JPanel notification_settings_panel = new JPanel();
		contentPane.add(notification_settings_panel, "name_375607433897998");
		notification_settings_panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 320, 37);
		notification_settings_panel.add(panel_1);
		
		JButton button_2 = new JButton("<");
		button_2.setVerticalAlignment(SwingConstants.TOP);
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		button_2.setBounds(6, 1, 44, 34);
		panel_1.add(button_2);
		
		JLabel lblNotificationSettings = new JLabel("NOTIFICATION SETTINGS");
		lblNotificationSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotificationSettings.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNotificationSettings.setBounds(62, 1, 192, 34);
		panel_1.add(lblNotificationSettings);
		
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.setBounds(261, 1, 53, 34);
		panel_1.add(btnNewButton);
		
		JLabel lblNewFollowers = new JLabel("    New followers");
		lblNewFollowers.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblNewFollowers.setBounds(0, 37, 320, 47);
		notification_settings_panel.add(lblNewFollowers);
		
		JLabel lblReposts = new JLabel("    Reposts");
		lblReposts.setBorder(null);
		lblReposts.setBounds(0, 83, 320, 47);
		notification_settings_panel.add(lblReposts);
		
		JLabel lblLikes = new JLabel("    Likes");
		lblLikes.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblLikes.setBounds(0, 132, 320, 47);
		notification_settings_panel.add(lblLikes);
		
		JLabel lblMentions = new JLabel("    Mentions");

		lblMentions.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblMentions.setBounds(0, 178, 320, 47);
		notification_settings_panel.add(lblMentions);
		
		JLabel lblNewLabel_4 = new JLabel(">");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(266, 178, 48, 47);
		notification_settings_panel.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(279, 134, 35, 45);
		notification_settings_panel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setSelected(true);
		checkBox.setBounds(279, 85, 35, 45);
		notification_settings_panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setSelected(true);
		checkBox_1.setBounds(279, 37, 35, 45);
		notification_settings_panel.add(checkBox_1);
		
		JPanel mention_settings_panel = new JPanel();
		//mention_settings_panel.setBackground(Color.LIGHT_GRAY);
		mention_settings_panel.setLayout(null);
		contentPane.add(mention_settings_panel, "name_379000911137487");
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_2.setBounds(0, 0, 320, 37);
		mention_settings_panel.add(panel_2);
		
		JButton button_3 = new JButton("<");
		button_3.setVerticalAlignment(SwingConstants.TOP);
		button_3.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		button_3.setBounds(6, 1, 44, 34);
		panel_2.add(button_3);
		
		JLabel lblMentionSettings = new JLabel("MENTION SETTINGS");
		lblMentionSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblMentionSettings.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMentionSettings.setBounds(66, 1, 192, 34);
		panel_2.add(lblMentionSettings);
		
		JButton button_4 = new JButton("DONE");
		button_4.setBounds(261, 1, 53, 34);
		panel_2.add(button_4);
		
		JLabel lblSomeoneMentionsYou = new JLabel("    Someone mentions you");
		lblSomeoneMentionsYou.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblSomeoneMentionsYou.setBounds(0, 89, 320, 47);
		mention_settings_panel.add(lblSomeoneMentionsYou);
		
		JLabel lblSomeoneLikesA = new JLabel("    Someone likes a post mentioning you");
		lblSomeoneLikesA.setBorder(null);
		lblSomeoneLikesA.setBounds(0, 137, 320, 47);
		mention_settings_panel.add(lblSomeoneLikesA);
		
		JLabel lblSomeoneRepostsA = new JLabel("    Someone reposts a post mentioning you");
		lblSomeoneRepostsA.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblSomeoneRepostsA.setBounds(0, 186, 320, 47);
		mention_settings_panel.add(lblSomeoneRepostsA);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setSelected(true);
		checkBox_2.setBounds(279, 188, 35, 45);
		mention_settings_panel.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setSelected(true);
		checkBox_3.setBounds(279, 139, 35, 45);
		mention_settings_panel.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setSelected(true);
		checkBox_4.setBounds(279, 91, 35, 45);
		mention_settings_panel.add(checkBox_4);
		
		JLabel lblReceiveNotificationsWhen = new JLabel("Receive notifications when...");
		lblReceiveNotificationsWhen.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblReceiveNotificationsWhen.setBounds(20, 63, 229, 16);
		mention_settings_panel.add(lblReceiveNotificationsWhen);
		
		JPanel timeline_settings_panel = new JPanel();
		timeline_settings_panel.setLayout(null);
		contentPane.add(timeline_settings_panel, "name_399653273430170");
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_3.setBounds(0, 0, 320, 37);
		timeline_settings_panel.add(panel_3);
		
		JButton button_5 = new JButton("<");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timeline_settings_panel.setVisible(false);
				settings_panel.setVisible(true);
			}
		});
		button_5.setVerticalAlignment(SwingConstants.TOP);
		button_5.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		button_5.setBounds(6, 1, 44, 34);
		panel_3.add(button_5);
		
		JLabel lblGeneralSettings = new JLabel("TIMELINE SETTINGS");
		lblGeneralSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneralSettings.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblGeneralSettings.setBounds(62, 1, 192, 34);
		panel_3.add(lblGeneralSettings);
		
		JButton button_6 = new JButton("DONE");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setVisible(true);
				timeline_settings_panel.setVisible(false);
			}
		});
		button_6.setBounds(261, 1, 53, 34);
		panel_3.add(button_6);
		
		JLabel lblWordHashtag = new JLabel("    Word & hashtag filters");

		lblWordHashtag.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblWordHashtag.setBounds(0, 35, 320, 47);
		timeline_settings_panel.add(lblWordHashtag);
		
		JLabel lblIgnoreList = new JLabel("    Ignore list");
		lblIgnoreList.setBorder(null);
		lblIgnoreList.setBounds(0, 83, 320, 47);
		timeline_settings_panel.add(lblIgnoreList);
		
		JLabel lblBlockList = new JLabel("    Block list");
		lblBlockList.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblBlockList.setBounds(0, 132, 320, 47);
		timeline_settings_panel.add(lblBlockList);
		
		JLabel label_16 = new JLabel(">");
		label_16.setVerticalAlignment(SwingConstants.TOP);
		label_16.setHorizontalAlignment(SwingConstants.TRAILING);
		label_16.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		label_16.setBounds(266, 132, 48, 47);
		timeline_settings_panel.add(label_16);
		
		JLabel label_17 = new JLabel(">");
		label_17.setVerticalAlignment(SwingConstants.TOP);
		label_17.setHorizontalAlignment(SwingConstants.TRAILING);
		label_17.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		label_17.setBounds(266, 83, 48, 47);
		timeline_settings_panel.add(label_17);
		
		JLabel label_18 = new JLabel(">");
		label_18.setVerticalAlignment(SwingConstants.TOP);
		label_18.setHorizontalAlignment(SwingConstants.TRAILING);
		label_18.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		label_18.setBounds(266, 35, 48, 47);
		timeline_settings_panel.add(label_18);
		
		JPanel general_settings_panel = new JPanel();
		general_settings_panel.setLayout(null);
		contentPane.add(general_settings_panel, "name_403461118406162");
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_6.setBounds(0, 0, 320, 37);
		general_settings_panel.add(panel_6);
		
		JButton button_7 = new JButton("<");
		button_7.setVerticalAlignment(SwingConstants.TOP);
		button_7.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		button_7.setBounds(6, 1, 44, 34);
		panel_6.add(button_7);
		
		JLabel lblGeneralSettings_1 = new JLabel("GENERAL SETTINGS");
		lblGeneralSettings_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneralSettings_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblGeneralSettings_1.setBounds(62, 1, 192, 34);
		panel_6.add(lblGeneralSettings_1);
		
		JButton button_8 = new JButton("DONE");
		button_8.setBounds(261, 1, 53, 34);
		panel_6.add(button_8);
		
		JLabel lblViewProfile = new JLabel("    View profile");
		lblViewProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				profilePanel.setVisible(true);
				general_settings_panel.setVisible(false);
			}
		});
		lblViewProfile.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lblViewProfile.setBounds(0, 35, 320, 47);
		general_settings_panel.add(lblViewProfile);
		
		JLabel lblTextSize = new JLabel("    TEXT SIZE");
		lblTextSize.setBorder(null);
		lblTextSize.setBounds(0, 83, 320, 47);
		general_settings_panel.add(lblTextSize);
		
		JLabel label_22 = new JLabel("");
		label_22.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_22.setBounds(0, 242, 320, 66);
		general_settings_panel.add(label_22);
		
		JLabel label_25 = new JLabel(">");
		label_25.setVerticalAlignment(SwingConstants.TOP);
		label_25.setHorizontalAlignment(SwingConstants.TRAILING);
		label_25.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		label_25.setBounds(266, 35, 48, 47);
		general_settings_panel.add(label_25);
		
		JLabel preview_text = new JLabel("Drag the slider below to preview");
		preview_text.setHorizontalAlignment(SwingConstants.CENTER);
		preview_text.setBounds(6, 142, 308, 59);
		general_settings_panel.add(preview_text);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				preview_text.setFont(new Font("Lucida Grande",Font.PLAIN,slider.getValue()));
			}
		});

		slider.setValue(13);
		slider.setMaximum(15);
		slider.setMinimum(11);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setBounds(18, 270, 284, 29);
		general_settings_panel.add(slider);
		
		JPanel filters_panel = new JPanel();
		filters_panel.setLayout(null);
		contentPane.add(filters_panel, "name_415893706919566");
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(128, 128, 128)));
		panel_7.setBounds(0, 0, 320, 37);
		filters_panel.add(panel_7);
		
		JButton button_9 = new JButton("<");
		button_9.setVerticalAlignment(SwingConstants.TOP);
		button_9.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		button_9.setBounds(6, 1, 44, 34);
		panel_7.add(button_9);
		
		JLabel lblFilters = new JLabel("FILTERS");
		lblFilters.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilters.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblFilters.setBounds(62, 1, 192, 34);
		panel_7.add(lblFilters);
		
		JButton button_10 = new JButton("DONE");
		
		button_10.setBounds(261, 1, 53, 34);
		panel_7.add(button_10);
		
		JLabel filter1 = new JLabel("");
		filter1.setBorder(null);
		filter1.setBounds(22, 35, 298, 47);
		filters_panel.add(filter1);
		
		JLabel filter2 = new JLabel("");
		filter2.setBorder(null);
		filter2.setBounds(22, 83, 298, 47);
		filters_panel.add(filter2);
		
		JLabel filter3 = new JLabel("");
		filter3.setBorder(null);
		filter3.setBounds(22, 132, 298, 47);
		filters_panel.add(filter3);
		
		filterTextField = new JTextField();
		filterTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				filterTextField.setText("");
				filterTextField.setForeground(Color.BLACK);
			}
		});
		filterTextField.setForeground(SystemColor.inactiveCaption);
		filterTextField.setText(defaultFilterMessage);
		filterTextField.setBounds(6, 396, 233, 37);
		filters_panel.add(filterTextField);
		filterTextField.setColumns(10);
	
		
		JButton btnNewButton_2 = new JButton("Add");
		
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton_2.setBounds(243, 396, 71, 39);
		filters_panel.add(btnNewButton_2);
		
		JLabel label = new JLabel("    ");
		label.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label.setBounds(0, 35, 320, 47);
		filters_panel.add(label);
		
		JLabel label_1 = new JLabel("    ");
		label_1.setBorder(null);
		label_1.setBounds(0, 83, 320, 47);
		filters_panel.add(label_1);
		
		JLabel label_2 = new JLabel("    ");
		label_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		label_2.setBounds(0, 132, 320, 47);
		filters_panel.add(label_2);
		
		JButton filter1_removebtn = new JButton("Remove");
		filter1_removebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeFilters(filter1.getText());
				filter1.setText("");
			}
		});
		filter1_removebtn.setEnabled(false);
		filter1_removebtn.setBackground(UIManager.getColor("RadioButton.select"));
		filter1_removebtn.setBounds(236, 42, 78, 37);
		filters_panel.add(filter1_removebtn);
		
		JButton filter2_removebtn = new JButton("Remove");
		filter2_removebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeFilters(filter2.getText());
				filter2.setText("");
			}
		});
		filter2_removebtn.setEnabled(false);
		filter2_removebtn.setBackground(UIManager.getColor("Button.select"));
		filter2_removebtn.setBounds(236, 90, 78, 37);
		filters_panel.add(filter2_removebtn);
		
		JButton filter3_removebtn = new JButton("Remove");
		filter3_removebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeFilters(filter3.getText());
				filter3.setText("");
			}
		});
		filter3_removebtn.setEnabled(false);
		filter3_removebtn.setBackground(UIManager.getColor("Button.select"));
		filter3_removebtn.setBounds(236, 136, 78, 37);
		filters_panel.add(filter3_removebtn);
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				general_settings_panel.setVisible(true);
				settings_panel.setVisible(false);
				fontSizeBeforeChanges = slider.getValue();
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slider.setValue(fontSizeBeforeChanges);
				settings_panel.setVisible(true);
				general_settings_panel.setVisible(false);
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setVisible(true);
				general_settings_panel.setVisible(false);
				
				// TODO: CHANGE THE FONT SIZE OF EVERYTHING (SEE BELOW FOR HOW TO
				Font fontPlain = new Font("Lucida Grande", Font.PLAIN,slider.getValue());
				Font fontBold = new Font("Lucida Grande", Font.BOLD,slider.getValue());
				user1_name.setFont(fontBold);
				user1_handle.setFont(fontPlain);
				user1_time.setFont(fontPlain);
				user2_name.setFont(fontBold);
				user2_handle.setFont(fontPlain);
				user2_time.setFont(fontPlain);
				user3_name.setFont(fontBold);
				user3_handle.setFont(fontPlain);
				user3_time.setFont(fontPlain);
				user4_name.setFont(fontBold);
				user4_handle.setFont(fontPlain);
				user4_time.setFont(fontPlain);
			}
		});
		
		lblWordHashtag.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				filters_panel.setVisible(true);
				timeline_settings_panel.setVisible(false);
			}
		});
		
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notification_settings_panel.setVisible(true);
				settings_panel.setVisible(false);
			}
		});
		
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timeline_settings_panel.setVisible(true);
				settings_panel.setVisible(false);
			}
		});
		
		lblMentions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notification_settings_panel.setVisible(false);
				mention_settings_panel.setVisible(true);
			}
		});
		
		JLabel[] filterLabels = {filter1,filter2,filter3};
		JButton[] filterButtons = {filter1_removebtn,filter2_removebtn,filter3_removebtn};
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String filterword = filterTextField.getText();
				
				for (int i=0; i<filterLabels.length; i++){
					if(filterLabels[i].getText().isEmpty()){
						filterLabels[i].setText(filterword);
						filterButtons[i].setEnabled(true);
						
						
						break;
					}
					
				}
			
				
			}
		});
		
		JTextPane[] userposts = {user1_post,user2_post,user3_post,user4_post};
		JPanel[] userpanels = {user1_HTpanel,user2_HTpanel,user3_HTpanel,user4_HTpanel};
		
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String filterword;
				for ( JLabel filter : filterLabels){
					
					filterword = filter.getText();
					if(!filterword.isEmpty()){
						
						for(int i = 0; i < userposts.length; i++){
							if (userposts[i].getText().contains(filterword)){
								userpanels[i].setVisible(false);
							}
						}
					}
					
				}
				
				filters_panel.setVisible(false);
				tabbedPane.setVisible(true);
				filterTextField.setText(defaultFilterMessage);
				filterTextField.setForeground(SystemColor.inactiveCaption);
		
				
			}
		});
			
	}
	
	void removeFilters(String filterword){
		JTextPane[] userposts = {user1_post,user2_post,user3_post,user4_post};
		JPanel[] userpanels = {user1_HTpanel,user2_HTpanel,user3_HTpanel,user4_HTpanel};
		
		for(int i = 0; i < userposts.length; i++){
			if (userposts[i].getText().contains(filterword)){
				userpanels[i].setVisible(true);
			}
		}
		
		
	}
	public void ProfileSetUp (String name, String usr, ImageIcon pic) {
		
	}
	//used for buttons clicks no touch
	private class SwingAction extends AbstractAction {
		public SwingAction() {
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	public void viewProfile(String name) {
		
	}
	}
