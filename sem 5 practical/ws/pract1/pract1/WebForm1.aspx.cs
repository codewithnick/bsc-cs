using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pract1
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Button1_Click(object sender, EventArgs e)
        {
            WebService1 ws = new WebService1();

            if (Celcius.Checked)
            {
                TextBox2.Text = ws.ctof(Convert.ToDouble(TextBox1.Text)).ToString();
            }
            else if (Fahrenheit.Checked)
            {
                TextBox2.Text = ws.ftoc(Convert.ToDouble(TextBox1.Text)).ToString();
            }
        }
    }
}