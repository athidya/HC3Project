import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ScrollPaneConstants;

public class ActivityFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

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
		contentPane.setLayout(new BorderLayout(0, 0));
		
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
		
		JPanel searchtabPanel = new JPanel();
		searchtabPanel.setBackground(Color.WHITE);
		ImageIcon tab2Icon = new ImageIcon(this.getClass().getResource("search.png"));
		tabbedPane.addTab("", tab2Icon, searchtabPanel, null);
		searchtabPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setAutoscrolls(true);
		comboBox.setBackground(SystemColor.activeCaption);
		comboBox.setEditable(true);
		comboBox.setBounds(0, 0, 299, 30);
		searchtabPanel.add(comboBox);
		
		JPanel notiftabPanel = new JPanel();
		ImageIcon tab3Icon = new ImageIcon(this.getClass().getResource("bell.png"));
		tabbedPane.addTab("", tab3Icon, notiftabPanel, null);
		notiftabPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.WHITE);
		tabbedPane_1.setBorder(null);
		notiftabPanel.add(tabbedPane_1, BorderLayout.CENTER);
		
		JScrollPane followingtabPanel = new JScrollPane();
		followingtabPanel.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Following", null, followingtabPanel, null);
		tabbedPane_1.setBackgroundAt(0, Color.WHITE);
		
		JPanel youtabPanel = new JPanel();
		youtabPanel.setBackground(Color.WHITE);
		tabbedPane_1.addTab("You", null, youtabPanel, null);
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
		
		JLabel lblMentions = new JLabel("Mentions");
		mentionPanel.add(lblMentions);
		
		JScrollPane followPanel = new JScrollPane();
		followPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		followPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		followPanel.setBackground(Color.WHITE);
		togglePanels.add(followPanel, "followCard");
		
		JLabel lblFollows = new JLabel("Follows");
		followPanel.add(lblFollows);
		
		JScrollPane likerepostPanel = new JScrollPane();
		likerepostPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		likerepostPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		likerepostPanel.setBackground(Color.WHITE);
		togglePanels.add(likerepostPanel, "likeCard");
		
		JLabel lblLikesAndReposts = new JLabel("Likes and Reposts");
		likerepostPanel.add(lblLikesAndReposts);
		
		JToggleButton mentionToggle = new JToggleButton();
		JToggleButton followToggle = new JToggleButton();
		JToggleButton likerepostToggle = new JToggleButton();
		
