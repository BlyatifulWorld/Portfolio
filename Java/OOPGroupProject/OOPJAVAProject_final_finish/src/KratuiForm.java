import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class KratuiForm extends javax.swing.JFrame {

    private cafeService cafe_service;
    
    private void setTableFromList( ArrayList<cafe> results){
        String col[] = {"ID","Name","Price","Type","Cal","Image"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0){
          @Override
          public Class<?> getColumnClass(int column) {
            switch(column) {
                case 0: return Integer.class;
                case 1: return String.class;
                case 2: return Double.class;
                case 3: return String.class;
                case 4: return Double.class;
                case 5: return ImageIcon.class;
                default: return Object.class;
            }
            }
        };
        
        jTable1.setRowHeight(80);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.setModel(tableModel);
        
        for(int i=0;i<results.size();i++){
            cafe p = results.get(i);
            int id = p.getId();
            String name = p.getName();
            double price = p.getPrice();
            String type = p.getType();
            double cal = p.getCal();
            BufferedImage picture = p.getPicture();
            Image dimg = picture.getScaledInstance(80, 80,Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(dimg);
            
            Object[] row = {id, name, price, type, cal, icon};
            tableModel.addRow(row); 
        }
    }
    
    public KratuiForm() {
        initComponents();
        try{
            cafe_service = new cafeService();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        Search_name_field = new javax.swing.JTextField();
        Search_price = new javax.swing.JLabel();
        Search_price_field1 = new javax.swing.JTextField();
        SearchPrice_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Search_price_field2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FoodName_button1 = new javax.swing.JRadioButton();
        Price_button2 = new javax.swing.JRadioButton();
        SearchName_Button = new javax.swing.JButton();
        Type_Button3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Price_text = new javax.swing.JLabel();
        Price_Field1 = new javax.swing.JTextField();
        FoodID_text1 = new javax.swing.JLabel();
        FoodID_Field1 = new javax.swing.JTextField();
        FoodName_text1 = new javax.swing.JLabel();
        FoodName_Field1 = new javax.swing.JTextField();
        Calro_text1 = new javax.swing.JLabel();
        Food_Field1 = new javax.swing.JTextField();
        Type_text2 = new javax.swing.JLabel();
        Cal_Field1 = new javax.swing.JTextField();
        Img_text2 = new javax.swing.JLabel();
        img_Field1 = new javax.swing.JTextField();
        ImgButton = new javax.swing.JButton();
        Add_Button1 = new javax.swing.JButton();
        Del_Button = new javax.swing.JButton();
        Update_Button1 = new javax.swing.JButton();
        Img_area = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(80, 100, 121));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Kratui_logo.png"))); // NOI18N
        jLabel1.setText("Kratui Data Manager Program");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(234, 247, 252));

        jPanel4.setBackground(new java.awt.Color(234, 247, 252));

        label1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        label1.setText("Search by name");

        Search_name_field.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Search_name_field.setForeground(new java.awt.Color(90, 112, 180));
        Search_name_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Search_price.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Search_price.setText("Search by price");

        Search_price_field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Search_price_field1.setForeground(new java.awt.Color(90, 112, 180));
        Search_price_field1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SearchPrice_Button.setBackground(new java.awt.Color(88, 107, 153));
        SearchPrice_Button.setForeground(new java.awt.Color(255, 255, 255));
        SearchPrice_Button.setText("Search");
        SearchPrice_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPrice_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel2.setText("to");

        Search_price_field2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Search_price_field2.setForeground(new java.awt.Color(90, 112, 180));
        Search_price_field2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setText("Sort by");

        buttonGroup1.add(FoodName_button1);
        FoodName_button1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        FoodName_button1.setText("Food Name");
        FoodName_button1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FoodName_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodName_button1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Price_button2);
        Price_button2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Price_button2.setText("Price");
        Price_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price_button2ActionPerformed(evt);
            }
        });

        SearchName_Button.setBackground(new java.awt.Color(88, 107, 153));
        SearchName_Button.setForeground(new java.awt.Color(255, 255, 255));
        SearchName_Button.setText("Search");
        SearchName_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchName_ButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Type_Button3);
        Type_Button3.setText("Type");
        Type_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Type_Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Search_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(73, 73, 73)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search_price_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoodName_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search_price_field2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Price_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(Type_Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addComponent(Search_name_field))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchPrice_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchName_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchName_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_price_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_price_field2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchPrice_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FoodName_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type_Button3))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 162, 190));

        Price_text.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Price_text.setForeground(new java.awt.Color(255, 255, 255));
        Price_text.setText("Price");

        Price_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        FoodID_text1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        FoodID_text1.setForeground(new java.awt.Color(255, 255, 255));
        FoodID_text1.setText("Food ID");

        FoodID_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        FoodName_text1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        FoodName_text1.setForeground(new java.awt.Color(255, 255, 255));
        FoodName_text1.setText("Food Name");

        FoodName_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        Calro_text1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Calro_text1.setForeground(new java.awt.Color(255, 255, 255));
        Calro_text1.setText("Calrories");

        Food_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        Type_text2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Type_text2.setForeground(new java.awt.Color(255, 255, 255));
        Type_text2.setText("Type of Food");

        Cal_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        Img_text2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Img_text2.setForeground(new java.awt.Color(255, 255, 255));
        Img_text2.setText("Image");

        img_Field1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N

        ImgButton.setText("Browse");
        ImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImgButtonActionPerformed(evt);
            }
        });

        Add_Button1.setBackground(new java.awt.Color(141, 151, 172));
        Add_Button1.setText("Add");
        Add_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Button1ActionPerformed(evt);
            }
        });

        Del_Button.setBackground(new java.awt.Color(141, 151, 172));
        Del_Button.setText("Delete");
        Del_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_ButtonActionPerformed(evt);
            }
        });

        Update_Button1.setBackground(new java.awt.Color(141, 151, 172));
        Update_Button1.setText("Update");
        Update_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Button1ActionPerformed(evt);
            }
        });

        Img_area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img_area.setText("Image");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Img_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoodName_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoodID_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Type_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calro_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(img_Field1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ImgButton))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FoodID_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FoodName_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Price_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Food_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cal_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Img_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(Update_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Del_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoodID_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FoodID_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoodName_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FoodName_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Food_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calro_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cal_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Img_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgButton))
                .addGap(28, 28, 28)
                .addComponent(Img_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgButtonActionPerformed
           JFileChooser fileChooser = new JFileChooser();
        final int option = fileChooser.showOpenDialog(this);
            if (option != JFileChooser.APPROVE_OPTION) {
                return;
            }

            final File selectedFile = fileChooser.getSelectedFile();

            URL url;
            try {
                url = selectedFile.toURI().toURL();
            } catch (final MalformedURLException e1) {
                throw new RuntimeException(e1);
            }
            //jTextField4 : เก็บตำแหน่งไฟล์รูปที่อยู่ในเครื่อง
            img_Field1.setText(selectedFile.getAbsolutePath());
            try{
                BufferedImage img = ImageIO.read(new File(selectedFile.getAbsolutePath()));
                Image dimg = img.getScaledInstance(Img_area.getWidth(), Img_area.getHeight(),
                Image.SCALE_SMOOTH);
                final ImageIcon icon = new ImageIcon(dimg);
                //jLabel9 : ที่แสดงรูป
                Img_area.setText("");
                Img_area.setIcon(icon);
            }catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_ImgButtonActionPerformed

    private void Add_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Button1ActionPerformed
        int id = Integer.parseInt(FoodID_Field1.getText());
        String name = FoodName_Field1.getText();
        double price = Double.parseDouble(Price_Field1.getText());
        String type = Food_Field1.getText();
        double cal = Double.parseDouble(Cal_Field1.getText());
        
        BufferedImage picture =  null;
        try{
            picture = ImageIO.read(new File(img_Field1.getText()));
        }catch(Exception e){
            e.printStackTrace();
         }
        
        boolean success = cafe_service.insertcafe(id, name, price, type, cal, picture);
        if(success){
            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลสำเร็จ");
        }else{
            JOptionPane.showMessageDialog(null, "มีข้อผิดพลาดในการเพิ่ม");
        }
    }//GEN-LAST:event_Add_Button1ActionPerformed

    private void SearchName_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchName_ButtonActionPerformed
     String search_name = Search_name_field.getText();
        
        ArrayList<cafe> results = cafe_service.searchByName(search_name);
        setTableFromList(results);
    }//GEN-LAST:event_SearchName_ButtonActionPerformed

    private void SearchPrice_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPrice_ButtonActionPerformed
     double min_price = Double.parseDouble(Search_price_field1.getText());
        double max_price = Double.parseDouble(Search_price_field2.getText());
        
        ArrayList<cafe> results = cafe_service.searchByPrice(min_price, max_price);
        //แสดงผลที่ table
        setTableFromList(results);
    }//GEN-LAST:event_SearchPrice_ButtonActionPerformed

    private void Update_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Button1ActionPerformed
        int id = Integer.parseInt(FoodID_Field1.getText());
        String name = FoodName_Field1.getText();
        double price = Double.parseDouble(Price_Field1.getText());
        String type = Food_Field1.getText();
        double cal = Double.parseDouble(Cal_Field1.getText());
        BufferedImage picture =  null;
        try{
             picture = ImageIO.read(new File(img_Field1.getText()));
        }catch(Exception e){
             e.printStackTrace();
         }
        boolean success = cafe_service.updatecafe(id, name, price, type, cal, picture);
        if(success){
            JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลสำเร็จ");
        }else{
            JOptionPane.showMessageDialog(null, "มีข้อผิดพลาดในการแก้ไข");
        }
    }//GEN-LAST:event_Update_Button1ActionPerformed

    private void Del_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_ButtonActionPerformed
        int id = Integer.parseInt(FoodID_Field1.getText());
        
        boolean success = cafe_service.deletecafe(id);
        if(success){
            JOptionPane.showMessageDialog(null, "ลบข้อมูลสำเร็จ");
        }else{
            JOptionPane.showMessageDialog(null, "มีข้อผิดพลาดในการลบ");
        }
    }//GEN-LAST:event_Del_ButtonActionPerformed

    private void FoodName_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodName_button1ActionPerformed
        ArrayList<cafe> results = new ArrayList<cafe>();
        if(FoodName_button1.isSelected()){
            results = cafe_service.sortByName();
        }
        setTableFromList(results);
    }//GEN-LAST:event_FoodName_button1ActionPerformed

    private void Price_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price_button2ActionPerformed
        ArrayList<cafe> results = new ArrayList<cafe>();
        if(Price_button2.isSelected()){
            results = cafe_service.sortByPrice();
        }
        setTableFromList(results);
    }//GEN-LAST:event_Price_button2ActionPerformed

    private void Type_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Type_Button3ActionPerformed
        ArrayList<cafe> results = new ArrayList<cafe>();

        if(Type_Button3.isSelected()){
            results = cafe_service.sortByType();
        }
        setTableFromList(results);
    }//GEN-LAST:event_Type_Button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KratuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KratuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KratuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KratuiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KratuiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button1;
    private javax.swing.JTextField Cal_Field1;
    private javax.swing.JLabel Calro_text1;
    private javax.swing.JButton Del_Button;
    private javax.swing.JTextField FoodID_Field1;
    private javax.swing.JLabel FoodID_text1;
    private javax.swing.JTextField FoodName_Field1;
    private javax.swing.JRadioButton FoodName_button1;
    private javax.swing.JLabel FoodName_text1;
    private javax.swing.JTextField Food_Field1;
    private javax.swing.JButton ImgButton;
    private javax.swing.JLabel Img_area;
    private javax.swing.JLabel Img_text2;
    private javax.swing.JTextField Price_Field1;
    private javax.swing.JRadioButton Price_button2;
    private javax.swing.JLabel Price_text;
    private javax.swing.JButton SearchName_Button;
    private javax.swing.JButton SearchPrice_Button;
    private javax.swing.JTextField Search_name_field;
    private javax.swing.JLabel Search_price;
    private javax.swing.JTextField Search_price_field1;
    private javax.swing.JTextField Search_price_field2;
    private javax.swing.JRadioButton Type_Button3;
    private javax.swing.JLabel Type_text2;
    private javax.swing.JButton Update_Button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField img_Field1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
