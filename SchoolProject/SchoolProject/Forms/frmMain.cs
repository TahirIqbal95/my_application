using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace School_Management_System_pro.Forms
{
    public partial class frmMain : Form
    {
       
        public frmMain()
        {
            InitializeComponent();
        }

        private void btnmenu_Click_1(object sender, EventArgs e)
        {
            if (slidermenu.Width == 50)
            {
                slidermenu.Visible = false;
                slidermenu.Width = 260;
                PanelTransition2.ShowSync(slidermenu);
                PanelTransition.ShowSync(logo);
            }
            else
            {

                PanelTransition.HideSync(logo);
                slidermenu.Visible = false;
                slidermenu.Width = 50;
                LogoTransition.ShowSync(slidermenu);

            }
        }

        private void bunifuImageButton1_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnmasterentry_Click(object sender, EventArgs e)
        {
            OpenForm(new frmPanel());
        }

        private void OpenForm(object formname)
        {
            if (this.mainpanel.Controls.Count > 0)
                this.mainpanel.Controls.RemoveAt(0);

            Form f = formname as Form;
            f.TopLevel = false;
            f.Dock = DockStyle.Fill;
            this.mainpanel.Controls.Add(f);
            this.mainpanel.Tag = f;
            f.Show();

        }



     

   
    }
}
