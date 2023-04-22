using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lecture10_Lab_700
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

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            comboBox2.Items.Clear();
            //เลือก Action
            if (comboBox1.SelectedIndex == 0)
            {
                comboBox2.Items.Add("Mario");
                comboBox2.Items.Add("Call Of Duty");
                comboBox2.Items.Add("Warframe");
                comboBox2.SelectedIndex = 0;
            }
            //เลือก Strategy
            else if (comboBox1.SelectedIndex == 1)
            {
                comboBox2.Items.Add("Heart Of Iron");
                comboBox2.Items.Add("Company Of Hero");
                comboBox2.Items.Add("Men Of War");
                comboBox2.Items.Add("Civilization");
                comboBox2.SelectedIndex = 0;
            }
            else if (comboBox1.SelectedIndex == 2)
            {
                comboBox2.Items.Add("Minecraft");
                comboBox2.Items.Add("Legend Of Zelda");
                comboBox2.SelectedIndex = 0;
            }
        }
        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            string game_name = comboBox2.SelectedItem.ToString();
            double price = 0;
            if (game_name == "Mario") price = 2;
            if (game_name == "Call Of Duty") price = 3;
            if (game_name == "Warframe") price = 2;

            if (game_name == "Heart Of Iron") price = 4;
            if (game_name == "Company Of Hero") price = 2.5;
            if (game_name == "Men Of War") price = 1.5;
            if (game_name == "Civilization") price = 3.25;

            if (game_name == "Minecraft") price = 5;
            if (game_name == "Legend Of Zelda") price = 3;

            textBox1.Text = price + "";
        }
    }
}
