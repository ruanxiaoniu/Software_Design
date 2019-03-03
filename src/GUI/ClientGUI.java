package GUI;

import Factory.*;
import Insurance.AutoInsurance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends JFrame {
    private JPanel jp_top=new JPanel();
    private JPanel jp_bottm=new JPanel();
    private JPanel jp_center=new JPanel();
    private JTextArea jta=new JTextArea("Auto insurance information will be shown here.");
    private JLabel jl=new JLabel("Insurance Types");//标签
    private String[] insurance={"Body Injur liability","Collision liability","Person Injur liability","Property liability","Com liability","Luxury Car liability"};
    private JComboBox jcb=new JComboBox(insurance);//下拉框
    private JButton jb_show=new JButton("Show Info");
    private JButton jb_exit=new JButton("Exit");

    //创建一个监听对象
    ButtonListen buttonListen=new ButtonListen(jta,jcb);
    public void setJta(JTextArea jta) {
        this.jta = jta;
    }

    public JTextArea getJta() {
        return jta;
    }

    public void setJcb(JComboBox jcb) {
        this.jcb = jcb;
    }

    public JComboBox getJcb() {

        return jcb;
    }


    //设置字体
    Font font=new Font("黑体",Font.BOLD,18);
    public ClientGUI(){
        super("Factory Method Pattern- Auto Insurance.");
        Init();
        setVisible(true);
    }

    //初始化
    public void Init(){
        setSize(800,600);//初始化窗口大小
        setLocationRelativeTo(null);//设置自动剧中
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置点击关闭窗口
        jta.setLineWrap(true);//设置文本框自动换行
        jp_top.setLayout(new BorderLayout());//设置面板的布局方式

        //设置JPanel大小
        jp_top.setPreferredSize(new Dimension(800,400));
        jp_bottm.setPreferredSize(new Dimension(800,100));
        JScrollPane jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        //设置字体格式
        jta.setFont(new Font("黑体",Font.BOLD,25));
        jl.setFont(font);
        jcb.setFont(font);
        jb_show.setFont(font);
        jb_exit.setFont(font);
        //向面板中添加组件
        jp_center.add(jl);
        jp_center.add(jcb);
        jp_bottm.add(jb_show);
        jp_bottm.add(jb_exit);

        jp_top.add(jsp);
        add(jp_top,BorderLayout.NORTH);
        add(jp_center,BorderLayout.CENTER);
        add(jp_bottm,BorderLayout.SOUTH);

        //添加监听
        jb_show.addActionListener(buttonListen);
        jb_exit.addActionListener(buttonListen);
    }
    //监听

    public static void main(String[] args){
        ClientGUI cg=new ClientGUI();
    }
}

//监听类
class ButtonListen implements ActionListener{
    private JComboBox jcb;
    private JTextArea jta;
    public ButtonListen(JTextArea jta,JComboBox jcb){
        this.jcb=jcb;
        this.jta=jta;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show Info")){
            String insurance=(String)jcb.getSelectedItem();
            PolicyProducer pp=null;
            if(insurance.equals("Body Injur liability")){
                pp=new BodyInjurePolicy();
            }else if (insurance.equals("Collision liability")){
                pp=new CollionPolicy();
            }else if (insurance.equals("Com liability")){
                pp=new ComPolicy();
            }else if (insurance.equals("Luxury Car liability")){
                pp=new LucuryCarPolicy();
            }else if (insurance.equals("Person Injur liability")){
                pp=new PersonInjurPolicy();
            }else if (insurance.equals("Property liability")){
                pp=new PropertyPolicy();
            }
            String information=pp.getInsureObj().getInfo();
            jta.setText(information);
        }else if (e.getActionCommand().equals("Exit")){
            System.exit(0);
        }
    }
}