//**************************** Cole's Part ************************************************************************
		JPanel dmtabpanel = new JPanel();
		ImageIcon tab4Icon = new ImageIcon(this.getClass().getResource("message.png"));
		tabbedPane.addTab("", tab4Icon, dmtabpanel, null);
		dmtabpanel.setLayout(new BorderLayout());
		
		JPanel cardLayoutPanel = new JPanel();
		cardLayoutPanel.setLayout(new CardLayout());
		dmtabpanel.add(cardLayoutPanel);
		
		//***************************************create all panels**********************************************
				JPanel messagePanel = new JPanel();
				JPanel dmPanel = new JPanel();
				JPanel profilePanel = new JPanel();
				JPanel composePostPanel = new JPanel();
					
		//***************************************Messages Panel Components****************************************
				JLabel messageTitle = new JLabel("Messages");
				JButton composeMessage = new JButton("Compose");
				JSeparator separator = new JSeparator();
				JSeparator separator_1 = new JSeparator();
				JSeparator separator_2 = new JSeparator();
				JSeparator separator_3 = new JSeparator();		
				JLabel msg3NameLabel = new JLabel("Patrick");
				JLabel msg1NameLabel = new JLabel("Kathy");
				JLabel msg2NameLabel = new JLabel("John, Ian");
				JLabel msg1TimeLabel = new JLabel("15 mins ago");
				JLabel msg2TimeLabel = new JLabel("3 hours ago");
				JLabel msg3TimeLabel = new JLabel("19 hours ago");
				JLabel lblNewLabel_6 = new JLabel("Message 3");
				JLabel lblNewLabel_7 = new JLabel("Message 2");
				JLabel lblNewLabel_8 = new JLabel("Message 1");
				JLabel newLabel = new JLabel("New!");
				JLabel msg2 = new JLabel("");
				JLabel msg1 = new JLabel("");
				JLabel msg3 = new JLabel("");
				JLabel dmName = new JLabel("");	
				
				messagePanel.setLayout(null);
				messageTitle.setBounds(100, 30, 100, 30);
				messageTitle.setBorder(null);
				messageTitle.setHorizontalAlignment(JLabel.CENTER);
				messageTitle.setFont(new Font("Serif", Font.BOLD, 20));		
				messagePanel.add(messageTitle);
				
				composeMessage.setBounds(220, 0, 70, 30);
				composeMessage.setHorizontalAlignment(JLabel.CENTER);
				composeMessage.setFont(new Font("Serif", Font.PLAIN, 9));
				composeMessage.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                messagePanel.setVisible(false);
		                composePostPanel.setVisible(true);
		            }
		        });
				messagePanel.add(composeMessage);
				
				cardLayoutPanel.add(messagePanel);
				messagePanel.add(messageTitle);
				messagePanel.add(composeMessage);
						
				separator.setBounds(0, 141, 297, 2);
				messagePanel.add(separator);
						
				separator_1.setBounds(0, 241, 297, 2);
				messagePanel.add(separator_1);
				
				separator_2.setBounds(0, 341, 297, 2);
				messagePanel.add(separator_2);
						
				separator_3.setBounds(0, 421, 297, 2);
				messagePanel.add(separator_3);
				
				msg3NameLabel.setBounds(10, 356, 44, 16);
				messagePanel.add(msg3NameLabel);
					
				msg1NameLabel.setBounds(10, 156, 38, 16);
				messagePanel.add(msg1NameLabel);	
				
				msg2NameLabel.setBounds(10, 256, 56, 16);
				messagePanel.add(msg2NameLabel);	
				
				msg1TimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				msg1TimeLabel.setBounds(220, 156, 70, 16);
				messagePanel.add(msg1TimeLabel);		
				
				msg2TimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				msg2TimeLabel.setBounds(220, 256, 70, 16);
				messagePanel.add(msg2TimeLabel);
						
				msg3TimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				msg3TimeLabel.setBounds(215, 356, 75, 16);
				messagePanel.add(msg3TimeLabel);		
				
				lblNewLabel_6.setBounds(10, 392, 100, 16);
				messagePanel.add(lblNewLabel_6);
					
				lblNewLabel_7.setBounds(10, 312, 86, 16);
				messagePanel.add(lblNewLabel_7);
						
				lblNewLabel_8.setBounds(10, 212, 86, 16);
				messagePanel.add(lblNewLabel_8);
						
				newLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
				newLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				newLabel.setBounds(254, 141, 22, 16);
				messagePanel.add(newLabel);
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
					}
				});
				msg2.setBounds(0, 241, 297, 100);
				messagePanel.add(msg2);	
				
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
					}
				});
				msg1.setBounds(0, 141, 297, 102);
				messagePanel.add(msg1);
						
				msg3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						msg3.setBorder(LineBorder.createBlackLineBorder());
					}
					@Override
					public void mouseExited(MouseEvent e) {
						msg3.setBorder(null);
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						dmName.setText(msg3NameLabel.getText());
						messagePanel.setVisible(false);
						dmPanel.setVisible(true);
					}
				});
				msg3.setBounds(0, 341, 297, 82);
				messagePanel.add(msg3);		
				
				dmName.setBounds(65, 28, 180, 43);
				dmName.setHorizontalAlignment(SwingConstants.CENTER);
				
				//******************************************end of Messages Panel***************************************
				
				//******************************************Direct Messages Panel Components****************************
						
						cardLayoutPanel.add(dmPanel, "name_247023874062748");
						
						JTextField txtSearch = new JTextField();
						JLabel topLabel = new JLabel("");
						JButton button = new JButton("X");
						JSeparator separator_4 = new JSeparator();
						JTextField enterUsrtxt = new JTextField();
						JLabel otherusrtxt = new JLabel("hi");
						JLabel usrtxt1 = new JLabel("");
						JLabel usrtxt2 = new JLabel("");
						JLabel usrtxt3 = new JLabel("");
						JLabel usrtxt4 = new JLabel("");
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
						messagePanel.add(txtSearch);
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
						messagePanel.add(btnProfile);
						topLabel.setBounds(0, 0, 297, 143);
						messagePanel.add(topLabel);			
						
						button.setBounds(0, 0, 50, 50);
						button.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								messagePanel.setVisible(true);
								dmPanel.setVisible(false);
							}
						});
						dmPanel.setLayout(null);
						dmPanel.add(button);
								
						dmName.setFont(new Font("Tahoma", Font.PLAIN, 20));
						dmPanel.add(dmName);
								
						separator_4.setBounds(0, 373, 297, 2);
						dmPanel.add(separator_4);
								
						enterUsrtxt.setBounds(33, 388, 180, 22);
						dmPanel.add(enterUsrtxt);
						enterUsrtxt.setColumns(10);		
						
						otherusrtxt.setBounds(12, 326, 122, 16);
						otherusrtxt.setBorder(LineBorder.createBlackLineBorder());
						dmPanel.add(otherusrtxt);		
						
						usrtxt1.setBounds(163, 326, 122, 16);
						dmPanel.add(usrtxt1);		
						
						usrtxt2.setBounds(163, 246, 122, 16);
						dmPanel.add(usrtxt2);
								
						usrtxt3.setBounds(163, 166, 122, 16);
						dmPanel.add(usrtxt3);		
						
						usrtxt4.setBounds(163, 86, 122, 16);
						dmPanel.add(usrtxt4);		
						
						sendButton.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								if (!enterUsrtxt.getText().equals("")){
									usrtxt4.setText(usrtxt3.getText());
									usrtxt3.setText(usrtxt2.getText());
									usrtxt2.setText(usrtxt1.getText());
									usrtxt1.setText(enterUsrtxt.getText());
									
									
									if (!usrtxt1.getText().equals("")){
										otherusrtxt.setBounds(12, 246, 122, 16);
										usrtxt1.setBorder(LineBorder.createBlackLineBorder());
									}
									if (!usrtxt2.getText().equals("")){
										otherusrtxt.setBounds(12, 166, 122, 16);
										usrtxt2.setBorder(LineBorder.createBlackLineBorder());
									}
									if (!usrtxt3.getText().equals("")){
										otherusrtxt.setBounds(12, 86, 122, 16);
										usrtxt3.setBorder(LineBorder.createBlackLineBorder());
									}
									if (!usrtxt4.getText().equals("")){
										otherusrtxt.setVisible(false);
										usrtxt4.setBorder(LineBorder.createBlackLineBorder());
									}
								}
							}
						});
						sendButton.setBackground(Color.GREEN);
						sendButton.setBounds(218, 388, 67, 22);
						dmPanel.add(sendButton);
						
				//**********************************************end of Direct Message Panel********************************************
						
				//*********************************************User Profile Panel Components***********************************
						cardLayoutPanel.add(profilePanel, "name_355071876155899");
						profilePanel.setLayout(null);
						
						JLabel profPicLabel = new JLabel("");
						JLabel usrNameLabel = new JLabel("Mr. Smiley");
						JButton btnSendMessage = new JButton("Send Message");
						JButton btnNewButton_1 = new JButton("Add to Custom Feed");
						
						profPicLabel.setBounds(24, 53, 100, 100);
						profPicLabel.setIcon(new ImageIcon(new ImageIcon("src//images//face.png").getImage().getScaledInstance(profPicLabel.getWidth(), profPicLabel.getHeight(), Image.SCALE_DEFAULT)));
						profPicLabel.setBorder(LineBorder.createBlackLineBorder());
						profilePanel.add(profPicLabel);
						
						usrNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
						usrNameLabel.setBounds(24, 166, 100, 16);
						profilePanel.add(usrNameLabel);
						
						
						btnSendMessage.setBounds(136, 53, 149, 49);
						profilePanel.add(btnSendMessage);
						
						
						btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
						btnNewButton_1.setBounds(136, 133, 149, 49);
						profilePanel.add(btnNewButton_1);
						
						JButton closeProfilebtn = new JButton("X");
						closeProfilebtn.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								profilePanel.setVisible(false);
								messagePanel.setVisible(true);
							}
						});
						closeProfilebtn.setBounds(0, 0, 51, 40);
						profilePanel.add(closeProfilebtn);
				//*******************************************end of User Profile Panel***************************************
						
				//*******************************************Compose Post Panel Components***************************************
						cardLayoutPanel.add(composePostPanel, "name_414136068082115");
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
						cameraLabel.setIcon(new ImageIcon(new ImageIcon("src//images//camera.png").getImage().getScaledInstance(cameraLabel.getWidth(), cameraLabel.getHeight(), Image.SCALE_DEFAULT)));
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
						videoLabel.setIcon(new ImageIcon(new ImageIcon("src//images//video.png").getImage().getScaledInstance(videoLabel.getWidth(), videoLabel.getHeight(), Image.SCALE_DEFAULT)));
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
						audioLabel.setIcon(new ImageIcon(new ImageIcon("src//images//audio.png").getImage().getScaledInstance(audioLabel.getWidth(), audioLabel.getHeight(), Image.SCALE_DEFAULT)));
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
	
	}
	
	//used for buttons clicks no touch
	private class SwingAction extends AbstractAction {
		public SwingAction() {
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	}
