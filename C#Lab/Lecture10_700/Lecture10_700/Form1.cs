using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lecture10_700
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog opfd = new OpenFileDialog();//สร้าง Object opfd
            DialogResult user_choose = opfd.ShowDialog();//แสดงให้ user เห็น โดยให้เลือก
            if (user_choose == DialogResult.OK)
            {
                textBox1.Text = opfd.FileName;
                //สร้าง Object Image จากไฟล์
                Image img = Image.FromFile(textBox1.Text);
                //กำหนดให้รูปไปโปล่ใน picture box
                pictureBox1.Image = img;
            }

        }

        private void change_sizemode()
        {
            if (radioButton1.Checked) pictureBox1.SizeMode = PictureBoxSizeMode.Normal;

            if (radioButton2.Checked) pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;

            if (radioButton3.Checked) pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;

            if (radioButton4.Checked) pictureBox1.SizeMode = PictureBoxSizeMode.CenterImage;

            if (radioButton5.Checked) pictureBox1.SizeMode = PictureBoxSizeMode.Zoom;
        }
        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            change_sizemode();
        }
        private void radioButton2_CheckedChanged(object sender, EventArgs e)
            {
                change_sizemode();
            }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
            {
                change_sizemode();
            }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
            {
                change_sizemode();
            }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
            {
                change_sizemode();
            }
        }
    }