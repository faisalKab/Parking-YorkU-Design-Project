import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.Dimension dimension18 = managementDashboard1.getSize();
        java.awt.event.ComponentListener componentListener19 = null;
        managementDashboard1.removeComponentListener(componentListener19);
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.awt.Point point22 = managementDashboard1.getPopupLocation(mouseEvent21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(point22);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.Insets insets3 = managementDashboard1.getInsets();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.image.ColorModel colorModel8 = managementDashboard5.getColorModel();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard5.getUI();
        managementDashboard1.setUI(panelUI9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.awt.Point point12 = managementDashboard1.getToolTipLocation(mouseEvent11);
        managementDashboard1.setFocusCycleRoot(false);
        boolean boolean15 = managementDashboard1.isDisplayable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(insets3);
        org.junit.Assert.assertNotNull(colorModel8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        managementDashboard1.move((int) (short) 100, 9);
        boolean boolean10 = managementDashboard1.isLightweight();
        managementDashboard1.repaint();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.util.function.Consumer<java.lang.String> strConsumer5 = null;
        ManagementDashboard managementDashboard6 = new ManagementDashboard(strConsumer5);
        boolean boolean7 = managementDashboard6.isVisible();
        java.awt.LayoutManager layoutManager8 = managementDashboard6.getLayout();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard10.addPropertyChangeListener(propertyChangeListener11);
        java.awt.image.ImageProducer imageProducer13 = null;
        java.awt.Image image14 = managementDashboard10.createImage(imageProducer13);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        int int19 = managementDashboard18.countComponents();
        java.awt.Insets insets20 = managementDashboard18.getInsets();
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.image.ColorModel colorModel25 = managementDashboard22.getColorModel();
        javax.swing.plaf.PanelUI panelUI26 = managementDashboard22.getUI();
        managementDashboard18.setUI(panelUI26);
        int int28 = managementDashboard6.checkImage(image14, 5, (int) '4', (java.awt.image.ImageObserver) managementDashboard18);
        boolean boolean34 = managementDashboard1.imageUpdate(image14, 8, 9, 9, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertNotNull(image14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertNotNull(colorModel25);
        org.junit.Assert.assertNotNull(panelUI26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        java.awt.event.MouseMotionListener mouseMotionListener12 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener12);
        boolean boolean14 = managementDashboard1.getIgnoreRepaint();
        boolean boolean15 = managementDashboard1.isShowing();
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        boolean boolean16 = managementDashboard1.isFocusable();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        boolean boolean5 = managementDashboard1.isPaintingTile();
        managementDashboard1.requestFocus();
        java.awt.Dimension dimension7 = managementDashboard1.getSize();
        boolean boolean8 = managementDashboard1.isDoubleBuffered();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.awt.Image image6 = managementDashboard1.createImage((int) (byte) 1, (int) (short) -1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        java.awt.GraphicsConfiguration graphicsConfiguration8 = managementDashboard1.getGraphicsConfiguration();
        managementDashboard1.transferFocus();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNull(graphicsConfiguration8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        javax.swing.border.Border border15 = null;
        managementDashboard1.setBorder(border15);
        java.awt.Dimension dimension17 = managementDashboard1.getPreferredSize();
        managementDashboard1.paintImmediately(64, (int) 'a', (int) '#', (int) '#');
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        boolean boolean38 = managementDashboard23.isOpaque();
        java.awt.event.ComponentListener[] componentListenerArray39 = managementDashboard23.getComponentListeners();
        managementDashboard23.firePropertyChange("SUPERMAN", 'a', '4');
        java.awt.Event event44 = null;
        boolean boolean47 = managementDashboard23.mouseDown(event44, (int) 'a', (int) (short) -1);
        java.awt.image.ImageProducer imageProducer48 = null;
        java.awt.Image image49 = managementDashboard23.createImage(imageProducer48);
        javax.swing.KeyStroke keyStroke50 = null;
        managementDashboard23.unregisterKeyboardAction(keyStroke50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(componentListenerArray39);
        org.junit.Assert.assertArrayEquals(componentListenerArray39, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(image49);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Font font7 = managementDashboard1.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.Image image16 = managementDashboard12.createImage(13, (-1));
        managementDashboard12.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard20.addPropertyChangeListener(propertyChangeListener21);
        java.awt.event.FocusEvent.Cause cause23 = null;
        managementDashboard20.requestFocus(cause23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        managementDashboard20.addInputMethodListener(inputMethodListener25);
        java.awt.Point point27 = managementDashboard20.location();
        java.awt.Component component28 = managementDashboard12.findComponentAt(point27);
        java.awt.Component component29 = managementDashboard9.getComponentAt(point27);
        managementDashboard9.grabFocus();
        java.awt.Rectangle rectangle31 = managementDashboard9.bounds();
        java.awt.Rectangle rectangle32 = managementDashboard1.getBounds(rectangle31);
        managementDashboard1.setFocusCycleRoot(false);
        int int35 = managementDashboard1.getX();
        managementDashboard1.firePropertyChange("hi!", (long) (-1), (long) (short) -1);
        int int40 = managementDashboard1.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(point27);
        org.junit.Assert.assertNull(component28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component component9 = managementDashboard1.findComponentAt(4, (int) (short) 100);
        javax.swing.plaf.PanelUI panelUI10 = managementDashboard1.getUI();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        java.awt.event.FocusEvent.Cause cause15 = null;
        managementDashboard12.requestFocus(cause15);
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        managementDashboard12.addInputMethodListener(inputMethodListener17);
        managementDashboard12.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float24 = managementDashboard12.getAlignmentY();
        boolean boolean25 = managementDashboard12.isOptimizedDrawingEnabled();
        float float26 = managementDashboard12.getAlignmentX();
        java.awt.Font font27 = managementDashboard12.getFont();
        java.awt.FontMetrics fontMetrics28 = managementDashboard1.getFontMetrics(font27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(panelUI10);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(fontMetrics28);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotAvailability();
        java.lang.String str3 = parkingLot1.getLotName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        managementDashboard1.move((int) (short) 100, 9);
        int int10 = managementDashboard1.getDebugGraphicsOptions();
        java.awt.Component component13 = managementDashboard1.locate(32, 16);
        managementDashboard1.paintImmediately(0, 52, (int) (short) 0, 4);
        managementDashboard1.setIgnoreRepaint(false);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isVisible();
        java.awt.Image image26 = managementDashboard22.createImage(13, (-1));
        managementDashboard22.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener29 = null;
        managementDashboard22.removeMouseMotionListener(mouseMotionListener29);
        managementDashboard22.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray34 = managementDashboard22.getComponents();
        java.awt.Point point35 = managementDashboard22.location();
        java.util.function.Consumer<java.lang.String> strConsumer36 = null;
        ManagementDashboard managementDashboard37 = new ManagementDashboard(strConsumer36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        managementDashboard37.addPropertyChangeListener(propertyChangeListener38);
        managementDashboard37.enableInputMethods(true);
        java.awt.Dimension dimension42 = managementDashboard37.getMinimumSize();
        float float43 = managementDashboard37.getAlignmentX();
        managementDashboard37.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard37.validate();
        java.awt.Font font49 = managementDashboard37.getFont();
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.add((java.awt.Component) managementDashboard22, (java.lang.Object) managementDashboard37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(component13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNotNull(componentArray34);
        org.junit.Assert.assertNotNull(point35);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.5f + "'", float43 == 0.5f);
        org.junit.Assert.assertNotNull(font49);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        int int2 = managementAccountsView1.getHeight();
        javax.swing.JToolTip jToolTip3 = managementAccountsView1.createToolTip();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        jToolTip3.addMouseWheelListener(mouseWheelListener4);
        jToolTip3.setAutoscrolls(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jToolTip3);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray45 = managementDashboard32.getVetoableChangeListeners();
        managementDashboard32.firePropertyChange("PanelUI", (byte) -1, (byte) 0);
        java.awt.event.MouseEvent mouseEvent50 = null;
        java.awt.Point point51 = managementDashboard32.getPopupLocation(mouseEvent50);
        managementDashboard32.move(12, (int) (byte) 1);
        java.awt.event.ActionListener actionListener55 = null;
        javax.swing.KeyStroke keyStroke57 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard32.registerKeyboardAction(actionListener55, "PanelUI", keyStroke57, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray45);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray45, new java.beans.VetoableChangeListener[] {});
        org.junit.Assert.assertNull(point51);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.Dimension dimension26 = managementDashboard1.minimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isVisible();
        java.awt.Image image32 = managementDashboard28.createImage(13, (-1));
        managementDashboard28.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        java.awt.Point point43 = managementDashboard36.location();
        java.awt.Component component44 = managementDashboard28.findComponentAt(point43);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.awt.image.ImageProducer imageProducer47 = null;
        java.awt.Image image48 = managementDashboard46.createImage(imageProducer47);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        managementDashboard50.addPropertyChangeListener(propertyChangeListener51);
        java.awt.event.FocusEvent.Cause cause53 = null;
        managementDashboard50.requestFocus(cause53);
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        managementDashboard50.addInputMethodListener(inputMethodListener55);
        int int57 = managementDashboard28.checkImage(image48, (java.awt.image.ImageObserver) managementDashboard50);
        java.awt.Container container58 = managementDashboard28.getParent();
        java.lang.Object obj59 = managementDashboard1.getClientProperty((java.lang.Object) container58);
        managementDashboard1.doLayout();
        java.awt.event.InputMethodListener inputMethodListener61 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertNull(component44);
        org.junit.Assert.assertNotNull(image48);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(container58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        managementDashboard1.doLayout();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray15 = managementDashboard1.getMouseWheelListeners();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray15);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray15, new java.awt.event.MouseWheelListener[] {});
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray38 = managementDashboard32.getPropertyChangeListeners();
        java.awt.Graphics graphics39 = null;
        managementDashboard32.update(graphics39);
        managementDashboard32.setFocusCycleRoot(false);
        managementDashboard32.addNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray38);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray38, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isMinimumSizeSet();
        java.awt.Graphics graphics11 = null;
        managementDashboard1.print(graphics11);
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = managementDashboard1.postEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean7 = managementDashboard1.requestDefaultFocus();
        managementDashboard1.updateUI();
        java.awt.Shape shape9 = null;
        managementDashboard1.setMixingCutoutShape(shape9);
        boolean boolean11 = managementDashboard1.isFocusOwner();
        managementDashboard1.revalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Graphics graphics31 = null;
        managementDashboard1.printAll(graphics31);
        boolean boolean33 = managementDashboard1.requestDefaultFocus();
        javax.swing.TransferHandler transferHandler34 = managementDashboard1.getTransferHandler();
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        boolean boolean37 = managementDashboard36.isVisible();
        java.awt.LayoutManager layoutManager38 = managementDashboard36.getLayout();
        java.awt.Graphics graphics39 = null;
        managementDashboard36.print(graphics39);
        java.lang.String str41 = managementDashboard36.getToolTipText();
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        boolean boolean44 = managementDashboard43.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        boolean boolean47 = managementDashboard46.isVisible();
        java.awt.Image image50 = managementDashboard46.createImage(13, (-1));
        managementDashboard46.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer53 = null;
        ManagementDashboard managementDashboard54 = new ManagementDashboard(strConsumer53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        managementDashboard54.addPropertyChangeListener(propertyChangeListener55);
        java.awt.event.FocusEvent.Cause cause57 = null;
        managementDashboard54.requestFocus(cause57);
        java.awt.event.InputMethodListener inputMethodListener59 = null;
        managementDashboard54.addInputMethodListener(inputMethodListener59);
        java.awt.Point point61 = managementDashboard54.location();
        java.awt.Component component62 = managementDashboard46.findComponentAt(point61);
        java.awt.Component component63 = managementDashboard43.getComponentAt(point61);
        managementDashboard43.grabFocus();
        java.awt.Rectangle rectangle65 = managementDashboard43.bounds();
        managementDashboard36.repaint(rectangle65);
        java.awt.FocusTraversalPolicy focusTraversalPolicy67 = null;
        managementDashboard36.setFocusTraversalPolicy(focusTraversalPolicy67);
        java.lang.Object obj69 = null;
        managementDashboard1.add((java.awt.Component) managementDashboard36, obj69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(layoutManager38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(image50);
        org.junit.Assert.assertNotNull(point61);
        org.junit.Assert.assertNull(component62);
        org.junit.Assert.assertNull(component63);
        org.junit.Assert.assertNotNull(rectangle65);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.Container container47 = managementDashboard32.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        boolean boolean53 = managementDashboard52.isVisible();
        java.awt.Image image56 = managementDashboard52.createImage(13, (-1));
        managementDashboard52.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Point point67 = managementDashboard60.location();
        java.awt.Component component68 = managementDashboard52.findComponentAt(point67);
        java.awt.Component component69 = managementDashboard49.getComponentAt(point67);
        java.awt.Point point70 = managementDashboard32.getLocation(point67);
        java.awt.Dimension dimension71 = managementDashboard32.getMinimumSize();
        java.lang.Object obj72 = managementDashboard32.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(image56);
        org.junit.Assert.assertNotNull(point67);
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNull(component69);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        boolean boolean8 = managementDashboard1.areFocusTraversalKeysSet((int) (byte) 1);
        java.awt.Dimension dimension9 = managementDashboard1.preferredSize();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        java.awt.Color color9 = managementDashboard1.getBackground();
        java.awt.Dimension dimension10 = managementDashboard1.getSize();
        java.awt.Event event11 = null;
        boolean boolean14 = managementDashboard1.mouseMove(event11, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        managementDashboard13.addPropertyChangeListener(propertyChangeListener14);
        java.awt.event.FocusEvent.Cause cause16 = null;
        managementDashboard13.requestFocus(cause16);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        managementDashboard13.addInputMethodListener(inputMethodListener18);
        java.awt.Point point20 = managementDashboard13.location();
        java.awt.Component component21 = managementDashboard5.findComponentAt(point20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = managementDashboard23.createImage(imageProducer24);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        managementDashboard27.addPropertyChangeListener(propertyChangeListener28);
        java.awt.event.FocusEvent.Cause cause30 = null;
        managementDashboard27.requestFocus(cause30);
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        managementDashboard27.addInputMethodListener(inputMethodListener32);
        int int34 = managementDashboard5.checkImage(image25, (java.awt.image.ImageObserver) managementDashboard27);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.util.Locale locale39 = managementDashboard36.getLocale();
        float float40 = managementDashboard36.getAlignmentY();
        java.awt.Component component41 = managementDashboard27.add((java.awt.Component) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard43.addPropertyChangeListener(propertyChangeListener44);
        java.util.Locale locale46 = managementDashboard43.getLocale();
        managementDashboard36.setLocale(locale46);
        managementDashboard36.addNotify();
        java.awt.Dimension dimension49 = managementDashboard36.getMaximumSize();
        boolean boolean50 = managementDashboard36.isFocusTraversalPolicySet();
        managementDashboard36.disable();
        boolean boolean52 = managementDashboard36.isRequestFocusEnabled();
        float float53 = managementDashboard36.getAlignmentX();
        java.awt.LayoutManager layoutManager54 = managementDashboard36.getLayout();
        managementDashboard1.setLayout(layoutManager54);
        java.awt.event.MouseMotionListener mouseMotionListener56 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(point20);
        org.junit.Assert.assertNull(component21);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(component41);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.5f + "'", float53 == 0.5f);
        org.junit.Assert.assertNotNull(layoutManager54);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean7 = managementDashboard1.requestDefaultFocus();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        java.io.PrintStream printStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printStream10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        managementDashboard1.enable();
        java.awt.Graphics graphics21 = null;
        managementDashboard1.printAll(graphics21);
        javax.swing.JPopupMenu jPopupMenu23 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu23);
        java.awt.event.MouseListener mouseListener25 = null;
        managementDashboard1.removeMouseListener(mouseListener25);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        managementDashboard14.addPropertyChangeListener(propertyChangeListener15);
        java.awt.event.FocusEvent.Cause cause17 = null;
        managementDashboard14.requestFocus(cause17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        managementDashboard14.addInputMethodListener(inputMethodListener19);
        managementDashboard14.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        boolean boolean26 = managementDashboard14.isValid();
        managementDashboard14.reshape(8, (int) ' ', (int) (short) 10, 1);
        java.awt.Font font32 = managementDashboard14.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard1.getFontMetrics(font32);
        java.awt.Event event34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = managementDashboard1.handleEvent(event34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.awt.Point point6 = managementDashboard1.getPopupLocation(mouseEvent5);
        boolean boolean7 = managementDashboard1.isPreferredSizeSet();
        boolean boolean9 = managementDashboard1.areFocusTraversalKeysSet(1);
        boolean boolean10 = managementDashboard1.isFocusTraversalPolicyProvider();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener11);
        javax.swing.JPopupMenu jPopupMenu13 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.setVerifyInputWhenFocusTarget(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jPopupMenu13);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        managementAccountsView1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = managementAccountsView1.isFocusTraversable();
        java.awt.Graphics graphics5 = null;
        managementAccountsView1.print(graphics5);
        managementAccountsView1.removeNotify();
        java.awt.event.MouseListener mouseListener8 = null;
        managementAccountsView1.addMouseListener(mouseListener8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = managementAccountsView1.getHierarchyBoundsListeners();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray10, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        boolean boolean91 = managementDashboard72.isRequestFocusEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        managementDashboard1.setEnabled(false);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener13);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Dimension dimension8 = managementDashboard1.minimumSize();
        java.awt.Dimension dimension9 = managementDashboard1.getPreferredSize();
        float float10 = managementDashboard1.getAlignmentX();
        java.awt.dnd.DropTarget dropTarget11 = managementDashboard1.getDropTarget();
        java.awt.Component component14 = managementDashboard1.findComponentAt(0, 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNull(dropTarget11);
        org.junit.Assert.assertNull(component14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.disable();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.transferFocusBackward();
        boolean boolean12 = managementDashboard1.isPaintingForPrint();
        managementDashboard1.move((int) (short) 0, 10);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isMinimumSizeSet();
        java.awt.Graphics graphics11 = null;
        managementDashboard1.print(graphics11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        boolean boolean18 = managementDashboard17.isVisible();
        java.awt.Image image21 = managementDashboard17.createImage(13, (-1));
        managementDashboard17.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        managementDashboard25.addPropertyChangeListener(propertyChangeListener26);
        java.awt.event.FocusEvent.Cause cause28 = null;
        managementDashboard25.requestFocus(cause28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener30);
        java.awt.Point point32 = managementDashboard25.location();
        java.awt.Component component33 = managementDashboard17.findComponentAt(point32);
        java.awt.Component component34 = managementDashboard14.getComponentAt(point32);
        managementDashboard14.grabFocus();
        java.awt.Rectangle rectangle36 = managementDashboard14.bounds();
        managementDashboard1.paintImmediately(rectangle36);
        managementDashboard1.repaint(3, (int) (byte) -1, (int) (short) 100, (int) (short) 10);
        java.awt.event.MouseListener[] mouseListenerArray43 = managementDashboard1.getMouseListeners();
        java.awt.Graphics graphics44 = null;
        managementDashboard1.printAll(graphics44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(point32);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNull(component34);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertNotNull(mouseListenerArray43);
        org.junit.Assert.assertArrayEquals(mouseListenerArray43, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        managementDashboard23.show();
        managementDashboard23.show();
        boolean boolean33 = managementDashboard23.getAutoscrolls();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener34 = null;
        managementDashboard23.addHierarchyBoundsListener(hierarchyBoundsListener34);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior36 = managementDashboard23.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior36 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior36.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        ManagementDashboard managementDashboard4 = new ManagementDashboard(strConsumer3);
        boolean boolean5 = managementDashboard4.isVisible();
        java.awt.Image image8 = managementDashboard4.createImage(13, (-1));
        managementDashboard4.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        java.awt.event.FocusEvent.Cause cause15 = null;
        managementDashboard12.requestFocus(cause15);
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        managementDashboard12.addInputMethodListener(inputMethodListener17);
        java.awt.Point point19 = managementDashboard12.location();
        java.awt.Component component20 = managementDashboard4.findComponentAt(point19);
        java.awt.Component component21 = managementDashboard1.getComponentAt(point19);
        managementDashboard1.setBounds((int) (short) 10, 11, (int) 'a', (int) (byte) 10);
        java.awt.Toolkit toolkit27 = managementDashboard1.getToolkit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNull(component21);
        org.junit.Assert.assertNotNull(toolkit27);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.awt.Dimension dimension45 = managementDashboard32.getMaximumSize();
        boolean boolean46 = managementDashboard32.isFocusTraversalPolicySet();
        managementDashboard32.repaint((long) (byte) 0);
        java.awt.Rectangle rectangle49 = managementDashboard32.getVisibleRect();
        java.awt.Dimension dimension50 = managementDashboard32.minimumSize();
        java.awt.event.ComponentListener componentListener51 = null;
        managementDashboard32.addComponentListener(componentListener51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(rectangle49);
        org.junit.Assert.assertNotNull(dimension50);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Event event11 = null;
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard13.findComponentAt(point28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.awt.image.ImageProducer imageProducer32 = null;
        java.awt.Image image33 = managementDashboard31.createImage(imageProducer32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard35.addPropertyChangeListener(propertyChangeListener36);
        java.awt.event.FocusEvent.Cause cause38 = null;
        managementDashboard35.requestFocus(cause38);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener40);
        int int42 = managementDashboard13.checkImage(image33, (java.awt.image.ImageObserver) managementDashboard35);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        managementDashboard44.addPropertyChangeListener(propertyChangeListener45);
        java.util.Locale locale47 = managementDashboard44.getLocale();
        float float48 = managementDashboard44.getAlignmentY();
        java.awt.Component component49 = managementDashboard35.add((java.awt.Component) managementDashboard44);
        boolean boolean50 = managementDashboard1.gotFocus(event11, (java.lang.Object) component49);
        java.awt.event.ComponentListener[] componentListenerArray51 = component49.getComponentListeners();
        component49.setFocusable(true);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.5f + "'", float48 == 0.5f);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(componentListenerArray51);
        org.junit.Assert.assertArrayEquals(componentListenerArray51, new java.awt.event.ComponentListener[] {});
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.awt.Point point6 = managementDashboard1.getPopupLocation(mouseEvent5);
        boolean boolean7 = managementDashboard1.isPreferredSizeSet();
        java.awt.image.VolatileImage volatileImage10 = managementDashboard1.createVolatileImage((int) '#', (int) (short) 100);
        boolean boolean13 = managementDashboard1.inside((-1), 52);
        managementDashboard1.setAutoscrolls(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(volatileImage10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        java.awt.event.ComponentListener[] componentListenerArray9 = managementDashboard1.getComponentListeners();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        managementDashboard11.addPropertyChangeListener(propertyChangeListener12);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = managementDashboard11.createImage(imageProducer14);
        java.awt.im.InputContext inputContext16 = managementDashboard11.getInputContext();
        boolean boolean17 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(componentListenerArray9);
        org.junit.Assert.assertArrayEquals(componentListenerArray9, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(inputContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isMinimumSizeSet();
        java.awt.Graphics graphics11 = null;
        managementDashboard1.print(graphics11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        boolean boolean18 = managementDashboard17.isVisible();
        java.awt.Image image21 = managementDashboard17.createImage(13, (-1));
        managementDashboard17.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        managementDashboard25.addPropertyChangeListener(propertyChangeListener26);
        java.awt.event.FocusEvent.Cause cause28 = null;
        managementDashboard25.requestFocus(cause28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener30);
        java.awt.Point point32 = managementDashboard25.location();
        java.awt.Component component33 = managementDashboard17.findComponentAt(point32);
        java.awt.Component component34 = managementDashboard14.getComponentAt(point32);
        managementDashboard14.grabFocus();
        java.awt.Rectangle rectangle36 = managementDashboard14.bounds();
        managementDashboard1.paintImmediately(rectangle36);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        int int58 = managementDashboard57.countComponents();
        managementDashboard57.resetKeyboardActions();
        managementDashboard57.layout();
        java.awt.event.MouseEvent mouseEvent61 = null;
        java.awt.Point point62 = managementDashboard57.getPopupLocation(mouseEvent61);
        boolean boolean63 = managementDashboard39.isAncestorOf((java.awt.Component) managementDashboard57);
        java.awt.dnd.DropTarget dropTarget64 = managementDashboard39.getDropTarget();
        int int65 = managementDashboard39.getY();
        java.awt.Point point66 = managementDashboard39.location();
        boolean boolean67 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard39);
        java.awt.Insets insets68 = managementDashboard39.getInsets();
        managementDashboard39.setBounds(9, (int) (short) -1, 52, (int) (byte) -1);
        java.awt.Component[] componentArray74 = managementDashboard39.getComponents();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(point32);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNull(component34);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNull(point62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(dropTarget64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(point66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(insets68);
        org.junit.Assert.assertNotNull(componentArray74);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard1.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Point point31 = managementDashboard1.getLocation(point30);
        managementDashboard1.enable();
        int int33 = managementDashboard1.getComponentCount();
        boolean boolean34 = managementDashboard1.isDoubleBuffered();
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener35);
        java.io.PrintStream printStream37 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printStream37, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        java.awt.event.ActionListener actionListener14 = null;
        javax.swing.KeyStroke keyStroke16 = null;
        managementDashboard1.registerKeyboardAction(actionListener14, "data/parkingSpaceData.csv", keyStroke16, 1);
        managementDashboard1.transferFocus();
        java.awt.Event event20 = null;
        boolean boolean23 = managementDashboard1.mouseDown(event20, (int) (byte) 0, 64);
        managementDashboard1.requestFocus();
        java.awt.event.FocusListener focusListener25 = null;
        managementDashboard1.removeFocusListener(focusListener25);
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        managementDashboard28.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        boolean boolean33 = managementDashboard32.isVisible();
        java.awt.Image image36 = managementDashboard32.createImage(13, (-1));
        managementDashboard32.remove((int) (short) 1);
        java.awt.Insets insets39 = managementDashboard32.getInsets();
        java.util.Locale locale40 = managementDashboard32.getLocale();
        java.awt.Graphics graphics41 = null;
        managementDashboard32.printAll(graphics41);
        java.lang.String str43 = managementDashboard32.toString();
        managementDashboard28.setNextFocusableComponent((java.awt.Component) managementDashboard32);
        java.awt.Dimension dimension45 = managementDashboard28.getSize();
        managementDashboard1.setSize(dimension45);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(image36);
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str43, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(dimension45);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        java.awt.Component component12 = managementDashboard1.locate((-1), (int) (byte) 0);
        boolean boolean13 = managementDashboard1.getInheritsPopupMenu();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printWriter14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(component12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        javax.swing.JToolTip jToolTip20 = managementDashboard1.createToolTip();
        java.awt.event.MouseEvent mouseEvent21 = null;
        java.awt.Point point22 = jToolTip20.getPopupLocation(mouseEvent21);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(jToolTip20);
        org.junit.Assert.assertNull(point22);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.Container container47 = managementDashboard32.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        boolean boolean53 = managementDashboard52.isVisible();
        java.awt.Image image56 = managementDashboard52.createImage(13, (-1));
        managementDashboard52.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Point point67 = managementDashboard60.location();
        java.awt.Component component68 = managementDashboard52.findComponentAt(point67);
        java.awt.Component component69 = managementDashboard49.getComponentAt(point67);
        java.awt.Point point70 = managementDashboard32.getLocation(point67);
        boolean boolean71 = managementDashboard32.isFocusCycleRoot();
        int int72 = managementDashboard32.getX();
        managementDashboard32.invalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(image56);
        org.junit.Assert.assertNotNull(point67);
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNull(component69);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener8);
        managementDashboard1.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray13 = managementDashboard1.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.awt.event.ActionListener actionListener16 = null;
        javax.swing.KeyStroke keyStroke18 = null;
        managementDashboard15.registerKeyboardAction(actionListener16, "hi!", keyStroke18, (int) (short) 0);
        java.awt.Font font21 = managementDashboard15.getFont();
        managementDashboard1.setFont(font21);
        java.awt.Point point23 = managementDashboard1.getLocation();
        java.awt.Event event24 = null;
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.util.Locale locale29 = managementDashboard26.getLocale();
        float float30 = managementDashboard26.getAlignmentY();
        java.awt.image.VolatileImage volatileImage33 = managementDashboard26.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj34 = managementDashboard26.getTreeLock();
        managementDashboard26.setFocusTraversalKeysEnabled(false);
        managementDashboard26.doLayout();
        java.awt.Graphics graphics38 = null;
        managementDashboard26.printAll(graphics38);
        boolean boolean40 = managementDashboard1.gotFocus(event24, (java.lang.Object) graphics38);
        java.awt.Dimension dimension41 = managementDashboard1.getPreferredSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = managementDashboard1.areFocusTraversalKeysSet((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(componentArray13);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNull(volatileImage33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dimension41);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Dimension dimension10 = managementDashboard8.getMinimumSize();
        java.awt.image.ColorModel colorModel11 = managementDashboard8.getColorModel();
        java.awt.ComponentOrientation componentOrientation12 = managementDashboard8.getComponentOrientation();
        managementDashboard1.setComponentOrientation(componentOrientation12);
        boolean boolean14 = managementDashboard1.isFocusTraversalPolicySet();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNotNull(colorModel11);
        org.junit.Assert.assertNotNull(componentOrientation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.revalidate();
        boolean boolean50 = managementDashboard32.isFocusTraversalPolicySet();
        boolean boolean51 = managementDashboard32.isPaintingTile();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.awt.Image image6 = managementDashboard1.createImage((int) (byte) 1, (int) (short) -1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        managementDashboard1.show(true);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        boolean boolean6 = managementDashboard1.contains(6, 3);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        ManagementDashboard managementDashboard4 = new ManagementDashboard(strConsumer3);
        boolean boolean5 = managementDashboard4.isVisible();
        java.awt.Image image8 = managementDashboard4.createImage(13, (-1));
        managementDashboard4.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        java.awt.event.FocusEvent.Cause cause15 = null;
        managementDashboard12.requestFocus(cause15);
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        managementDashboard12.addInputMethodListener(inputMethodListener17);
        java.awt.Point point19 = managementDashboard12.location();
        java.awt.Component component20 = managementDashboard4.findComponentAt(point19);
        java.awt.Component component21 = managementDashboard1.getComponentAt(point19);
        managementDashboard1.grabFocus();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener23);
        managementDashboard1.enable(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNull(component21);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        managementDashboard14.addPropertyChangeListener(propertyChangeListener15);
        java.awt.event.FocusEvent.Cause cause17 = null;
        managementDashboard14.requestFocus(cause17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        managementDashboard14.addInputMethodListener(inputMethodListener19);
        managementDashboard14.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        boolean boolean26 = managementDashboard14.isValid();
        managementDashboard14.reshape(8, (int) ' ', (int) (short) 10, 1);
        java.awt.Font font32 = managementDashboard14.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard1.getFontMetrics(font32);
        java.awt.Graphics graphics34 = null;
        managementDashboard1.update(graphics34);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard32.removePropertyChangeListener("123456789", propertyChangeListener48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        managementDashboard72.setAlignmentX((float) 6);
        java.awt.Rectangle rectangle93 = managementDashboard72.getBounds();
        java.awt.ImageCapabilities imageCapabilities96 = null;
        java.awt.image.VolatileImage volatileImage97 = managementDashboard72.createVolatileImage(64, (int) '4', imageCapabilities96);
        boolean boolean98 = managementDashboard72.isValid();
        int int99 = managementDashboard72.getY();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(rectangle93);
        org.junit.Assert.assertNull(volatileImage97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.Color color6 = managementDashboard1.getBackground();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        boolean boolean8 = managementDashboard1.getIgnoreRepaint();
        java.awt.Dimension dimension9 = managementDashboard1.preferredSize();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        managementDashboard23.show();
        managementDashboard23.setToolTipText("data/lotData.csv");
        java.awt.Component component36 = managementDashboard23.findComponentAt(2, 0);
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        managementDashboard38.addPropertyChangeListener(propertyChangeListener39);
        java.awt.event.FocusEvent.Cause cause41 = null;
        managementDashboard38.requestFocus(cause41);
        java.awt.event.InputMethodListener inputMethodListener43 = null;
        managementDashboard38.addInputMethodListener(inputMethodListener43);
        managementDashboard38.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float50 = managementDashboard38.getAlignmentY();
        boolean boolean51 = managementDashboard38.isOptimizedDrawingEnabled();
        float float52 = managementDashboard38.getAlignmentX();
        java.util.function.Consumer<java.lang.String> strConsumer53 = null;
        ManagementDashboard managementDashboard54 = new ManagementDashboard(strConsumer53);
        java.awt.image.ImageProducer imageProducer55 = null;
        java.awt.Image image56 = managementDashboard54.createImage(imageProducer55);
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        managementDashboard58.addPropertyChangeListener(propertyChangeListener59);
        java.awt.event.FocusEvent.Cause cause61 = null;
        managementDashboard58.requestFocus(cause61);
        java.awt.event.InputMethodListener inputMethodListener63 = null;
        managementDashboard58.addInputMethodListener(inputMethodListener63);
        java.awt.Point point65 = managementDashboard58.location();
        java.awt.Component component66 = managementDashboard54.add((java.awt.Component) managementDashboard58);
        component66.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer72 = null;
        ManagementDashboard managementDashboard73 = new ManagementDashboard(strConsumer72);
        boolean boolean74 = managementDashboard73.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer75 = null;
        ManagementDashboard managementDashboard76 = new ManagementDashboard(strConsumer75);
        boolean boolean77 = managementDashboard76.isVisible();
        java.awt.Image image80 = managementDashboard76.createImage(13, (-1));
        managementDashboard76.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer83 = null;
        ManagementDashboard managementDashboard84 = new ManagementDashboard(strConsumer83);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        managementDashboard84.addPropertyChangeListener(propertyChangeListener85);
        java.awt.event.FocusEvent.Cause cause87 = null;
        managementDashboard84.requestFocus(cause87);
        java.awt.event.InputMethodListener inputMethodListener89 = null;
        managementDashboard84.addInputMethodListener(inputMethodListener89);
        java.awt.Point point91 = managementDashboard84.location();
        java.awt.Component component92 = managementDashboard76.findComponentAt(point91);
        java.awt.Component component93 = managementDashboard73.getComponentAt(point91);
        managementDashboard73.grabFocus();
        java.awt.Rectangle rectangle95 = managementDashboard73.bounds();
        java.awt.Rectangle rectangle96 = managementDashboard73.bounds();
        java.awt.Rectangle rectangle97 = component66.getBounds(rectangle96);
        managementDashboard38.scrollRectToVisible(rectangle96);
        managementDashboard23.scrollRectToVisible(rectangle96);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(component36);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.5f + "'", float50 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.5f + "'", float52 == 0.5f);
        org.junit.Assert.assertNotNull(image56);
        org.junit.Assert.assertNotNull(point65);
        org.junit.Assert.assertNotNull(component66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(image80);
        org.junit.Assert.assertNotNull(point91);
        org.junit.Assert.assertNull(component92);
        org.junit.Assert.assertNull(component93);
        org.junit.Assert.assertNotNull(rectangle95);
        org.junit.Assert.assertNotNull(rectangle96);
        org.junit.Assert.assertNotNull(rectangle97);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        javax.accessibility.AccessibleContext accessibleContext19 = managementDashboard1.getAccessibleContext();
        int int20 = managementDashboard1.getComponentCount();
        java.awt.event.FocusListener[] focusListenerArray21 = managementDashboard1.getFocusListeners();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(accessibleContext19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(focusListenerArray21);
        org.junit.Assert.assertArrayEquals(focusListenerArray21, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        java.awt.event.ActionListener actionListener14 = null;
        javax.swing.KeyStroke keyStroke16 = null;
        managementDashboard1.registerKeyboardAction(actionListener14, "data/parkingSpaceData.csv", keyStroke16, 1);
        managementDashboard1.transferFocus();
        java.awt.Event event20 = null;
        boolean boolean23 = managementDashboard1.mouseDown(event20, (int) (byte) 0, 64);
        managementDashboard1.requestFocus();
        java.awt.event.FocusListener focusListener25 = null;
        managementDashboard1.removeFocusListener(focusListener25);
        java.awt.event.KeyListener[] keyListenerArray27 = managementDashboard1.getKeyListeners();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertArrayEquals(keyListenerArray27, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isFocusable();
        java.awt.event.ComponentListener componentListener11 = null;
        managementDashboard1.addComponentListener(componentListener11);
        managementDashboard1.repaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.Container container47 = managementDashboard32.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        boolean boolean53 = managementDashboard52.isVisible();
        java.awt.Image image56 = managementDashboard52.createImage(13, (-1));
        managementDashboard52.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Point point67 = managementDashboard60.location();
        java.awt.Component component68 = managementDashboard52.findComponentAt(point67);
        java.awt.Component component69 = managementDashboard49.getComponentAt(point67);
        java.awt.Point point70 = managementDashboard32.getLocation(point67);
        boolean boolean71 = managementDashboard32.isFocusCycleRoot();
        managementDashboard32.setAlignmentX((float) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(image56);
        org.junit.Assert.assertNotNull(point67);
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNull(component69);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        ParkingLot parkingLot1 = new ParkingLot("data/lotData.csv");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "data/lotData.csv" + "'", str2, "data/lotData.csv");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener6);
        managementDashboard1.setInheritsPopupMenu(false);
        boolean boolean10 = managementDashboard1.getFocusTraversalKeysEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        managementDashboard12.enableInputMethods(true);
        java.awt.Dimension dimension17 = managementDashboard12.getMinimumSize();
        float float18 = managementDashboard12.getAlignmentX();
        managementDashboard12.addNotify();
        boolean boolean20 = managementDashboard12.isDoubleBuffered();
        java.awt.Rectangle rectangle21 = managementDashboard12.getBounds();
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isFocusable();
        java.awt.event.ComponentListener componentListener11 = null;
        managementDashboard1.addComponentListener(componentListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        java.awt.Component component30 = managementDashboard14.findComponentAt(point29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.image.ImageProducer imageProducer33 = null;
        java.awt.Image image34 = managementDashboard32.createImage(imageProducer33);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        int int43 = managementDashboard14.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isVisible();
        java.awt.Image image49 = managementDashboard45.createImage(13, (-1));
        managementDashboard45.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener52 = null;
        managementDashboard45.removeMouseMotionListener(mouseMotionListener52);
        managementDashboard45.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray57 = managementDashboard45.getComponents();
        java.awt.Point point58 = managementDashboard45.location();
        managementDashboard45.setFocusTraversalPolicyProvider(false);
        int int61 = managementDashboard1.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard45);
        boolean boolean62 = managementDashboard45.isFocusOwner();
        boolean boolean63 = managementDashboard45.isFocusCycleRoot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertNotNull(image34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(componentArray57);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        javax.swing.InputVerifier inputVerifier11 = managementDashboard1.getInputVerifier();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard13.findComponentAt(point28);
        boolean boolean30 = managementDashboard13.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard13.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard35.addPropertyChangeListener(propertyChangeListener36);
        java.awt.event.FocusEvent.Cause cause38 = null;
        managementDashboard35.requestFocus(cause38);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener40);
        java.awt.Point point42 = managementDashboard35.location();
        java.awt.Point point43 = managementDashboard13.getLocation(point42);
        boolean boolean44 = managementDashboard1.contains(point43);
        java.awt.Graphics graphics45 = null;
        managementDashboard1.printAll(graphics45);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNull(inputVerifier11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(point42);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard1.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Point point31 = managementDashboard1.getLocation(point30);
        managementDashboard1.enable();
        int int33 = managementDashboard1.getComponentCount();
        java.awt.Insets insets34 = managementDashboard1.getInsets();
        javax.swing.event.AncestorListener[] ancestorListenerArray35 = managementDashboard1.getAncestorListeners();
        managementDashboard1.show();
        int int37 = managementDashboard1.getX();
        int int38 = managementDashboard1.getY();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertNotNull(ancestorListenerArray35);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray35, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.awt.ImageCapabilities imageCapabilities6 = null;
        java.awt.image.VolatileImage volatileImage7 = managementDashboard1.createVolatileImage((int) (byte) 100, 11, imageCapabilities6);
        boolean boolean8 = managementDashboard1.isDisplayable();
        org.junit.Assert.assertNull(volatileImage7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.Dimension dimension26 = managementDashboard1.minimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isVisible();
        java.awt.Image image32 = managementDashboard28.createImage(13, (-1));
        managementDashboard28.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        java.awt.Point point43 = managementDashboard36.location();
        java.awt.Component component44 = managementDashboard28.findComponentAt(point43);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.awt.image.ImageProducer imageProducer47 = null;
        java.awt.Image image48 = managementDashboard46.createImage(imageProducer47);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        managementDashboard50.addPropertyChangeListener(propertyChangeListener51);
        java.awt.event.FocusEvent.Cause cause53 = null;
        managementDashboard50.requestFocus(cause53);
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        managementDashboard50.addInputMethodListener(inputMethodListener55);
        int int57 = managementDashboard28.checkImage(image48, (java.awt.image.ImageObserver) managementDashboard50);
        java.awt.Container container58 = managementDashboard28.getParent();
        java.lang.Object obj59 = managementDashboard1.getClientProperty((java.lang.Object) container58);
        managementDashboard1.doLayout();
        managementDashboard1.firePropertyChange("123456789", '4', '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertNull(component44);
        org.junit.Assert.assertNotNull(image48);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(container58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.show(true);
        java.awt.Dimension dimension15 = managementDashboard8.size();
        managementDashboard1.setSize(dimension15);
        int int19 = managementDashboard1.getBaseline((int) (byte) 1, 12);
        managementDashboard1.hide();
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = managementDashboard22.createImage(imageProducer23);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.awt.event.FocusEvent.Cause cause29 = null;
        managementDashboard26.requestFocus(cause29);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener31);
        java.awt.Point point33 = managementDashboard26.location();
        java.awt.Component component34 = managementDashboard22.add((java.awt.Component) managementDashboard26);
        java.awt.event.ActionListener actionListener35 = null;
        javax.swing.KeyStroke keyStroke37 = null;
        managementDashboard22.registerKeyboardAction(actionListener35, "data/parkingSpaceData.csv", keyStroke37, 1);
        managementDashboard22.transferFocus();
        java.awt.Event event41 = null;
        boolean boolean44 = managementDashboard22.mouseDown(event41, (int) (byte) 0, 64);
        managementDashboard22.requestFocus();
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.awt.image.ImageProducer imageProducer48 = null;
        java.awt.Image image49 = managementDashboard47.createImage(imageProducer48);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        managementDashboard51.addPropertyChangeListener(propertyChangeListener52);
        java.awt.event.FocusEvent.Cause cause54 = null;
        managementDashboard51.requestFocus(cause54);
        java.awt.event.InputMethodListener inputMethodListener56 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener56);
        java.awt.Point point58 = managementDashboard51.location();
        java.awt.Component component59 = managementDashboard47.add((java.awt.Component) managementDashboard51);
        component59.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        boolean boolean67 = managementDashboard66.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer68 = null;
        ManagementDashboard managementDashboard69 = new ManagementDashboard(strConsumer68);
        boolean boolean70 = managementDashboard69.isVisible();
        java.awt.Image image73 = managementDashboard69.createImage(13, (-1));
        managementDashboard69.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer76 = null;
        ManagementDashboard managementDashboard77 = new ManagementDashboard(strConsumer76);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        managementDashboard77.addPropertyChangeListener(propertyChangeListener78);
        java.awt.event.FocusEvent.Cause cause80 = null;
        managementDashboard77.requestFocus(cause80);
        java.awt.event.InputMethodListener inputMethodListener82 = null;
        managementDashboard77.addInputMethodListener(inputMethodListener82);
        java.awt.Point point84 = managementDashboard77.location();
        java.awt.Component component85 = managementDashboard69.findComponentAt(point84);
        java.awt.Component component86 = managementDashboard66.getComponentAt(point84);
        managementDashboard66.grabFocus();
        java.awt.Rectangle rectangle88 = managementDashboard66.bounds();
        java.awt.Rectangle rectangle89 = managementDashboard66.bounds();
        java.awt.Rectangle rectangle90 = component59.getBounds(rectangle89);
        managementDashboard22.repaint(rectangle89);
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle89);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(component34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(image49);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertNotNull(component59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(image73);
        org.junit.Assert.assertNotNull(point84);
        org.junit.Assert.assertNull(component85);
        org.junit.Assert.assertNull(component86);
        org.junit.Assert.assertNotNull(rectangle88);
        org.junit.Assert.assertNotNull(rectangle89);
        org.junit.Assert.assertNotNull(rectangle90);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        int int7 = managementDashboard1.getBaseline((int) '#', (int) (byte) 100);
        int int10 = managementDashboard1.getBaseline(0, (int) (short) 0);
        javax.swing.JPopupMenu jPopupMenu11 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu11);
        managementDashboard1.repaint((long) '4', (int) (byte) 1, (int) (byte) 1, 4, 11);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        managementDashboard20.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        boolean boolean25 = managementDashboard24.isVisible();
        java.awt.Image image28 = managementDashboard24.createImage(13, (-1));
        managementDashboard24.remove((int) (short) 1);
        java.awt.Insets insets31 = managementDashboard24.getInsets();
        java.util.Locale locale32 = managementDashboard24.getLocale();
        java.awt.Graphics graphics33 = null;
        managementDashboard24.printAll(graphics33);
        java.lang.String str35 = managementDashboard24.toString();
        managementDashboard20.setNextFocusableComponent((java.awt.Component) managementDashboard24);
        java.awt.event.MouseListener mouseListener37 = null;
        managementDashboard20.addMouseListener(mouseListener37);
        java.awt.Insets insets39 = managementDashboard20.insets();
        java.awt.Dimension dimension40 = managementDashboard20.getPreferredSize();
        managementDashboard1.setMaximumSize(dimension40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(insets31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str35, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertNotNull(dimension40);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        managementAccountsView1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = managementAccountsView1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests5 = managementAccountsView1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        managementDashboard7.addPropertyChangeListener(propertyChangeListener8);
        java.awt.event.FocusEvent.Cause cause10 = null;
        managementDashboard7.requestFocus(cause10);
        java.awt.Color color12 = managementDashboard7.getBackground();
        managementDashboard7.repaint();
        boolean boolean14 = managementDashboard7.isOpaque();
        managementDashboard7.firePropertyChange("hi!", 10, 10);
        javax.swing.plaf.PanelUI panelUI19 = managementDashboard7.getUI();
        managementAccountsView1.setUI(panelUI19);
        java.awt.Event event21 = null;
        boolean boolean24 = managementAccountsView1.mouseDown(event21, 2, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(inputMethodRequests5);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        java.awt.Point point16 = managementDashboard1.getMousePosition(true);
        java.awt.Component component17 = managementDashboard1.getNextFocusableComponent();
        javax.swing.JPopupMenu jPopupMenu18 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.nextFocus();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNull(jPopupMenu18);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard16.addPropertyChangeListener(propertyChangeListener17);
        java.awt.event.FocusEvent.Cause cause19 = null;
        managementDashboard16.requestFocus(cause19);
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener21);
        java.awt.Point point23 = managementDashboard16.location();
        java.awt.Component component24 = managementDashboard8.findComponentAt(point23);
        java.awt.Component component25 = managementDashboard5.getComponentAt(point23);
        managementDashboard5.grabFocus();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isVisible();
        java.awt.Image image32 = managementDashboard28.createImage(13, (-1));
        managementDashboard28.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        java.awt.Point point43 = managementDashboard36.location();
        java.awt.Component component44 = managementDashboard28.findComponentAt(point43);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.awt.image.ImageProducer imageProducer47 = null;
        java.awt.Image image48 = managementDashboard46.createImage(imageProducer47);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        managementDashboard50.addPropertyChangeListener(propertyChangeListener51);
        java.awt.event.FocusEvent.Cause cause53 = null;
        managementDashboard50.requestFocus(cause53);
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        managementDashboard50.addInputMethodListener(inputMethodListener55);
        int int57 = managementDashboard28.checkImage(image48, (java.awt.image.ImageObserver) managementDashboard50);
        java.util.function.Consumer<java.lang.String> strConsumer58 = null;
        ManagementDashboard managementDashboard59 = new ManagementDashboard(strConsumer58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        managementDashboard59.addPropertyChangeListener(propertyChangeListener60);
        java.util.Locale locale62 = managementDashboard59.getLocale();
        float float63 = managementDashboard59.getAlignmentY();
        java.awt.Component component64 = managementDashboard50.add((java.awt.Component) managementDashboard59);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        managementDashboard66.addPropertyChangeListener(propertyChangeListener67);
        java.util.Locale locale69 = managementDashboard66.getLocale();
        managementDashboard59.setLocale(locale69);
        managementDashboard59.addNotify();
        java.awt.Dimension dimension72 = managementDashboard59.getMaximumSize();
        managementDashboard5.setMaximumSize(dimension72);
        managementDashboard1.setSize(dimension72);
        boolean boolean75 = managementDashboard1.getVerifyInputWhenFocusTarget();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(point23);
        org.junit.Assert.assertNull(component24);
        org.junit.Assert.assertNull(component25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertNull(component44);
        org.junit.Assert.assertNotNull(image48);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.5f + "'", float63 == 0.5f);
        org.junit.Assert.assertNotNull(component64);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        java.util.Locale locale18 = managementDashboard1.getLocale();
        managementDashboard1.repaint((int) (short) 10, (int) ' ', (int) (short) 10, 6);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        java.awt.im.InputContext inputContext13 = managementDashboard1.getInputContext();
        int int16 = managementDashboard1.getBaseline((int) (byte) 100, (int) (byte) 10);
        java.awt.Point point17 = managementDashboard1.getLocation();
        boolean boolean18 = managementDashboard1.isFontSet();
        java.awt.Event event19 = null;
        boolean boolean22 = managementDashboard1.mouseMove(event19, (int) (short) 100, (int) '#');
        java.awt.Component[] componentArray23 = managementDashboard1.getComponents();
        managementDashboard1.removeAll();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(inputContext13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(point17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(componentArray23);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.transferFocusBackward();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = managementDashboard13.createImage(imageProducer14);
        managementDashboard13.resize(2, 100);
        java.beans.VetoableChangeListener vetoableChangeListener19 = null;
        managementDashboard13.removeVetoableChangeListener(vetoableChangeListener19);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isVisible();
        java.awt.Image image26 = managementDashboard22.createImage(13, (-1));
        managementDashboard22.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        managementDashboard30.addPropertyChangeListener(propertyChangeListener31);
        java.awt.event.FocusEvent.Cause cause33 = null;
        managementDashboard30.requestFocus(cause33);
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener35);
        java.awt.Point point37 = managementDashboard30.location();
        java.awt.Component component38 = managementDashboard22.findComponentAt(point37);
        java.util.function.Consumer<java.lang.String> strConsumer39 = null;
        ManagementDashboard managementDashboard40 = new ManagementDashboard(strConsumer39);
        java.awt.image.ImageProducer imageProducer41 = null;
        java.awt.Image image42 = managementDashboard40.createImage(imageProducer41);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        managementDashboard44.addPropertyChangeListener(propertyChangeListener45);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard44.requestFocus(cause47);
        java.awt.event.InputMethodListener inputMethodListener49 = null;
        managementDashboard44.addInputMethodListener(inputMethodListener49);
        int int51 = managementDashboard22.checkImage(image42, (java.awt.image.ImageObserver) managementDashboard44);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        managementDashboard53.addPropertyChangeListener(propertyChangeListener54);
        java.util.Locale locale56 = managementDashboard53.getLocale();
        float float57 = managementDashboard53.getAlignmentY();
        java.awt.Component component58 = managementDashboard44.add((java.awt.Component) managementDashboard53);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.util.Locale locale63 = managementDashboard60.getLocale();
        managementDashboard53.setLocale(locale63);
        managementDashboard13.setLocale(locale63);
        managementDashboard1.setLocale(locale63);
        javax.swing.JComponent.setDefaultLocale(locale63);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNotNull(point37);
        org.junit.Assert.assertNull(component38);
        org.junit.Assert.assertNotNull(image42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.5f + "'", float57 == 0.5f);
        org.junit.Assert.assertNotNull(component58);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        managementDashboard1.firePropertyChange("", (byte) 0, (byte) -1);
        managementDashboard1.list();
        java.awt.Component component24 = managementDashboard1.getNextFocusableComponent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(component24);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.Insets insets4 = null;
        java.awt.Insets insets5 = managementDashboard1.getInsets(insets4);
        boolean boolean8 = managementDashboard1.contains(9, 11);
        org.junit.Assert.assertNotNull(insets5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        managementDashboard1.grabFocus();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        managementDashboard11.addPropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = managementDashboard11.getName();
        java.awt.event.ComponentListener componentListener15 = null;
        managementDashboard11.removeComponentListener(componentListener15);
        managementDashboard11.move((int) (short) 100, 9);
        int int20 = managementDashboard11.getDebugGraphicsOptions();
        java.awt.Component component23 = managementDashboard11.locate(32, 16);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        managementDashboard25.addPropertyChangeListener(propertyChangeListener26);
        java.awt.event.FocusEvent.Cause cause28 = null;
        managementDashboard25.requestFocus(cause28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener30);
        java.awt.Color color32 = managementDashboard25.getBackground();
        managementDashboard25.setRequestFocusEnabled(true);
        java.awt.event.MouseListener mouseListener35 = null;
        managementDashboard25.addMouseListener(mouseListener35);
        boolean boolean37 = managementDashboard25.isPaintingTile();
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.awt.Point point39 = managementDashboard25.getPopupLocation(mouseEvent38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setEnabled(true);
        java.awt.Point point44 = managementDashboard41.location();
        java.awt.Component component45 = managementDashboard25.findComponentAt(point44);
        java.awt.Point point46 = managementDashboard11.getLocation(point44);
        java.awt.Component component47 = managementDashboard1.findComponentAt(point44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(component23);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(point39);
        org.junit.Assert.assertNotNull(point44);
        org.junit.Assert.assertNull(component45);
        org.junit.Assert.assertNotNull(point46);
        org.junit.Assert.assertNull(component47);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.Insets insets3 = managementDashboard1.getInsets();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.image.ColorModel colorModel8 = managementDashboard5.getColorModel();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard5.getUI();
        managementDashboard1.setUI(panelUI9);
        boolean boolean12 = managementDashboard1.requestFocus(true);
        java.awt.MenuComponent menuComponent13 = null;
        managementDashboard1.remove(menuComponent13);
        java.awt.dnd.DropTarget dropTarget15 = managementDashboard1.getDropTarget();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(insets3);
        org.junit.Assert.assertNotNull(colorModel8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dropTarget15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        java.awt.Point point16 = managementDashboard1.getMousePosition(true);
        java.awt.Component component17 = managementDashboard1.getNextFocusableComponent();
        // The following exception was thrown during execution in test generation
        try {
            component17.transferFocusUpCycle();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNull(component17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        component13.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = component13.getHierarchyBoundsListeners();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray19, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Container container31 = managementDashboard1.getParent();
        java.awt.Event event32 = null;
        boolean boolean35 = managementDashboard1.mouseDrag(event32, (int) (short) 0, 10);
        java.awt.event.KeyListener keyListener36 = null;
        managementDashboard1.removeKeyListener(keyListener36);
        javax.swing.event.AncestorListener ancestorListener38 = null;
        managementDashboard1.addAncestorListener(ancestorListener38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        managementDashboard41.addPropertyChangeListener(propertyChangeListener42);
        java.awt.event.FocusEvent.Cause cause44 = null;
        managementDashboard41.requestFocus(cause44);
        java.awt.event.InputMethodListener inputMethodListener46 = null;
        managementDashboard41.addInputMethodListener(inputMethodListener46);
        java.awt.Point point48 = managementDashboard41.location();
        javax.swing.plaf.PanelUI panelUI49 = managementDashboard41.getUI();
        javax.swing.InputVerifier inputVerifier50 = managementDashboard41.getInputVerifier();
        managementDashboard41.validate();
        java.awt.Color color52 = managementDashboard41.getBackground();
        managementDashboard1.setForeground(color52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(container31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(point48);
        org.junit.Assert.assertNotNull(panelUI49);
        org.junit.Assert.assertNull(inputVerifier50);
        org.junit.Assert.assertNotNull(color52);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        managementDashboard23.show();
        managementDashboard23.setToolTipText("data/lotData.csv");
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener34 = null;
        managementDashboard23.removeHierarchyBoundsListener(hierarchyBoundsListener34);
        java.lang.Object obj36 = managementDashboard23.getTreeLock();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = managementDashboard23.areFocusTraversalKeysSet(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.awt.Graphics graphics18 = null;
        managementDashboard1.update(graphics18);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        boolean boolean22 = managementDashboard21.isVisible();
        java.awt.LayoutManager layoutManager23 = managementDashboard21.getLayout();
        managementDashboard1.setLayout(layoutManager23);
        java.awt.LayoutManager layoutManager25 = managementDashboard1.getLayout();
        managementDashboard1.firePropertyChange("ToolTipText", (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNotNull(layoutManager25);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotAvailability();
        java.lang.String str3 = parkingLot1.getLotAvailability();
        ParkingSpace[] parkingSpaceArray4 = parkingLot1.getSpaces();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parkingSpaceArray4);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Dimension dimension8 = managementDashboard1.minimumSize();
        managementDashboard1.setVisible(true);
        boolean boolean11 = managementDashboard1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        managementDashboard72.setAlignmentX((float) 6);
        javax.swing.InputVerifier inputVerifier93 = managementDashboard72.getInputVerifier();
        javax.swing.border.Border border94 = managementDashboard72.getBorder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(inputVerifier93);
        org.junit.Assert.assertNull(border94);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.validate();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (short) 100, (short) (byte) 0);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = managementDashboard17.createImage(imageProducer18);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard17.add((java.awt.Component) managementDashboard21);
        component29.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = component29.createImage(imageProducer35);
        boolean boolean42 = managementDashboard1.imageUpdate(image36, 7, (int) (byte) 0, (-1), 8, 4);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        boolean boolean6 = managementDashboard1.contains((int) (byte) -1, (int) '#');
        javax.swing.border.Border border7 = null;
        managementDashboard1.setBorder(border7);
        java.awt.Graphics graphics9 = null;
        managementDashboard1.print(graphics9);
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.Dimension dimension26 = managementDashboard1.minimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isVisible();
        java.awt.Image image32 = managementDashboard28.createImage(13, (-1));
        managementDashboard28.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        java.awt.Point point43 = managementDashboard36.location();
        java.awt.Component component44 = managementDashboard28.findComponentAt(point43);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.awt.image.ImageProducer imageProducer47 = null;
        java.awt.Image image48 = managementDashboard46.createImage(imageProducer47);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        managementDashboard50.addPropertyChangeListener(propertyChangeListener51);
        java.awt.event.FocusEvent.Cause cause53 = null;
        managementDashboard50.requestFocus(cause53);
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        managementDashboard50.addInputMethodListener(inputMethodListener55);
        int int57 = managementDashboard28.checkImage(image48, (java.awt.image.ImageObserver) managementDashboard50);
        java.awt.Container container58 = managementDashboard28.getParent();
        java.lang.Object obj59 = managementDashboard1.getClientProperty((java.lang.Object) container58);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray60 = managementDashboard1.getMouseWheelListeners();
        java.awt.image.ImageProducer imageProducer61 = null;
        java.awt.Image image62 = managementDashboard1.createImage(imageProducer61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(image32);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertNull(component44);
        org.junit.Assert.assertNotNull(image48);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(container58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray60);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray60, new java.awt.event.MouseWheelListener[] {});
        org.junit.Assert.assertNotNull(image62);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        ParkingSpace parkingSpace4 = new ParkingSpace(3, "ManagementDashboard[,100,9,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "ToolTipText", "ManagementDashboard[,100,9,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        int int5 = parkingSpace4.getIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        managementDashboard1.show(true);
        boolean boolean20 = managementDashboard1.isFocusOwner();
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap22 = managementDashboard1.getInputMap(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        boolean boolean9 = managementDashboard1.isVisible();
        boolean boolean10 = managementDashboard1.isFocusable();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        managementDashboard1.enable();
        managementDashboard1.validate();
        java.awt.Component component8 = managementDashboard1.locate((int) (byte) 0, 1);
        managementDashboard1.setFocusable(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener6);
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        int int10 = managementDashboard1.getY();
        java.awt.Dimension dimension11 = managementDashboard1.getMaximumSize();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isMinimumSizeSet();
        java.awt.Graphics graphics11 = null;
        managementDashboard1.print(graphics11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.LayoutManager layoutManager16 = managementDashboard14.getLayout();
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        managementDashboard18.addPropertyChangeListener(propertyChangeListener19);
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = managementDashboard18.createImage(imageProducer21);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        int int27 = managementDashboard26.countComponents();
        java.awt.Insets insets28 = managementDashboard26.getInsets();
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        managementDashboard30.addPropertyChangeListener(propertyChangeListener31);
        java.awt.image.ColorModel colorModel33 = managementDashboard30.getColorModel();
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard30.getUI();
        managementDashboard26.setUI(panelUI34);
        int int36 = managementDashboard14.checkImage(image22, 5, (int) '4', (java.awt.image.ImageObserver) managementDashboard26);
        java.awt.Component component37 = managementDashboard1.add((java.awt.Component) managementDashboard14);
        boolean boolean40 = managementDashboard1.contains(0, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(layoutManager16);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(insets28);
        org.junit.Assert.assertNotNull(colorModel33);
        org.junit.Assert.assertNotNull(panelUI34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        float float4 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusCycleRoot(true);
        managementDashboard1.setFocusable(true);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        java.awt.Component component22 = managementDashboard1.getNextFocusableComponent();
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener23);
        managementDashboard1.transferFocusBackward();
        java.awt.Dimension dimension26 = managementDashboard1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        java.awt.event.FocusEvent.Cause cause14 = null;
        boolean boolean15 = managementDashboard1.requestFocusInWindow(cause14);
        int int16 = managementDashboard1.getY();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        managementDashboard72.setAlignmentX((float) 6);
        javax.swing.InputVerifier inputVerifier93 = managementDashboard72.getInputVerifier();
        java.awt.event.InputMethodListener[] inputMethodListenerArray94 = managementDashboard72.getInputMethodListeners();
        boolean boolean95 = managementDashboard72.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(inputVerifier93);
        org.junit.Assert.assertNotNull(inputMethodListenerArray94);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray94, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        int int2 = managementAccountsView1.getHeight();
        javax.swing.JToolTip jToolTip3 = managementAccountsView1.createToolTip();
        jToolTip3.removeAll();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jToolTip3);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        boolean boolean7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        managementDashboard1.revalidate();
        java.awt.AWTEvent aWTEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.dispatchEvent(aWTEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        managementDashboard1.transferFocusDownCycle();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener8);
        java.awt.Container container10 = managementDashboard1.getParent();
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        managementDashboard1.removeHierarchyListener(hierarchyListener11);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNull(container10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        java.util.Locale locale18 = managementDashboard1.getLocale();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.event.ContainerListener containerListener10 = null;
        jToolTip9.removeContainerListener(containerListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.event.KeyListener keyListener4 = null;
        managementDashboard1.removeKeyListener(keyListener4);
        managementDashboard1.setFocusTraversalPolicyProvider(false);
        boolean boolean8 = managementDashboard1.isShowing();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.dnd.DropTarget dropTarget26 = managementDashboard1.getDropTarget();
        int int27 = managementDashboard1.getY();
        java.awt.Point point28 = managementDashboard1.location();
        int int29 = managementDashboard1.getHeight();
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.show(true);
        java.awt.Dimension dimension15 = managementDashboard8.size();
        managementDashboard1.setSize(dimension15);
        int int19 = managementDashboard1.getBaseline((int) (byte) 1, 12);
        managementDashboard1.hide();
        java.lang.String str21 = managementDashboard1.getName();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Image image10 = managementDashboard1.createImage((int) 'a', (int) (byte) 1);
        java.awt.event.MouseMotionListener mouseMotionListener11 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener11);
        managementDashboard1.setFocusTraversalPolicyProvider(true);
        managementDashboard1.repaint(10L);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard1.mouseExit(event17, 52, (int) 'a');
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        javax.swing.plaf.PanelUI panelUI30 = managementDashboard22.getUI();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard22.removePropertyChangeListener("ToolTipText", propertyChangeListener32);
        managementDashboard1.remove((java.awt.Component) managementDashboard22);
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet36 = managementDashboard1.getFocusTraversalKeys((int) (byte) 0);
        java.awt.event.ContainerListener containerListener37 = null;
        managementDashboard1.addContainerListener(containerListener37);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard1.removePropertyChangeListener("data/userData.csv", propertyChangeListener40);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNotNull(panelUI30);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet36);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        javax.swing.border.Border border15 = null;
        managementDashboard1.setBorder(border15);
        java.awt.Graphics graphics17 = null;
        managementDashboard1.print(graphics17);
        java.awt.Color color19 = managementDashboard1.getBackground();
        managementDashboard1.disable();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        managementDashboard1.resize(2, 100);
        boolean boolean7 = managementDashboard1.isCursorSet();
        java.awt.Event event8 = null;
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        managementDashboard10.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.awt.Insets insets21 = managementDashboard14.getInsets();
        java.util.Locale locale22 = managementDashboard14.getLocale();
        java.awt.Graphics graphics23 = null;
        managementDashboard14.printAll(graphics23);
        java.lang.String str25 = managementDashboard14.toString();
        managementDashboard10.setNextFocusableComponent((java.awt.Component) managementDashboard14);
        java.awt.event.MouseListener mouseListener27 = null;
        managementDashboard10.addMouseListener(mouseListener27);
        java.awt.event.MouseWheelListener mouseWheelListener29 = null;
        managementDashboard10.removeMouseWheelListener(mouseWheelListener29);
        java.awt.event.MouseListener mouseListener31 = null;
        managementDashboard10.addMouseListener(mouseListener31);
        javax.swing.InputMap inputMap34 = managementDashboard10.getInputMap(0);
        boolean boolean35 = managementDashboard10.isFocusTraversalPolicyProvider();
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard10.keyUp(event36, 3);
        boolean boolean39 = managementDashboard1.action(event8, (java.lang.Object) boolean38);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str25, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(inputMap34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.awt.Point point6 = managementDashboard1.getPopupLocation(mouseEvent5);
        java.awt.Color color7 = managementDashboard1.getForeground();
        boolean boolean10 = managementDashboard1.contains((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.image.ColorModel colorModel4 = managementDashboard1.getColorModel();
        javax.swing.plaf.PanelUI panelUI5 = managementDashboard1.getUI();
        managementDashboard1.repaint((int) '#', (int) (byte) 0, (int) (short) 0, 8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = managementDashboard1.areFocusTraversalKeysSet(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(colorModel4);
        org.junit.Assert.assertNotNull(panelUI5);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        javax.swing.InputVerifier inputVerifier11 = managementDashboard1.getInputVerifier();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard13.findComponentAt(point28);
        boolean boolean30 = managementDashboard13.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard13.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard35.addPropertyChangeListener(propertyChangeListener36);
        java.awt.event.FocusEvent.Cause cause38 = null;
        managementDashboard35.requestFocus(cause38);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener40);
        java.awt.Point point42 = managementDashboard35.location();
        java.awt.Point point43 = managementDashboard13.getLocation(point42);
        boolean boolean44 = managementDashboard1.contains(point43);
        java.awt.event.MouseListener[] mouseListenerArray45 = managementDashboard1.getMouseListeners();
        managementDashboard1.setFocusCycleRoot(false);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNull(inputVerifier11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(point42);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(mouseListenerArray45);
        org.junit.Assert.assertArrayEquals(mouseListenerArray45, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        managementDashboard1.enable();
        java.awt.Image image23 = managementDashboard1.createImage((-1), 64);
        managementDashboard1.setEnabled(false);
        javax.swing.KeyStroke[] keyStrokeArray26 = managementDashboard1.getRegisteredKeyStrokes();
        boolean boolean27 = managementDashboard1.isFocusOwner();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(keyStrokeArray26);
        org.junit.Assert.assertArrayEquals(keyStrokeArray26, new javax.swing.KeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isFocusOwner();
        boolean boolean3 = managementDashboard1.isDoubleBuffered();
        managementDashboard1.requestFocus();
        managementDashboard1.firePropertyChange("ToolTipText", (long) 4, (long) (short) 1);
        boolean boolean9 = managementDashboard1.isPaintingForPrint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.Insets insets3 = managementDashboard1.getInsets();
        boolean boolean4 = managementDashboard1.getIgnoreRepaint();
        managementDashboard1.move((int) '4', (int) (short) 1);
        int int8 = managementDashboard1.getX();
        javax.swing.event.AncestorListener[] ancestorListenerArray9 = managementDashboard1.getAncestorListeners();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior10 = managementDashboard1.getBaselineResizeBehavior();
        float float11 = managementDashboard1.getAlignmentY();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        managementDashboard1.addMouseWheelListener(mouseWheelListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(insets3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(ancestorListenerArray9);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray9, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior10 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior10.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        managementDashboard19.disable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        boolean boolean18 = managementDashboard1.isFocusable();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.awt.Dimension dimension45 = managementDashboard32.getMaximumSize();
        boolean boolean46 = managementDashboard32.isFocusTraversalPolicySet();
        managementDashboard32.disable();
        boolean boolean48 = managementDashboard32.isRequestFocusEnabled();
        float float49 = managementDashboard32.getAlignmentX();
        boolean boolean50 = managementDashboard32.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        javax.swing.InputVerifier inputVerifier11 = managementDashboard1.getInputVerifier();
        managementDashboard1.invalidate();
        boolean boolean14 = managementDashboard1.requestFocus(false);
        managementDashboard1.setLocation((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNull(inputVerifier11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Point point7 = managementDashboard1.location();
        java.awt.event.MouseListener[] mouseListenerArray8 = managementDashboard1.getMouseListeners();
        org.junit.Assert.assertNotNull(point7);
        org.junit.Assert.assertNotNull(mouseListenerArray8);
        org.junit.Assert.assertArrayEquals(mouseListenerArray8, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.setEnabled(false);
        java.awt.Color color51 = managementDashboard32.getForeground();
        managementDashboard32.firePropertyChange("data/userData.csv", (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Container container31 = managementDashboard1.getParent();
        managementDashboard1.revalidate();
        java.lang.String str33 = managementDashboard1.getUIClassID();
        managementDashboard1.setToolTipText("data/managerData.csv");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(container31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PanelUI" + "'", str33, "PanelUI");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.dnd.DropTarget dropTarget26 = managementDashboard1.getDropTarget();
        boolean boolean29 = managementDashboard1.contains(3, (int) (short) 100);
        java.awt.Dimension dimension30 = managementDashboard1.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        boolean boolean33 = managementDashboard32.isVisible();
        java.awt.Image image36 = managementDashboard32.createImage(13, (-1));
        managementDashboard32.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer39 = null;
        ManagementDashboard managementDashboard40 = new ManagementDashboard(strConsumer39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        managementDashboard40.addPropertyChangeListener(propertyChangeListener41);
        java.awt.event.FocusEvent.Cause cause43 = null;
        managementDashboard40.requestFocus(cause43);
        java.awt.event.InputMethodListener inputMethodListener45 = null;
        managementDashboard40.addInputMethodListener(inputMethodListener45);
        java.awt.Point point47 = managementDashboard40.location();
        java.awt.Component component48 = managementDashboard32.findComponentAt(point47);
        java.awt.Graphics graphics49 = null;
        managementDashboard32.update(graphics49);
        javax.swing.InputVerifier inputVerifier51 = managementDashboard32.getInputVerifier();
        managementDashboard32.firePropertyChange("PanelUI", 'a', '4');
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        boolean boolean58 = managementDashboard57.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        boolean boolean61 = managementDashboard60.isVisible();
        java.awt.Image image64 = managementDashboard60.createImage(13, (-1));
        managementDashboard60.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer67 = null;
        ManagementDashboard managementDashboard68 = new ManagementDashboard(strConsumer67);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        managementDashboard68.addPropertyChangeListener(propertyChangeListener69);
        java.awt.event.FocusEvent.Cause cause71 = null;
        managementDashboard68.requestFocus(cause71);
        java.awt.event.InputMethodListener inputMethodListener73 = null;
        managementDashboard68.addInputMethodListener(inputMethodListener73);
        java.awt.Point point75 = managementDashboard68.location();
        java.awt.Component component76 = managementDashboard60.findComponentAt(point75);
        java.awt.Component component77 = managementDashboard57.getComponentAt(point75);
        managementDashboard57.grabFocus();
        java.awt.Rectangle rectangle79 = managementDashboard57.bounds();
        java.awt.Rectangle rectangle80 = managementDashboard57.bounds();
        managementDashboard32.repaint(rectangle80);
        java.awt.Rectangle rectangle82 = managementDashboard1.getBounds(rectangle80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(image36);
        org.junit.Assert.assertNotNull(point47);
        org.junit.Assert.assertNull(component48);
        org.junit.Assert.assertNull(inputVerifier51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(image64);
        org.junit.Assert.assertNotNull(point75);
        org.junit.Assert.assertNull(component76);
        org.junit.Assert.assertNull(component77);
        org.junit.Assert.assertNotNull(rectangle79);
        org.junit.Assert.assertNotNull(rectangle80);
        org.junit.Assert.assertNotNull(rectangle82);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.image.ImageProducer imageProducer4 = null;
        java.awt.Image image5 = managementDashboard1.createImage(imageProducer4);
        java.awt.Insets insets6 = managementDashboard1.getInsets();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = managementDashboard1.getPropertyChangeListeners("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isVisible();
        java.awt.Image image14 = managementDashboard10.createImage(13, (-1));
        managementDashboard10.remove((int) (short) 1);
        java.awt.Insets insets17 = managementDashboard10.getInsets();
        java.util.Locale locale18 = managementDashboard10.getLocale();
        java.awt.Graphics graphics19 = null;
        managementDashboard10.printAll(graphics19);
        boolean boolean21 = managementDashboard10.isPreferredSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        boolean boolean24 = managementDashboard23.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        boolean boolean27 = managementDashboard26.isVisible();
        java.awt.Image image30 = managementDashboard26.createImage(13, (-1));
        managementDashboard26.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        managementDashboard34.addPropertyChangeListener(propertyChangeListener35);
        java.awt.event.FocusEvent.Cause cause37 = null;
        managementDashboard34.requestFocus(cause37);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard34.addInputMethodListener(inputMethodListener39);
        java.awt.Point point41 = managementDashboard34.location();
        java.awt.Component component42 = managementDashboard26.findComponentAt(point41);
        java.awt.Component component43 = managementDashboard23.getComponentAt(point41);
        managementDashboard23.grabFocus();
        java.awt.Rectangle rectangle45 = managementDashboard23.bounds();
        managementDashboard10.setBounds(rectangle45);
        java.awt.Rectangle rectangle47 = managementDashboard1.getBounds(rectangle45);
        java.awt.im.InputMethodRequests inputMethodRequests48 = managementDashboard1.getInputMethodRequests();
        java.awt.image.ColorModel colorModel49 = managementDashboard1.getColorModel();
        java.awt.Graphics graphics50 = null;
        managementDashboard1.paintAll(graphics50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener52);
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray8, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNotNull(point41);
        org.junit.Assert.assertNull(component42);
        org.junit.Assert.assertNull(component43);
        org.junit.Assert.assertNotNull(rectangle45);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNull(inputMethodRequests48);
        org.junit.Assert.assertNotNull(colorModel49);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        java.awt.Event event49 = null;
        ParkingLot parkingLot51 = new ParkingLot("hi!");
        java.lang.String str52 = parkingLot51.getLotAvailability();
        boolean boolean53 = managementDashboard32.action(event49, (java.lang.Object) parkingLot51);
        java.util.function.Consumer<java.lang.String> strConsumer54 = null;
        ManagementDashboard managementDashboard55 = new ManagementDashboard(strConsumer54);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        managementDashboard55.addPropertyChangeListener(propertyChangeListener56);
        java.lang.String str58 = managementDashboard55.getName();
        java.awt.event.ComponentListener componentListener59 = null;
        managementDashboard55.removeComponentListener(componentListener59);
        managementDashboard55.move((int) (short) 100, 9);
        int int64 = managementDashboard55.getDebugGraphicsOptions();
        java.awt.Component component67 = managementDashboard55.locate(32, 16);
        java.util.function.Consumer<java.lang.String> strConsumer68 = null;
        ManagementDashboard managementDashboard69 = new ManagementDashboard(strConsumer68);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        managementDashboard69.addPropertyChangeListener(propertyChangeListener70);
        java.awt.event.FocusEvent.Cause cause72 = null;
        managementDashboard69.requestFocus(cause72);
        java.awt.event.InputMethodListener inputMethodListener74 = null;
        managementDashboard69.addInputMethodListener(inputMethodListener74);
        java.awt.Color color76 = managementDashboard69.getBackground();
        managementDashboard69.setRequestFocusEnabled(true);
        java.awt.event.MouseListener mouseListener79 = null;
        managementDashboard69.addMouseListener(mouseListener79);
        boolean boolean81 = managementDashboard69.isPaintingTile();
        java.awt.event.MouseEvent mouseEvent82 = null;
        java.awt.Point point83 = managementDashboard69.getPopupLocation(mouseEvent82);
        java.util.function.Consumer<java.lang.String> strConsumer84 = null;
        ManagementDashboard managementDashboard85 = new ManagementDashboard(strConsumer84);
        managementDashboard85.setEnabled(true);
        java.awt.Point point88 = managementDashboard85.location();
        java.awt.Component component89 = managementDashboard69.findComponentAt(point88);
        java.awt.Point point90 = managementDashboard55.getLocation(point88);
        java.awt.Component component91 = managementDashboard32.findComponentAt(point88);
        float float92 = managementDashboard32.getAlignmentY();
        managementDashboard32.setRequestFocusEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(component67);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(point83);
        org.junit.Assert.assertNotNull(point88);
        org.junit.Assert.assertNull(component89);
        org.junit.Assert.assertNotNull(point90);
        org.junit.Assert.assertNull(component91);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 0.5f + "'", float92 == 0.5f);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.revalidate();
        boolean boolean50 = managementDashboard32.isFocusTraversalPolicySet();
        boolean boolean51 = managementDashboard32.isPaintingForPrint();
        int int54 = managementDashboard32.getBaseline(13, 128);
        java.util.function.Consumer<java.lang.String> strConsumer55 = null;
        ManagementDashboard managementDashboard56 = new ManagementDashboard(strConsumer55);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        managementDashboard56.addPropertyChangeListener(propertyChangeListener57);
        java.lang.String str59 = managementDashboard56.getName();
        java.awt.event.ComponentListener componentListener60 = null;
        managementDashboard56.removeComponentListener(componentListener60);
        managementDashboard56.move((int) (short) 100, 9);
        int int65 = managementDashboard56.getDebugGraphicsOptions();
        managementDashboard56.setSize(11, 8);
        javax.swing.KeyStroke[] keyStrokeArray69 = managementDashboard56.getRegisteredKeyStrokes();
        java.awt.Event event70 = null;
        boolean boolean73 = managementDashboard56.mouseExit(event70, (int) (byte) 10, 3);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard32.setComponentZOrder((java.awt.Component) managementDashboard56, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(keyStrokeArray69);
        org.junit.Assert.assertArrayEquals(keyStrokeArray69, new javax.swing.KeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard1.validate();
        managementDashboard1.invalidate();
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        boolean boolean8 = managementDashboard1.areFocusTraversalKeysSet((int) (byte) 1);
        java.awt.Graphics graphics9 = null;
        managementDashboard1.paintAll(graphics9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.setFocusTraversalKeysEnabled(false);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard15.addPropertyChangeListener(propertyChangeListener16);
        java.awt.event.FocusEvent.Cause cause18 = null;
        managementDashboard15.requestFocus(cause18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        managementDashboard15.addInputMethodListener(inputMethodListener20);
        managementDashboard15.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float27 = managementDashboard15.getAlignmentY();
        managementDashboard15.doLayout();
        javax.swing.InputMap inputMap29 = managementDashboard15.getInputMap();
        managementDashboard1.setInputMap((int) (short) 0, inputMap29);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior31 = managementDashboard1.getBaselineResizeBehavior();
        managementDashboard1.requestFocus();
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap34 = managementDashboard1.getInputMap((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(inputMap29);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior31 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior31.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isFocusable();
        java.awt.event.ComponentListener componentListener11 = null;
        managementDashboard1.addComponentListener(componentListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        java.awt.Component component30 = managementDashboard14.findComponentAt(point29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.image.ImageProducer imageProducer33 = null;
        java.awt.Image image34 = managementDashboard32.createImage(imageProducer33);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        int int43 = managementDashboard14.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isVisible();
        java.awt.Image image49 = managementDashboard45.createImage(13, (-1));
        managementDashboard45.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener52 = null;
        managementDashboard45.removeMouseMotionListener(mouseMotionListener52);
        managementDashboard45.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray57 = managementDashboard45.getComponents();
        java.awt.Point point58 = managementDashboard45.location();
        managementDashboard45.setFocusTraversalPolicyProvider(false);
        int int61 = managementDashboard1.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard45);
        java.awt.LayoutManager layoutManager62 = null;
        managementDashboard1.setLayout(layoutManager62);
        javax.swing.ActionMap actionMap64 = managementDashboard1.getActionMap();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertNotNull(image34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(componentArray57);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(actionMap64);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        GenerateAccountView generateAccountView1 = new GenerateAccountView(strConsumer0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = generateAccountView1.getPropertyChangeListeners();
        javax.swing.InputVerifier inputVerifier3 = null;
        generateAccountView1.setInputVerifier(inputVerifier3);
        java.util.function.Consumer<java.lang.String> strConsumer5 = null;
        ManagementDashboard managementDashboard6 = new ManagementDashboard(strConsumer5);
        int int7 = managementDashboard6.countComponents();
        managementDashboard6.resetKeyboardActions();
        managementDashboard6.layout();
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.awt.Point point11 = managementDashboard6.getPopupLocation(mouseEvent10);
        java.awt.Color color12 = managementDashboard6.getForeground();
        generateAccountView1.setForeground(color12);
        generateAccountView1.reshape((int) (short) 1, 6, 12, (int) (byte) 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray2, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isFocusOwner();
        boolean boolean3 = managementDashboard1.isDoubleBuffered();
        managementDashboard1.setAlignmentX((float) 32);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        managementDashboard7.addPropertyChangeListener(propertyChangeListener8);
        java.awt.event.FocusEvent.Cause cause10 = null;
        managementDashboard7.requestFocus(cause10);
        java.awt.Color color12 = managementDashboard7.getBackground();
        managementDashboard1.setForeground(color12);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.LayoutManager layoutManager17 = managementDashboard15.getLayout();
        java.awt.Graphics graphics18 = null;
        managementDashboard15.print(graphics18);
        java.lang.String str20 = managementDashboard15.getToolTipText();
        java.awt.Container container21 = managementDashboard15.getTopLevelAncestor();
        managementDashboard15.setLocation((int) (short) 100, (int) (byte) 100);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.awt.image.ImageProducer imageProducer29 = null;
        java.awt.Image image30 = managementDashboard26.createImage(imageProducer29);
        java.awt.Insets insets31 = managementDashboard26.getInsets();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray33 = managementDashboard26.getPropertyChangeListeners("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isVisible();
        java.awt.Image image39 = managementDashboard35.createImage(13, (-1));
        managementDashboard35.remove((int) (short) 1);
        java.awt.Insets insets42 = managementDashboard35.getInsets();
        java.util.Locale locale43 = managementDashboard35.getLocale();
        java.awt.Graphics graphics44 = null;
        managementDashboard35.printAll(graphics44);
        boolean boolean46 = managementDashboard35.isPreferredSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer47 = null;
        ManagementDashboard managementDashboard48 = new ManagementDashboard(strConsumer47);
        boolean boolean49 = managementDashboard48.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        boolean boolean52 = managementDashboard51.isVisible();
        java.awt.Image image55 = managementDashboard51.createImage(13, (-1));
        managementDashboard51.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer58 = null;
        ManagementDashboard managementDashboard59 = new ManagementDashboard(strConsumer58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        managementDashboard59.addPropertyChangeListener(propertyChangeListener60);
        java.awt.event.FocusEvent.Cause cause62 = null;
        managementDashboard59.requestFocus(cause62);
        java.awt.event.InputMethodListener inputMethodListener64 = null;
        managementDashboard59.addInputMethodListener(inputMethodListener64);
        java.awt.Point point66 = managementDashboard59.location();
        java.awt.Component component67 = managementDashboard51.findComponentAt(point66);
        java.awt.Component component68 = managementDashboard48.getComponentAt(point66);
        managementDashboard48.grabFocus();
        java.awt.Rectangle rectangle70 = managementDashboard48.bounds();
        managementDashboard35.setBounds(rectangle70);
        java.awt.Rectangle rectangle72 = managementDashboard26.getBounds(rectangle70);
        managementDashboard15.paintImmediately(rectangle70);
        managementDashboard1.setBounds(rectangle70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(layoutManager17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertNotNull(image30);
        org.junit.Assert.assertNotNull(insets31);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray33);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray33, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNotNull(insets42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(image55);
        org.junit.Assert.assertNotNull(point66);
        org.junit.Assert.assertNull(component67);
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNotNull(rectangle70);
        org.junit.Assert.assertNotNull(rectangle72);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy8);
        java.awt.Component component12 = managementDashboard1.findComponentAt(128, 4);
        boolean boolean13 = managementDashboard1.isFocusTraversalPolicySet();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = managementDashboard1.getComponent((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNull(component12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        java.awt.Color color9 = managementDashboard1.getBackground();
        boolean boolean10 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        managementDashboard1.transferFocusBackward();
        java.awt.Event event12 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.deliverEvent(event12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        boolean boolean9 = managementDashboard1.isVisible();
        managementDashboard1.transferFocusUpCycle();
        javax.swing.JPopupMenu jPopupMenu11 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu11);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        java.awt.im.InputMethodRequests inputMethodRequests7 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.firePropertyChange("123456789", (short) 0, (short) -1);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        managementDashboard13.addPropertyChangeListener(propertyChangeListener14);
        java.awt.event.FocusEvent.Cause cause16 = null;
        managementDashboard13.requestFocus(cause16);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        managementDashboard13.addInputMethodListener(inputMethodListener18);
        java.awt.Point point20 = managementDashboard13.location();
        javax.swing.plaf.PanelUI panelUI21 = managementDashboard13.getUI();
        javax.swing.InputVerifier inputVerifier22 = managementDashboard13.getInputVerifier();
        managementDashboard13.validate();
        boolean boolean24 = managementDashboard13.isFocusOwner();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = managementDashboard13.getBaselineResizeBehavior();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = managementDashboard27.createImage(imageProducer28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard31.addPropertyChangeListener(propertyChangeListener32);
        java.awt.event.FocusEvent.Cause cause34 = null;
        managementDashboard31.requestFocus(cause34);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard31.addInputMethodListener(inputMethodListener36);
        java.awt.Point point38 = managementDashboard31.location();
        java.awt.Component component39 = managementDashboard27.add((java.awt.Component) managementDashboard31);
        javax.swing.JPopupMenu jPopupMenu40 = managementDashboard27.getComponentPopupMenu();
        managementDashboard27.repaint((int) '#', 9, 1, (-1));
        managementDashboard27.setIgnoreRepaint(true);
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        java.awt.event.ActionListener actionListener50 = null;
        javax.swing.KeyStroke keyStroke52 = null;
        managementDashboard49.registerKeyboardAction(actionListener50, "hi!", keyStroke52, (int) (short) 0);
        java.awt.Font font55 = managementDashboard49.getFont();
        managementDashboard27.setFont(font55);
        managementDashboard1.putClientProperty((java.lang.Object) baselineResizeBehavior25, (java.lang.Object) font55);
        java.awt.event.ComponentListener componentListener58 = null;
        managementDashboard1.removeComponentListener(componentListener58);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inputMethodRequests7);
        org.junit.Assert.assertNotNull(point20);
        org.junit.Assert.assertNotNull(panelUI21);
        org.junit.Assert.assertNull(inputVerifier22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior25 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior25.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertNull(jPopupMenu40);
        org.junit.Assert.assertNotNull(font55);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        javax.swing.InputMap inputMap14 = managementDashboard1.getInputMap();
        boolean boolean15 = managementDashboard1.isPaintingTile();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(inputMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        java.util.Locale locale9 = managementDashboard1.getLocale();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.printAll(graphics10);
        java.lang.String str12 = managementDashboard1.toString();
        boolean boolean13 = managementDashboard1.isOptimizedDrawingEnabled();
        boolean boolean14 = managementDashboard1.isFocusable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str12, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        managementDashboard1.grabFocus();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        int int6 = managementDashboard1.getWidth();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        boolean boolean13 = managementDashboard1.isValid();
        managementDashboard1.reshape(8, (int) ' ', (int) (short) 10, 1);
        java.util.Locale locale19 = managementDashboard1.getLocale();
        java.awt.dnd.DropTarget dropTarget20 = null;
        managementDashboard1.setDropTarget(dropTarget20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        int int10 = managementDashboard1.getWidth();
        java.util.Locale locale11 = managementDashboard1.getLocale();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.event.MouseListener mouseListener11 = null;
        managementDashboard1.addMouseListener(mouseListener11);
        boolean boolean13 = managementDashboard1.isPaintingTile();
        java.awt.event.MouseEvent mouseEvent14 = null;
        java.awt.Point point15 = managementDashboard1.getPopupLocation(mouseEvent14);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setEnabled(true);
        java.awt.Point point20 = managementDashboard17.location();
        java.awt.Component component21 = managementDashboard1.findComponentAt(point20);
        managementDashboard1.invalidate();
        boolean boolean23 = managementDashboard1.isVisible();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(point20);
        org.junit.Assert.assertNull(component21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.setFocusTraversalKeysEnabled(false);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard15.addPropertyChangeListener(propertyChangeListener16);
        java.awt.event.FocusEvent.Cause cause18 = null;
        managementDashboard15.requestFocus(cause18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        managementDashboard15.addInputMethodListener(inputMethodListener20);
        managementDashboard15.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float27 = managementDashboard15.getAlignmentY();
        managementDashboard15.doLayout();
        javax.swing.InputMap inputMap29 = managementDashboard15.getInputMap();
        managementDashboard1.setInputMap((int) (short) 0, inputMap29);
        java.io.PrintStream printStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printStream31, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(inputMap29);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        int int8 = managementDashboard1.getWidth();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isVisible();
        java.awt.Image image14 = managementDashboard10.createImage(13, (-1));
        managementDashboard10.remove((int) (short) 1);
        java.awt.Dimension dimension17 = managementDashboard10.minimumSize();
        managementDashboard1.setMinimumSize(dimension17);
        java.awt.MenuComponent menuComponent19 = null;
        managementDashboard1.remove(menuComponent19);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.awt.image.ColorModel colorModel4 = managementDashboard1.getColorModel();
        java.awt.ComponentOrientation componentOrientation5 = managementDashboard1.getComponentOrientation();
        int int6 = managementDashboard1.getComponentCount();
        javax.swing.TransferHandler transferHandler7 = managementDashboard1.getTransferHandler();
        java.awt.event.KeyListener[] keyListenerArray8 = managementDashboard1.getKeyListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(colorModel4);
        org.junit.Assert.assertNotNull(componentOrientation5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(transferHandler7);
        org.junit.Assert.assertNotNull(keyListenerArray8);
        org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        java.awt.im.InputContext inputContext13 = managementDashboard1.getInputContext();
        int int16 = managementDashboard1.getBaseline((int) (byte) 100, (int) (byte) 10);
        java.awt.Point point17 = managementDashboard1.getLocation();
        boolean boolean18 = managementDashboard1.isFontSet();
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        boolean boolean21 = managementDashboard20.isVisible();
        java.awt.Image image24 = managementDashboard20.createImage(13, (-1));
        managementDashboard20.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard28.addPropertyChangeListener(propertyChangeListener29);
        java.awt.event.FocusEvent.Cause cause31 = null;
        managementDashboard28.requestFocus(cause31);
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        managementDashboard28.addInputMethodListener(inputMethodListener33);
        java.awt.Point point35 = managementDashboard28.location();
        java.awt.Component component36 = managementDashboard20.findComponentAt(point35);
        boolean boolean37 = managementDashboard20.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        managementDashboard20.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener39);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        managementDashboard42.addPropertyChangeListener(propertyChangeListener43);
        java.awt.event.FocusEvent.Cause cause45 = null;
        managementDashboard42.requestFocus(cause45);
        java.awt.event.InputMethodListener inputMethodListener47 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener47);
        java.awt.Point point49 = managementDashboard42.location();
        java.awt.Point point50 = managementDashboard20.getLocation(point49);
        java.awt.Component component51 = managementDashboard1.getComponentAt(point50);
        int int52 = managementDashboard1.getX();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(inputContext13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(point17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(point35);
        org.junit.Assert.assertNull(component36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(point49);
        org.junit.Assert.assertNotNull(point50);
        org.junit.Assert.assertNull(component51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        int int47 = managementDashboard32.getHeight();
        java.awt.Point point48 = managementDashboard32.getMousePosition();
        javax.swing.event.AncestorListener ancestorListener49 = null;
        managementDashboard32.addAncestorListener(ancestorListener49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(point48);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Component component12 = managementDashboard1.getComponentAt(8, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertNull(component12);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        SuperManager superManager0 = new SuperManager();
        java.lang.String str1 = superManager0.getUsername();
        java.lang.String str2 = superManager0.getPassword();
        MainSystem.currentManager = superManager0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SUPERMAN" + "'", str1, "SUPERMAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "123456789" + "'", str2, "123456789");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.dnd.DropTarget dropTarget26 = managementDashboard1.getDropTarget();
        java.awt.image.VolatileImage volatileImage29 = managementDashboard1.createVolatileImage((int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertNull(volatileImage29);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.transferFocusBackward();
        managementDashboard1.repaint((long) 5, 52, (int) (byte) 0, (int) (short) 1, 64);
        SuperManager superManager18 = SuperManager.getInstance();
        java.lang.String str19 = superManager18.getUsername();
        MainSystem.currentManager = superManager18;
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isVisible();
        java.awt.Image image26 = managementDashboard22.createImage(13, (-1));
        java.awt.Event event27 = null;
        boolean boolean30 = managementDashboard22.mouseMove(event27, (-1), (int) (byte) 0);
        boolean boolean31 = managementDashboard22.isMinimumSizeSet();
        java.awt.Graphics graphics32 = null;
        managementDashboard22.print(graphics32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        boolean boolean39 = managementDashboard38.isVisible();
        java.awt.Image image42 = managementDashboard38.createImage(13, (-1));
        managementDashboard38.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        managementDashboard46.addPropertyChangeListener(propertyChangeListener47);
        java.awt.event.FocusEvent.Cause cause49 = null;
        managementDashboard46.requestFocus(cause49);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        managementDashboard46.addInputMethodListener(inputMethodListener51);
        java.awt.Point point53 = managementDashboard46.location();
        java.awt.Component component54 = managementDashboard38.findComponentAt(point53);
        java.awt.Component component55 = managementDashboard35.getComponentAt(point53);
        managementDashboard35.grabFocus();
        java.awt.Rectangle rectangle57 = managementDashboard35.bounds();
        managementDashboard22.paintImmediately(rectangle57);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        boolean boolean61 = managementDashboard60.isVisible();
        java.awt.Image image64 = managementDashboard60.createImage(13, (-1));
        managementDashboard60.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer67 = null;
        ManagementDashboard managementDashboard68 = new ManagementDashboard(strConsumer67);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        managementDashboard68.addPropertyChangeListener(propertyChangeListener69);
        java.awt.event.FocusEvent.Cause cause71 = null;
        managementDashboard68.requestFocus(cause71);
        java.awt.event.InputMethodListener inputMethodListener73 = null;
        managementDashboard68.addInputMethodListener(inputMethodListener73);
        java.awt.Point point75 = managementDashboard68.location();
        java.awt.Component component76 = managementDashboard60.findComponentAt(point75);
        java.util.function.Consumer<java.lang.String> strConsumer77 = null;
        ManagementDashboard managementDashboard78 = new ManagementDashboard(strConsumer77);
        int int79 = managementDashboard78.countComponents();
        managementDashboard78.resetKeyboardActions();
        managementDashboard78.layout();
        java.awt.event.MouseEvent mouseEvent82 = null;
        java.awt.Point point83 = managementDashboard78.getPopupLocation(mouseEvent82);
        boolean boolean84 = managementDashboard60.isAncestorOf((java.awt.Component) managementDashboard78);
        java.awt.dnd.DropTarget dropTarget85 = managementDashboard60.getDropTarget();
        int int86 = managementDashboard60.getY();
        java.awt.Point point87 = managementDashboard60.location();
        boolean boolean88 = managementDashboard22.isAncestorOf((java.awt.Component) managementDashboard60);
        managementDashboard22.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) 0L, (double) 100);
        java.awt.Dimension dimension93 = managementDashboard22.getMaximumSize();
        managementDashboard1.putClientProperty((java.lang.Object) superManager18, (java.lang.Object) managementDashboard22);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SUPERMAN" + "'", str19, "SUPERMAN");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(image42);
        org.junit.Assert.assertNotNull(point53);
        org.junit.Assert.assertNull(component54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(rectangle57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(image64);
        org.junit.Assert.assertNotNull(point75);
        org.junit.Assert.assertNull(component76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNull(point83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(dropTarget85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(point87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(dimension93);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.awt.Graphics graphics45 = null;
        managementDashboard32.print(graphics45);
        java.awt.Event event47 = null;
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.awt.Image image53 = managementDashboard49.createImage(13, (-1));
        managementDashboard49.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener56 = null;
        managementDashboard49.removeMouseMotionListener(mouseMotionListener56);
        managementDashboard49.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray61 = managementDashboard49.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        java.awt.event.ActionListener actionListener64 = null;
        javax.swing.KeyStroke keyStroke66 = null;
        managementDashboard63.registerKeyboardAction(actionListener64, "hi!", keyStroke66, (int) (short) 0);
        java.awt.Font font69 = managementDashboard63.getFont();
        managementDashboard49.setFont(font69);
        javax.swing.JPopupMenu jPopupMenu71 = managementDashboard49.getComponentPopupMenu();
        boolean boolean72 = managementDashboard32.action(event47, (java.lang.Object) managementDashboard49);
        java.awt.Point point73 = null;
        java.awt.Point point74 = managementDashboard32.getLocation(point73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(image53);
        org.junit.Assert.assertNotNull(componentArray61);
        org.junit.Assert.assertNotNull(font69);
        org.junit.Assert.assertNull(jPopupMenu71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(point74);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.Color color6 = managementDashboard1.getBackground();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        managementDashboard1.setAlignmentX((float) (-1L));
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        java.awt.image.ImageProducer imageProducer12 = null;
        java.awt.Image image13 = managementDashboard11.createImage(imageProducer12);
        managementDashboard11.resize(2, 100);
        java.beans.VetoableChangeListener vetoableChangeListener17 = null;
        managementDashboard11.removeVetoableChangeListener(vetoableChangeListener17);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        boolean boolean21 = managementDashboard20.isVisible();
        java.awt.Image image24 = managementDashboard20.createImage(13, (-1));
        managementDashboard20.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard28.addPropertyChangeListener(propertyChangeListener29);
        java.awt.event.FocusEvent.Cause cause31 = null;
        managementDashboard28.requestFocus(cause31);
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        managementDashboard28.addInputMethodListener(inputMethodListener33);
        java.awt.Point point35 = managementDashboard28.location();
        java.awt.Component component36 = managementDashboard20.findComponentAt(point35);
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = managementDashboard38.createImage(imageProducer39);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        managementDashboard42.addPropertyChangeListener(propertyChangeListener43);
        java.awt.event.FocusEvent.Cause cause45 = null;
        managementDashboard42.requestFocus(cause45);
        java.awt.event.InputMethodListener inputMethodListener47 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener47);
        int int49 = managementDashboard20.checkImage(image40, (java.awt.image.ImageObserver) managementDashboard42);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        managementDashboard51.addPropertyChangeListener(propertyChangeListener52);
        java.util.Locale locale54 = managementDashboard51.getLocale();
        float float55 = managementDashboard51.getAlignmentY();
        java.awt.Component component56 = managementDashboard42.add((java.awt.Component) managementDashboard51);
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        managementDashboard58.addPropertyChangeListener(propertyChangeListener59);
        java.util.Locale locale61 = managementDashboard58.getLocale();
        managementDashboard51.setLocale(locale61);
        managementDashboard11.setLocale(locale61);
        java.awt.Font font64 = managementDashboard11.getFont();
        java.awt.FontMetrics fontMetrics65 = managementDashboard1.getFontMetrics(font64);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNotNull(image13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(point35);
        org.junit.Assert.assertNull(component36);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.5f + "'", float55 == 0.5f);
        org.junit.Assert.assertNotNull(component56);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertNotNull(font64);
        org.junit.Assert.assertNotNull(fontMetrics65);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        boolean boolean9 = managementDashboard1.isManagingFocus();
        javax.swing.JPopupMenu jPopupMenu10 = managementDashboard1.getComponentPopupMenu();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jPopupMenu10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.event.InputMethodListener[] inputMethodListenerArray6 = managementDashboard1.getInputMethodListeners();
        java.beans.VetoableChangeListener vetoableChangeListener7 = null;
        managementDashboard1.addVetoableChangeListener(vetoableChangeListener7);
        org.junit.Assert.assertNotNull(inputMethodListenerArray6);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray6, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        component13.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.awt.image.ImageProducer imageProducer19 = null;
        java.awt.Image image20 = component13.createImage(imageProducer19);
        boolean boolean21 = component13.isFontSet();
        java.awt.Event event22 = null;
        boolean boolean24 = component13.keyUp(event22, 35);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        boolean boolean8 = managementDashboard1.isFocusable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        java.awt.im.InputMethodRequests inputMethodRequests7 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.firePropertyChange("123456789", (short) 0, (short) -1);
        managementDashboard1.show();
        managementDashboard1.enable(false);
        java.lang.Object obj15 = managementDashboard1.getTreeLock();
        managementDashboard1.setDoubleBuffered(false);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inputMethodRequests7);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        float float10 = managementDashboard1.getAlignmentY();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        managementDashboard1.show(true);
        boolean boolean20 = managementDashboard1.isFocusOwner();
        boolean boolean21 = managementDashboard1.isValid();
        boolean boolean22 = managementDashboard1.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        managementAccountsView1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = managementAccountsView1.isFocusTraversable();
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        managementAccountsView1.addInputMethodListener(inputMethodListener5);
        managementAccountsView1.revalidate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.event.ComponentListener componentListener6 = null;
        managementDashboard1.removeComponentListener(componentListener6);
        java.awt.event.MouseListener[] mouseListenerArray8 = managementDashboard1.getMouseListeners();
        managementDashboard1.layout();
        org.junit.Assert.assertNotNull(mouseListenerArray8);
        org.junit.Assert.assertArrayEquals(mouseListenerArray8, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        javax.swing.InputVerifier inputVerifier11 = managementDashboard1.getInputVerifier();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard13.findComponentAt(point28);
        boolean boolean30 = managementDashboard13.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard13.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard35.addPropertyChangeListener(propertyChangeListener36);
        java.awt.event.FocusEvent.Cause cause38 = null;
        managementDashboard35.requestFocus(cause38);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener40);
        java.awt.Point point42 = managementDashboard35.location();
        java.awt.Point point43 = managementDashboard13.getLocation(point42);
        boolean boolean44 = managementDashboard1.contains(point43);
        java.awt.Insets insets45 = managementDashboard1.getInsets();
        int int46 = managementDashboard1.getWidth();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertNull(inputVerifier11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(point42);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(insets45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        managementDashboard1.requestFocus();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) (short) 0, 1);
        managementDashboard1.transferFocus();
        java.awt.Dimension dimension10 = managementDashboard1.getMaximumSize();
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(dimension10);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        GenerateAccountView generateAccountView1 = new GenerateAccountView(strConsumer0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = generateAccountView1.getPropertyChangeListeners();
        generateAccountView1.firePropertyChange("PanelUI", (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray2, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        int int7 = managementDashboard1.getWidth();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.awt.Image image13 = managementDashboard9.createImage(13, (-1));
        managementDashboard9.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        managementDashboard17.addPropertyChangeListener(propertyChangeListener18);
        java.awt.event.FocusEvent.Cause cause20 = null;
        managementDashboard17.requestFocus(cause20);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard17.addInputMethodListener(inputMethodListener22);
        java.awt.Point point24 = managementDashboard17.location();
        java.awt.Component component25 = managementDashboard9.findComponentAt(point24);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = managementDashboard27.createImage(imageProducer28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard31.addPropertyChangeListener(propertyChangeListener32);
        java.awt.event.FocusEvent.Cause cause34 = null;
        managementDashboard31.requestFocus(cause34);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard31.addInputMethodListener(inputMethodListener36);
        int int38 = managementDashboard9.checkImage(image29, (java.awt.image.ImageObserver) managementDashboard31);
        java.awt.Container container39 = managementDashboard9.getParent();
        javax.swing.JRootPane jRootPane40 = managementDashboard9.getRootPane();
        javax.accessibility.AccessibleContext accessibleContext41 = managementDashboard9.getAccessibleContext();
        java.awt.Cursor cursor42 = managementDashboard9.getCursor();
        managementDashboard1.setCursor(cursor42);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(point24);
        org.junit.Assert.assertNull(component25);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(container39);
        org.junit.Assert.assertNull(jRootPane40);
        org.junit.Assert.assertNotNull(accessibleContext41);
        org.junit.Assert.assertNotNull(cursor42);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        javax.swing.border.Border border15 = null;
        managementDashboard1.setBorder(border15);
        managementDashboard1.firePropertyChange("SUPERMAN", (byte) 0, (byte) 10);
        java.awt.Dimension dimension21 = managementDashboard1.size();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(dimension21);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        managementDashboard72.setAlignmentX((float) 6);
        java.awt.Rectangle rectangle93 = managementDashboard72.getBounds();
        java.awt.ImageCapabilities imageCapabilities96 = null;
        java.awt.image.VolatileImage volatileImage97 = managementDashboard72.createVolatileImage(64, (int) '4', imageCapabilities96);
        boolean boolean98 = managementDashboard72.isValid();
        managementDashboard72.removeNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(rectangle93);
        org.junit.Assert.assertNull(volatileImage97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        java.util.Locale locale9 = managementDashboard1.getLocale();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.printAll(graphics10);
        boolean boolean12 = managementDashboard1.isPreferredSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        boolean boolean18 = managementDashboard17.isVisible();
        java.awt.Image image21 = managementDashboard17.createImage(13, (-1));
        managementDashboard17.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        managementDashboard25.addPropertyChangeListener(propertyChangeListener26);
        java.awt.event.FocusEvent.Cause cause28 = null;
        managementDashboard25.requestFocus(cause28);
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener30);
        java.awt.Point point32 = managementDashboard25.location();
        java.awt.Component component33 = managementDashboard17.findComponentAt(point32);
        java.awt.Component component34 = managementDashboard14.getComponentAt(point32);
        managementDashboard14.grabFocus();
        java.awt.Rectangle rectangle36 = managementDashboard14.bounds();
        managementDashboard1.setBounds(rectangle36);
        java.awt.event.MouseEvent mouseEvent38 = null;
        java.lang.String str39 = managementDashboard1.getToolTipText(mouseEvent38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(point32);
        org.junit.Assert.assertNull(component33);
        org.junit.Assert.assertNull(component34);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDown(event6, 12, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        ManagementDashboard managementDashboard4 = new ManagementDashboard(strConsumer3);
        boolean boolean5 = managementDashboard4.isVisible();
        java.awt.Image image8 = managementDashboard4.createImage(13, (-1));
        managementDashboard4.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        java.awt.event.FocusEvent.Cause cause15 = null;
        managementDashboard12.requestFocus(cause15);
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        managementDashboard12.addInputMethodListener(inputMethodListener17);
        java.awt.Point point19 = managementDashboard12.location();
        java.awt.Component component20 = managementDashboard4.findComponentAt(point19);
        java.awt.Component component21 = managementDashboard1.getComponentAt(point19);
        java.awt.Dimension dimension22 = managementDashboard1.getMinimumSize();
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        managementDashboard1.removeHierarchyListener(hierarchyListener23);
        java.awt.Insets insets25 = managementDashboard1.getInsets();
        managementDashboard1.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNull(component21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(insets25);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) (short) 0, 1);
        managementDashboard1.transferFocus();
        int int10 = managementDashboard1.getHeight();
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        java.awt.MenuComponent menuComponent13 = null;
        managementDashboard1.remove(menuComponent13);
        boolean boolean15 = managementDashboard1.isBackgroundSet();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        managementDashboard1.enable();
        managementDashboard1.requestFocus();
        java.awt.Color color6 = managementDashboard1.getBackground();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        managementDashboard1.setToolTipText("Empty");
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        managementDashboard1.firePropertyChange("", (byte) 0, (byte) -1);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        managementDashboard1.removeHierarchyListener(hierarchyListener23);
        managementDashboard1.reshape(35, (int) (short) 100, 52, 32);
        java.awt.Graphics graphics30 = null;
        managementDashboard1.paintComponents(graphics30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener8);
        managementDashboard1.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray13 = managementDashboard1.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Image image19 = managementDashboard15.createImage(13, (-1));
        managementDashboard15.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Component component31 = managementDashboard15.findComponentAt(point30);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        java.awt.image.ImageProducer imageProducer34 = null;
        java.awt.Image image35 = managementDashboard33.createImage(imageProducer34);
        java.util.function.Consumer<java.lang.String> strConsumer36 = null;
        ManagementDashboard managementDashboard37 = new ManagementDashboard(strConsumer36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        managementDashboard37.addPropertyChangeListener(propertyChangeListener38);
        java.awt.event.FocusEvent.Cause cause40 = null;
        managementDashboard37.requestFocus(cause40);
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        managementDashboard37.addInputMethodListener(inputMethodListener42);
        int int44 = managementDashboard15.checkImage(image35, (java.awt.image.ImageObserver) managementDashboard37);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        managementDashboard46.addPropertyChangeListener(propertyChangeListener47);
        java.util.Locale locale49 = managementDashboard46.getLocale();
        float float50 = managementDashboard46.getAlignmentY();
        java.awt.Component component51 = managementDashboard37.add((java.awt.Component) managementDashboard46);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        managementDashboard53.addPropertyChangeListener(propertyChangeListener54);
        java.util.Locale locale56 = managementDashboard53.getLocale();
        managementDashboard46.setLocale(locale56);
        managementDashboard46.addNotify();
        managementDashboard46.setVisible(true);
        java.awt.Container container61 = managementDashboard46.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        boolean boolean64 = managementDashboard63.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        boolean boolean67 = managementDashboard66.isVisible();
        java.awt.Image image70 = managementDashboard66.createImage(13, (-1));
        managementDashboard66.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer73 = null;
        ManagementDashboard managementDashboard74 = new ManagementDashboard(strConsumer73);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        managementDashboard74.addPropertyChangeListener(propertyChangeListener75);
        java.awt.event.FocusEvent.Cause cause77 = null;
        managementDashboard74.requestFocus(cause77);
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        managementDashboard74.addInputMethodListener(inputMethodListener79);
        java.awt.Point point81 = managementDashboard74.location();
        java.awt.Component component82 = managementDashboard66.findComponentAt(point81);
        java.awt.Component component83 = managementDashboard63.getComponentAt(point81);
        java.awt.Point point84 = managementDashboard46.getLocation(point81);
        boolean boolean85 = managementDashboard46.isFocusCycleRoot();
        boolean boolean86 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard46);
        java.awt.event.KeyListener keyListener87 = null;
        managementDashboard1.addKeyListener(keyListener87);
        managementDashboard1.grabFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(componentArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNull(component31);
        org.junit.Assert.assertNotNull(image35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.5f + "'", float50 == 0.5f);
        org.junit.Assert.assertNotNull(component51);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertNull(container61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(image70);
        org.junit.Assert.assertNotNull(point81);
        org.junit.Assert.assertNull(component82);
        org.junit.Assert.assertNull(component83);
        org.junit.Assert.assertNotNull(point84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.printAll(graphics4);
        java.awt.Rectangle rectangle6 = managementDashboard1.getVisibleRect();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(rectangle6);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.JRootPane jRootPane4 = managementDashboard1.getRootPane();
        boolean boolean5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        managementDashboard1.enable(true);
        managementDashboard1.move(12, 10);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNull(jRootPane4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        int int10 = managementDashboard1.getWidth();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Image image19 = managementDashboard15.createImage(13, (-1));
        managementDashboard15.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Component component31 = managementDashboard15.findComponentAt(point30);
        java.awt.Component component32 = managementDashboard12.getComponentAt(point30);
        managementDashboard12.grabFocus();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isVisible();
        java.awt.Image image39 = managementDashboard35.createImage(13, (-1));
        managementDashboard35.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard43.addPropertyChangeListener(propertyChangeListener44);
        java.awt.event.FocusEvent.Cause cause46 = null;
        managementDashboard43.requestFocus(cause46);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard43.addInputMethodListener(inputMethodListener48);
        java.awt.Point point50 = managementDashboard43.location();
        java.awt.Component component51 = managementDashboard35.findComponentAt(point50);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.awt.image.ImageProducer imageProducer54 = null;
        java.awt.Image image55 = managementDashboard53.createImage(imageProducer54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        managementDashboard57.addPropertyChangeListener(propertyChangeListener58);
        java.awt.event.FocusEvent.Cause cause60 = null;
        managementDashboard57.requestFocus(cause60);
        java.awt.event.InputMethodListener inputMethodListener62 = null;
        managementDashboard57.addInputMethodListener(inputMethodListener62);
        int int64 = managementDashboard35.checkImage(image55, (java.awt.image.ImageObserver) managementDashboard57);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        managementDashboard66.addPropertyChangeListener(propertyChangeListener67);
        java.util.Locale locale69 = managementDashboard66.getLocale();
        float float70 = managementDashboard66.getAlignmentY();
        java.awt.Component component71 = managementDashboard57.add((java.awt.Component) managementDashboard66);
        java.util.function.Consumer<java.lang.String> strConsumer72 = null;
        ManagementDashboard managementDashboard73 = new ManagementDashboard(strConsumer72);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        managementDashboard73.addPropertyChangeListener(propertyChangeListener74);
        java.util.Locale locale76 = managementDashboard73.getLocale();
        managementDashboard66.setLocale(locale76);
        managementDashboard66.addNotify();
        java.awt.Dimension dimension79 = managementDashboard66.getMaximumSize();
        managementDashboard12.setMaximumSize(dimension79);
        managementDashboard1.setPreferredSize(dimension79);
        boolean boolean82 = managementDashboard1.isManagingFocus();
        javax.swing.InputMap inputMap83 = managementDashboard1.getInputMap();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNull(component31);
        org.junit.Assert.assertNull(component32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNotNull(point50);
        org.junit.Assert.assertNull(component51);
        org.junit.Assert.assertNotNull(image55);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.5f + "'", float70 == 0.5f);
        org.junit.Assert.assertNotNull(component71);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(inputMap83);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Event event11 = null;
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        managementDashboard21.addPropertyChangeListener(propertyChangeListener22);
        java.awt.event.FocusEvent.Cause cause24 = null;
        managementDashboard21.requestFocus(cause24);
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        managementDashboard21.addInputMethodListener(inputMethodListener26);
        java.awt.Point point28 = managementDashboard21.location();
        java.awt.Component component29 = managementDashboard13.findComponentAt(point28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.awt.image.ImageProducer imageProducer32 = null;
        java.awt.Image image33 = managementDashboard31.createImage(imageProducer32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard35.addPropertyChangeListener(propertyChangeListener36);
        java.awt.event.FocusEvent.Cause cause38 = null;
        managementDashboard35.requestFocus(cause38);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener40);
        int int42 = managementDashboard13.checkImage(image33, (java.awt.image.ImageObserver) managementDashboard35);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        managementDashboard44.addPropertyChangeListener(propertyChangeListener45);
        java.util.Locale locale47 = managementDashboard44.getLocale();
        float float48 = managementDashboard44.getAlignmentY();
        java.awt.Component component49 = managementDashboard35.add((java.awt.Component) managementDashboard44);
        boolean boolean50 = managementDashboard1.gotFocus(event11, (java.lang.Object) component49);
        java.awt.Color color51 = managementDashboard1.getForeground();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.5f + "'", float48 == 0.5f);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(color51);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.awt.Dimension dimension38 = managementDashboard32.getMinimumSize();
        boolean boolean39 = managementDashboard32.hasFocus();
        managementDashboard32.repaint((long) 52, 16, 35, 2, 7);
        java.awt.dnd.DropTarget dropTarget46 = managementDashboard32.getDropTarget();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(dropTarget46);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        managementDashboard1.move((int) (short) 100, 9);
        managementDashboard1.doLayout();
        java.lang.String str11 = managementDashboard1.toString();
        java.awt.Container container12 = managementDashboard1.getParent();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ManagementDashboard[,100,9,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str11, "ManagementDashboard[,100,9,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNull(container12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isFocusable();
        java.awt.event.ComponentListener componentListener11 = null;
        managementDashboard1.addComponentListener(componentListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        java.awt.Component component30 = managementDashboard14.findComponentAt(point29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.image.ImageProducer imageProducer33 = null;
        java.awt.Image image34 = managementDashboard32.createImage(imageProducer33);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        int int43 = managementDashboard14.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isVisible();
        java.awt.Image image49 = managementDashboard45.createImage(13, (-1));
        managementDashboard45.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener52 = null;
        managementDashboard45.removeMouseMotionListener(mouseMotionListener52);
        managementDashboard45.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray57 = managementDashboard45.getComponents();
        java.awt.Point point58 = managementDashboard45.location();
        managementDashboard45.setFocusTraversalPolicyProvider(false);
        int int61 = managementDashboard1.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard45);
        java.awt.Graphics graphics62 = null;
        managementDashboard1.print(graphics62);
        java.awt.Font font64 = managementDashboard1.getFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertNotNull(image34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(componentArray57);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(font64);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean7 = managementDashboard1.requestDefaultFocus();
        managementDashboard1.updateUI();
        java.awt.Shape shape9 = null;
        managementDashboard1.setMixingCutoutShape(shape9);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printWriter11, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.Color color6 = managementDashboard1.getBackground();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        managementDashboard1.setAlignmentX((float) (-1L));
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        int int12 = managementDashboard11.countComponents();
        managementDashboard11.resetKeyboardActions();
        managementDashboard11.layout();
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.awt.Point point16 = managementDashboard11.getPopupLocation(mouseEvent15);
        boolean boolean17 = managementDashboard11.isPreferredSizeSet();
        managementDashboard11.revalidate();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard11);
        int int20 = managementDashboard11.getWidth();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Container container31 = managementDashboard1.getParent();
        managementDashboard1.invalidate();
        managementDashboard1.enable();
        boolean boolean34 = managementDashboard1.isValid();
        managementDashboard1.resetKeyboardActions();
        java.awt.event.HierarchyListener[] hierarchyListenerArray36 = managementDashboard1.getHierarchyListeners();
        javax.accessibility.AccessibleContext accessibleContext37 = managementDashboard1.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(container31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray36);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray36, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertNotNull(accessibleContext37);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.awt.Image image6 = managementDashboard1.createImage((int) (byte) 1, (int) (short) -1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        java.awt.GraphicsConfiguration graphicsConfiguration8 = managementDashboard1.getGraphicsConfiguration();
        java.awt.event.KeyListener keyListener9 = null;
        managementDashboard1.addKeyListener(keyListener9);
        managementDashboard1.firePropertyChange("", (double) (short) 0, (double) 97);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertNull(graphicsConfiguration8);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.event.KeyListener keyListener4 = null;
        managementDashboard1.removeKeyListener(keyListener4);
        java.awt.Graphics graphics6 = null;
        managementDashboard1.paint(graphics6);
        javax.swing.JPopupMenu jPopupMenu8 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu8);
        java.awt.Dimension dimension10 = managementDashboard1.getPreferredSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(dimension10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener6);
        managementDashboard1.setInheritsPopupMenu(false);
        managementDashboard1.firePropertyChange("", (byte) -1, (byte) 0);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Image image19 = managementDashboard15.createImage(13, (-1));
        managementDashboard15.resize(0, (int) '4');
        managementDashboard15.repaint((long) 32);
        java.awt.Event event25 = null;
        boolean boolean27 = managementDashboard15.keyDown(event25, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        boolean boolean30 = managementDashboard29.isVisible();
        java.awt.Dimension dimension31 = managementDashboard29.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        managementDashboard33.addPropertyChangeListener(propertyChangeListener34);
        java.awt.event.FocusEvent.Cause cause36 = null;
        managementDashboard33.requestFocus(cause36);
        java.awt.event.InputMethodListener inputMethodListener38 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener38);
        java.awt.Point point40 = managementDashboard33.location();
        managementDashboard29.setLocation(point40);
        java.awt.Point point42 = managementDashboard15.getLocation(point40);
        java.awt.Point point43 = managementDashboard1.getLocation(point40);
        boolean boolean46 = managementDashboard1.contains(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNotNull(point40);
        org.junit.Assert.assertNotNull(point42);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Graphics graphics31 = null;
        managementDashboard1.printAll(graphics31);
        boolean boolean33 = managementDashboard1.requestDefaultFocus();
        javax.swing.TransferHandler transferHandler34 = managementDashboard1.getTransferHandler();
        java.awt.Insets insets35 = managementDashboard1.insets();
        managementDashboard1.requestFocus();
        boolean boolean37 = managementDashboard1.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertNotNull(insets35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.resize(0, (int) '4');
        managementDashboard1.repaint((long) 32);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard1.keyDown(event11, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Dimension dimension17 = managementDashboard15.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard19.addPropertyChangeListener(propertyChangeListener20);
        java.awt.event.FocusEvent.Cause cause22 = null;
        managementDashboard19.requestFocus(cause22);
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        managementDashboard19.addInputMethodListener(inputMethodListener24);
        java.awt.Point point26 = managementDashboard19.location();
        managementDashboard15.setLocation(point26);
        java.awt.Point point28 = managementDashboard1.getLocation(point26);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        boolean boolean31 = managementDashboard30.isVisible();
        java.awt.Image image34 = managementDashboard30.createImage(13, (-1));
        managementDashboard30.resize(0, (int) '4');
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener46 = null;
        managementDashboard39.removeMouseMotionListener(mouseMotionListener46);
        managementDashboard39.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray51 = managementDashboard39.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.awt.event.ActionListener actionListener54 = null;
        javax.swing.KeyStroke keyStroke56 = null;
        managementDashboard53.registerKeyboardAction(actionListener54, "hi!", keyStroke56, (int) (short) 0);
        java.awt.Font font59 = managementDashboard53.getFont();
        managementDashboard39.setFont(font59);
        managementDashboard30.setFont(font59);
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        boolean boolean64 = managementDashboard63.isVisible();
        java.awt.Image image67 = managementDashboard63.createImage(13, (-1));
        managementDashboard63.remove((int) (short) 1);
        java.awt.Dimension dimension70 = managementDashboard63.minimumSize();
        java.awt.Dimension dimension71 = managementDashboard63.getPreferredSize();
        java.awt.Dimension dimension72 = managementDashboard30.getSize(dimension71);
        managementDashboard1.setPreferredSize(dimension72);
        managementDashboard1.setEnabled(false);
        java.awt.Graphics graphics76 = null;
        managementDashboard1.paintAll(graphics76);
        managementDashboard1.setVerifyInputWhenFocusTarget(false);
        java.awt.event.InputMethodListener inputMethodListener80 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(componentArray51);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(image67);
        org.junit.Assert.assertNotNull(dimension70);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertNotNull(dimension72);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        java.awt.event.MouseListener[] mouseListenerArray9 = managementDashboard1.getMouseListeners();
        int int10 = managementDashboard1.getY();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(mouseListenerArray9);
        org.junit.Assert.assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = managementDashboard1.getBaselineResizeBehavior();
        managementDashboard1.setVisible(false);
        java.awt.MenuComponent menuComponent10 = null;
        managementDashboard1.remove(menuComponent10);
        java.awt.event.KeyListener keyListener12 = null;
        managementDashboard1.addKeyListener(keyListener12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard1.removePropertyChangeListener("ToolTipText", propertyChangeListener11);
        managementDashboard1.updateUI();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.list();
        managementDashboard32.setAlignmentY(0.0f);
        java.awt.event.MouseListener mouseListener48 = null;
        managementDashboard32.addMouseListener(mouseListener48);
        managementDashboard32.grabFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        boolean boolean86 = managementDashboard72.isFontSet();
        managementDashboard72.firePropertyChange("data/parkingSpaceData.csv", '#', ' ');
        java.awt.event.ComponentListener componentListener91 = null;
        managementDashboard72.removeComponentListener(componentListener91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.awt.Point point6 = managementDashboard1.getPopupLocation(mouseEvent5);
        boolean boolean7 = managementDashboard1.isPreferredSizeSet();
        managementDashboard1.show();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener6);
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        int int10 = managementDashboard1.getY();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.LayoutManager layoutManager14 = managementDashboard12.getLayout();
        managementDashboard12.removeAll();
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard12);
        managementDashboard12.enable();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        javax.swing.border.Border border15 = null;
        managementDashboard1.setBorder(border15);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        boolean boolean19 = managementDashboard18.isVisible();
        java.awt.Image image22 = managementDashboard18.createImage(13, (-1));
        managementDashboard18.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener25 = null;
        managementDashboard18.removeMouseMotionListener(mouseMotionListener25);
        managementDashboard18.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray30 = managementDashboard18.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.event.ActionListener actionListener33 = null;
        javax.swing.KeyStroke keyStroke35 = null;
        managementDashboard32.registerKeyboardAction(actionListener33, "hi!", keyStroke35, (int) (short) 0);
        java.awt.Font font38 = managementDashboard32.getFont();
        managementDashboard18.setFont(font38);
        managementDashboard1.setFont(font38);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(componentArray30);
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = managementDashboard1.hasFocus();
        java.awt.event.MouseListener mouseListener7 = null;
        managementDashboard1.addMouseListener(mouseListener7);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        java.awt.image.ImageProducer imageProducer12 = null;
        java.awt.Image image13 = managementDashboard11.createImage(imageProducer12);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard15.addPropertyChangeListener(propertyChangeListener16);
        java.awt.event.FocusEvent.Cause cause18 = null;
        managementDashboard15.requestFocus(cause18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        managementDashboard15.addInputMethodListener(inputMethodListener20);
        java.awt.Point point22 = managementDashboard15.location();
        java.awt.Component component23 = managementDashboard11.add((java.awt.Component) managementDashboard15);
        javax.swing.JPopupMenu jPopupMenu24 = managementDashboard11.getComponentPopupMenu();
        javax.swing.border.Border border25 = null;
        managementDashboard11.setBorder(border25);
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard28.addPropertyChangeListener(propertyChangeListener29);
        java.awt.event.FocusEvent.Cause cause31 = null;
        managementDashboard28.requestFocus(cause31);
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        managementDashboard28.addInputMethodListener(inputMethodListener33);
        java.awt.Color color35 = managementDashboard28.getBackground();
        managementDashboard11.setForeground(color35);
        java.awt.Container container37 = managementDashboard11.getParent();
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Dimension dimension41 = managementDashboard39.getMinimumSize();
        java.awt.image.ColorModel colorModel42 = managementDashboard39.getColorModel();
        int int45 = managementDashboard39.getBaseline(4, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        boolean boolean48 = managementDashboard47.isVisible();
        java.awt.Image image51 = managementDashboard47.createImage(13, (-1));
        managementDashboard47.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener54 = null;
        managementDashboard47.removeMouseMotionListener(mouseMotionListener54);
        managementDashboard47.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray59 = managementDashboard47.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.awt.event.ActionListener actionListener62 = null;
        javax.swing.KeyStroke keyStroke64 = null;
        managementDashboard61.registerKeyboardAction(actionListener62, "hi!", keyStroke64, (int) (short) 0);
        java.awt.Font font67 = managementDashboard61.getFont();
        managementDashboard47.setFont(font67);
        managementDashboard39.setFont(font67);
        java.awt.FontMetrics fontMetrics70 = managementDashboard11.getFontMetrics(font67);
        java.lang.Object obj71 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(image13);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNull(jPopupMenu24);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNull(container37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertNotNull(colorModel42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(image51);
        org.junit.Assert.assertNotNull(componentArray59);
        org.junit.Assert.assertNotNull(font67);
        org.junit.Assert.assertNotNull(fontMetrics70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.paintImmediately((int) (byte) 0, (int) (byte) 10, (int) (short) 100, 0);
        managementDashboard1.disable();
        java.awt.MenuComponent menuComponent15 = null;
        managementDashboard1.remove(menuComponent15);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        boolean boolean19 = managementDashboard18.isVisible();
        java.awt.Image image22 = managementDashboard18.createImage(13, (-1));
        managementDashboard18.show(true);
        java.awt.Dimension dimension25 = managementDashboard18.size();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        managementDashboard27.addPropertyChangeListener(propertyChangeListener28);
        java.util.Locale locale30 = managementDashboard27.getLocale();
        float float31 = managementDashboard27.getAlignmentY();
        java.awt.image.VolatileImage volatileImage34 = managementDashboard27.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj35 = managementDashboard27.getTreeLock();
        managementDashboard27.setFocusTraversalKeysEnabled(false);
        managementDashboard27.doLayout();
        java.awt.Graphics graphics39 = null;
        managementDashboard27.printAll(graphics39);
        java.awt.Color color41 = managementDashboard27.getForeground();
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.awt.event.ActionListener actionListener44 = null;
        javax.swing.KeyStroke keyStroke46 = null;
        managementDashboard43.registerKeyboardAction(actionListener44, "hi!", keyStroke46, (int) (short) 0);
        java.awt.Font font49 = managementDashboard43.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        boolean boolean52 = managementDashboard51.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer53 = null;
        ManagementDashboard managementDashboard54 = new ManagementDashboard(strConsumer53);
        boolean boolean55 = managementDashboard54.isVisible();
        java.awt.Image image58 = managementDashboard54.createImage(13, (-1));
        managementDashboard54.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        managementDashboard62.addPropertyChangeListener(propertyChangeListener63);
        java.awt.event.FocusEvent.Cause cause65 = null;
        managementDashboard62.requestFocus(cause65);
        java.awt.event.InputMethodListener inputMethodListener67 = null;
        managementDashboard62.addInputMethodListener(inputMethodListener67);
        java.awt.Point point69 = managementDashboard62.location();
        java.awt.Component component70 = managementDashboard54.findComponentAt(point69);
        java.awt.Component component71 = managementDashboard51.getComponentAt(point69);
        managementDashboard51.grabFocus();
        java.awt.Rectangle rectangle73 = managementDashboard51.bounds();
        java.awt.Rectangle rectangle74 = managementDashboard43.getBounds(rectangle73);
        java.awt.Rectangle rectangle75 = managementDashboard27.getBounds(rectangle74);
        java.awt.Point point76 = managementDashboard27.getLocation();
        managementDashboard1.putClientProperty((java.lang.Object) dimension25, (java.lang.Object) managementDashboard27);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertNull(volatileImage34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(image58);
        org.junit.Assert.assertNotNull(point69);
        org.junit.Assert.assertNull(component70);
        org.junit.Assert.assertNull(component71);
        org.junit.Assert.assertNotNull(rectangle73);
        org.junit.Assert.assertNotNull(rectangle74);
        org.junit.Assert.assertNotNull(rectangle75);
        org.junit.Assert.assertNotNull(point76);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        managementDashboard1.move((-1), (int) '#');
        int int14 = managementDashboard1.getBaseline((int) 'a', 128);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        boolean boolean17 = managementDashboard16.isVisible();
        java.awt.Image image20 = managementDashboard16.createImage(13, (-1));
        managementDashboard16.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        managementDashboard24.addPropertyChangeListener(propertyChangeListener25);
        java.awt.event.FocusEvent.Cause cause27 = null;
        managementDashboard24.requestFocus(cause27);
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        managementDashboard24.addInputMethodListener(inputMethodListener29);
        java.awt.Point point31 = managementDashboard24.location();
        java.awt.Component component32 = managementDashboard16.findComponentAt(point31);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = managementDashboard34.createImage(imageProducer35);
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        managementDashboard38.addPropertyChangeListener(propertyChangeListener39);
        java.awt.event.FocusEvent.Cause cause41 = null;
        managementDashboard38.requestFocus(cause41);
        java.awt.event.InputMethodListener inputMethodListener43 = null;
        managementDashboard38.addInputMethodListener(inputMethodListener43);
        int int45 = managementDashboard16.checkImage(image36, (java.awt.image.ImageObserver) managementDashboard38);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.util.Locale locale50 = managementDashboard47.getLocale();
        float float51 = managementDashboard47.getAlignmentY();
        java.awt.image.VolatileImage volatileImage54 = managementDashboard47.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj55 = managementDashboard47.getTreeLock();
        java.awt.FocusTraversalPolicy focusTraversalPolicy56 = managementDashboard47.getFocusTraversalPolicy();
        java.awt.Event event57 = null;
        boolean boolean59 = managementDashboard47.keyUp(event57, 0);
        int int60 = managementDashboard1.checkImage(image36, (java.awt.image.ImageObserver) managementDashboard47);
        managementDashboard1.addNotify();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray62 = managementDashboard1.getVetoableChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertNull(component32);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.5f + "'", float51 == 0.5f);
        org.junit.Assert.assertNull(volatileImage54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(focusTraversalPolicy56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray62);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray62, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        ParkingSpace parkingSpace4 = new ParkingSpace(8, "123456789", "", "123456789");
        java.lang.String str5 = parkingSpace4.getCurrentCar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "123456789" + "'", str5, "123456789");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        int int3 = managementDashboard1.getY();
        managementDashboard1.revalidate();
        java.util.function.Consumer<java.lang.String> strConsumer5 = null;
        ManagementDashboard managementDashboard6 = new ManagementDashboard(strConsumer5);
        boolean boolean7 = managementDashboard6.isVisible();
        java.awt.Image image10 = managementDashboard6.createImage(13, (-1));
        managementDashboard6.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        managementDashboard14.addPropertyChangeListener(propertyChangeListener15);
        java.awt.event.FocusEvent.Cause cause17 = null;
        managementDashboard14.requestFocus(cause17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        managementDashboard14.addInputMethodListener(inputMethodListener19);
        java.awt.Point point21 = managementDashboard14.location();
        java.awt.Component component22 = managementDashboard6.findComponentAt(point21);
        boolean boolean23 = managementDashboard6.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        managementDashboard6.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener25);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard6.keyDown(event27, (int) (byte) 0);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard31.addPropertyChangeListener(propertyChangeListener32);
        java.awt.event.FocusEvent.Cause cause34 = null;
        managementDashboard31.requestFocus(cause34);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard31.addInputMethodListener(inputMethodListener36);
        java.awt.Point point38 = managementDashboard31.location();
        javax.swing.plaf.PanelUI panelUI39 = managementDashboard31.getUI();
        javax.swing.InputVerifier inputVerifier40 = managementDashboard31.getInputVerifier();
        javax.swing.InputVerifier inputVerifier41 = managementDashboard31.getInputVerifier();
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        boolean boolean44 = managementDashboard43.isVisible();
        java.awt.Image image47 = managementDashboard43.createImage(13, (-1));
        managementDashboard43.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        managementDashboard51.addPropertyChangeListener(propertyChangeListener52);
        java.awt.event.FocusEvent.Cause cause54 = null;
        managementDashboard51.requestFocus(cause54);
        java.awt.event.InputMethodListener inputMethodListener56 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener56);
        java.awt.Point point58 = managementDashboard51.location();
        java.awt.Component component59 = managementDashboard43.findComponentAt(point58);
        boolean boolean60 = managementDashboard43.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard43.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener62);
        java.util.function.Consumer<java.lang.String> strConsumer64 = null;
        ManagementDashboard managementDashboard65 = new ManagementDashboard(strConsumer64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        managementDashboard65.addPropertyChangeListener(propertyChangeListener66);
        java.awt.event.FocusEvent.Cause cause68 = null;
        managementDashboard65.requestFocus(cause68);
        java.awt.event.InputMethodListener inputMethodListener70 = null;
        managementDashboard65.addInputMethodListener(inputMethodListener70);
        java.awt.Point point72 = managementDashboard65.location();
        java.awt.Point point73 = managementDashboard43.getLocation(point72);
        boolean boolean74 = managementDashboard31.contains(point73);
        java.awt.Point point75 = managementDashboard6.getLocation(point73);
        java.awt.Component component76 = managementDashboard1.findComponentAt(point75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = component76.isMinimumSizeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(point21);
        org.junit.Assert.assertNull(component22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertNotNull(panelUI39);
        org.junit.Assert.assertNull(inputVerifier40);
        org.junit.Assert.assertNull(inputVerifier41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(image47);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertNull(component59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(point72);
        org.junit.Assert.assertNotNull(point73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(point75);
        org.junit.Assert.assertNull(component76);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.event.ComponentListener componentListener6 = null;
        managementDashboard1.removeComponentListener(componentListener6);
        java.awt.Graphics graphics8 = null;
        managementDashboard1.printAll(graphics8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        boolean boolean13 = managementDashboard1.isEnabled();
        java.awt.Insets insets14 = managementDashboard1.insets();
        java.awt.event.MouseMotionListener mouseMotionListener15 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener15);
        boolean boolean17 = managementDashboard1.isBackgroundSet();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(insets14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.addNotify();
        boolean boolean9 = managementDashboard1.isDoubleBuffered();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isVisible();
        java.awt.Image image15 = managementDashboard11.createImage(13, (-1));
        managementDashboard11.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard19.addPropertyChangeListener(propertyChangeListener20);
        java.awt.event.FocusEvent.Cause cause22 = null;
        managementDashboard19.requestFocus(cause22);
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        managementDashboard19.addInputMethodListener(inputMethodListener24);
        java.awt.Point point26 = managementDashboard19.location();
        java.awt.Component component27 = managementDashboard11.findComponentAt(point26);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = managementDashboard29.createImage(imageProducer30);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        managementDashboard33.addPropertyChangeListener(propertyChangeListener34);
        java.awt.event.FocusEvent.Cause cause36 = null;
        managementDashboard33.requestFocus(cause36);
        java.awt.event.InputMethodListener inputMethodListener38 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener38);
        int int40 = managementDashboard11.checkImage(image31, (java.awt.image.ImageObserver) managementDashboard33);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        managementDashboard42.addPropertyChangeListener(propertyChangeListener43);
        java.util.Locale locale45 = managementDashboard42.getLocale();
        float float46 = managementDashboard42.getAlignmentY();
        java.awt.Component component47 = managementDashboard33.add((java.awt.Component) managementDashboard42);
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        managementDashboard49.addPropertyChangeListener(propertyChangeListener50);
        java.util.Locale locale52 = managementDashboard49.getLocale();
        managementDashboard42.setLocale(locale52);
        managementDashboard42.addNotify();
        managementDashboard42.setVisible(true);
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        boolean boolean59 = managementDashboard58.isVisible();
        java.awt.Dimension dimension60 = managementDashboard58.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        managementDashboard62.addPropertyChangeListener(propertyChangeListener63);
        java.awt.event.FocusEvent.Cause cause65 = null;
        managementDashboard62.requestFocus(cause65);
        java.awt.event.InputMethodListener inputMethodListener67 = null;
        managementDashboard62.addInputMethodListener(inputMethodListener67);
        java.awt.Point point69 = managementDashboard62.location();
        managementDashboard58.setLocation(point69);
        managementDashboard42.setLocation(point69);
        java.awt.event.HierarchyListener hierarchyListener72 = null;
        managementDashboard42.removeHierarchyListener(hierarchyListener72);
        java.util.function.Consumer<java.lang.String> strConsumer74 = null;
        ManagementDashboard managementDashboard75 = new ManagementDashboard(strConsumer74);
        boolean boolean76 = managementDashboard75.isVisible();
        java.awt.Image image79 = managementDashboard75.createImage(13, (-1));
        managementDashboard75.remove((int) (short) 1);
        java.awt.Dimension dimension82 = managementDashboard75.minimumSize();
        java.awt.Dimension dimension83 = managementDashboard75.getPreferredSize();
        float float84 = managementDashboard75.getAlignmentX();
        java.awt.Insets insets85 = managementDashboard75.insets();
        java.awt.Insets insets86 = managementDashboard42.getInsets(insets85);
        java.awt.Insets insets87 = managementDashboard1.getInsets(insets86);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNull(component27);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.5f + "'", float46 == 0.5f);
        org.junit.Assert.assertNotNull(component47);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertNotNull(point69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(image79);
        org.junit.Assert.assertNotNull(dimension82);
        org.junit.Assert.assertNotNull(dimension83);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.5f + "'", float84 == 0.5f);
        org.junit.Assert.assertNotNull(insets85);
        org.junit.Assert.assertNotNull(insets86);
        org.junit.Assert.assertNotNull(insets87);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        managementDashboard1.firePropertyChange("", (float) 10L, (float) 32);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray35 = managementDashboard1.getMouseWheelListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray35);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray35, new java.awt.event.MouseWheelListener[] {});
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener8);
        managementDashboard1.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray13 = managementDashboard1.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Image image19 = managementDashboard15.createImage(13, (-1));
        managementDashboard15.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Component component31 = managementDashboard15.findComponentAt(point30);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        java.awt.image.ImageProducer imageProducer34 = null;
        java.awt.Image image35 = managementDashboard33.createImage(imageProducer34);
        java.util.function.Consumer<java.lang.String> strConsumer36 = null;
        ManagementDashboard managementDashboard37 = new ManagementDashboard(strConsumer36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        managementDashboard37.addPropertyChangeListener(propertyChangeListener38);
        java.awt.event.FocusEvent.Cause cause40 = null;
        managementDashboard37.requestFocus(cause40);
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        managementDashboard37.addInputMethodListener(inputMethodListener42);
        int int44 = managementDashboard15.checkImage(image35, (java.awt.image.ImageObserver) managementDashboard37);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        managementDashboard46.addPropertyChangeListener(propertyChangeListener47);
        java.util.Locale locale49 = managementDashboard46.getLocale();
        float float50 = managementDashboard46.getAlignmentY();
        java.awt.Component component51 = managementDashboard37.add((java.awt.Component) managementDashboard46);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        managementDashboard53.addPropertyChangeListener(propertyChangeListener54);
        java.util.Locale locale56 = managementDashboard53.getLocale();
        managementDashboard46.setLocale(locale56);
        managementDashboard46.addNotify();
        managementDashboard46.setVisible(true);
        java.awt.Container container61 = managementDashboard46.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        boolean boolean64 = managementDashboard63.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        boolean boolean67 = managementDashboard66.isVisible();
        java.awt.Image image70 = managementDashboard66.createImage(13, (-1));
        managementDashboard66.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer73 = null;
        ManagementDashboard managementDashboard74 = new ManagementDashboard(strConsumer73);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        managementDashboard74.addPropertyChangeListener(propertyChangeListener75);
        java.awt.event.FocusEvent.Cause cause77 = null;
        managementDashboard74.requestFocus(cause77);
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        managementDashboard74.addInputMethodListener(inputMethodListener79);
        java.awt.Point point81 = managementDashboard74.location();
        java.awt.Component component82 = managementDashboard66.findComponentAt(point81);
        java.awt.Component component83 = managementDashboard63.getComponentAt(point81);
        java.awt.Point point84 = managementDashboard46.getLocation(point81);
        boolean boolean85 = managementDashboard46.isFocusCycleRoot();
        boolean boolean86 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard46);
        java.awt.event.KeyListener keyListener87 = null;
        managementDashboard1.addKeyListener(keyListener87);
        java.awt.event.FocusEvent.Cause cause89 = null;
        boolean boolean90 = managementDashboard1.requestFocusInWindow(cause89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(componentArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNull(component31);
        org.junit.Assert.assertNotNull(image35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.5f + "'", float50 == 0.5f);
        org.junit.Assert.assertNotNull(component51);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_CA");
        org.junit.Assert.assertNull(container61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(image70);
        org.junit.Assert.assertNotNull(point81);
        org.junit.Assert.assertNull(component82);
        org.junit.Assert.assertNull(component83);
        org.junit.Assert.assertNotNull(point84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        boolean boolean22 = managementDashboard1.isOpaque();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        int int10 = managementDashboard1.getWidth();
        boolean boolean11 = managementDashboard1.isFocusable();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = managementDashboard1.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        javax.swing.JToolTip jToolTip20 = managementDashboard1.createToolTip();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jToolTip20.list(printWriter21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(jToolTip20);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.setFocusTraversalKeysEnabled(false);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        managementDashboard13.addPropertyChangeListener(propertyChangeListener14);
        java.awt.event.FocusEvent.Cause cause16 = null;
        managementDashboard13.requestFocus(cause16);
        java.awt.Color color18 = managementDashboard13.getBackground();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = managementDashboard13.getHierarchyBoundsListeners();
        boolean boolean20 = managementDashboard13.getIgnoreRepaint();
        java.awt.ComponentOrientation componentOrientation21 = managementDashboard13.getComponentOrientation();
        managementDashboard1.applyComponentOrientation(componentOrientation21);
        java.awt.Graphics graphics23 = null;
        managementDashboard1.print(graphics23);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray19, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(componentOrientation21);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        managementDashboard1.resetKeyboardActions();
        managementDashboard1.layout();
        java.awt.event.MouseEvent mouseEvent5 = null;
        java.awt.Point point6 = managementDashboard1.getPopupLocation(mouseEvent5);
        boolean boolean7 = managementDashboard1.isPreferredSizeSet();
        boolean boolean9 = managementDashboard1.areFocusTraversalKeysSet(1);
        boolean boolean10 = managementDashboard1.isFocusTraversalPolicyProvider();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener11);
        javax.swing.JPopupMenu jPopupMenu13 = managementDashboard1.getComponentPopupMenu();
        java.awt.Event event14 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.deliverEvent(event14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jPopupMenu13);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.Color color6 = managementDashboard1.getBackground();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray7 = managementDashboard1.getHierarchyBoundsListeners();
        managementDashboard1.setAlignmentX((float) (-1L));
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        int int12 = managementDashboard11.countComponents();
        managementDashboard11.resetKeyboardActions();
        managementDashboard11.layout();
        java.awt.event.MouseEvent mouseEvent15 = null;
        java.awt.Point point16 = managementDashboard11.getPopupLocation(mouseEvent15);
        boolean boolean17 = managementDashboard11.isPreferredSizeSet();
        managementDashboard11.revalidate();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard11);
        boolean boolean20 = managementDashboard11.isMinimumSizeSet();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray7);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray7, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.resize(0, (int) '4');
        managementDashboard1.repaint((long) 32);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard1.keyDown(event11, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isVisible();
        java.awt.Dimension dimension17 = managementDashboard15.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard19.addPropertyChangeListener(propertyChangeListener20);
        java.awt.event.FocusEvent.Cause cause22 = null;
        managementDashboard19.requestFocus(cause22);
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        managementDashboard19.addInputMethodListener(inputMethodListener24);
        java.awt.Point point26 = managementDashboard19.location();
        managementDashboard15.setLocation(point26);
        java.awt.Point point28 = managementDashboard1.getLocation(point26);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        boolean boolean31 = managementDashboard30.isVisible();
        java.awt.Image image34 = managementDashboard30.createImage(13, (-1));
        managementDashboard30.resize(0, (int) '4');
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener46 = null;
        managementDashboard39.removeMouseMotionListener(mouseMotionListener46);
        managementDashboard39.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray51 = managementDashboard39.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.awt.event.ActionListener actionListener54 = null;
        javax.swing.KeyStroke keyStroke56 = null;
        managementDashboard53.registerKeyboardAction(actionListener54, "hi!", keyStroke56, (int) (short) 0);
        java.awt.Font font59 = managementDashboard53.getFont();
        managementDashboard39.setFont(font59);
        managementDashboard30.setFont(font59);
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        boolean boolean64 = managementDashboard63.isVisible();
        java.awt.Image image67 = managementDashboard63.createImage(13, (-1));
        managementDashboard63.remove((int) (short) 1);
        java.awt.Dimension dimension70 = managementDashboard63.minimumSize();
        java.awt.Dimension dimension71 = managementDashboard63.getPreferredSize();
        java.awt.Dimension dimension72 = managementDashboard30.getSize(dimension71);
        managementDashboard1.setPreferredSize(dimension72);
        javax.swing.InputVerifier inputVerifier74 = null;
        managementDashboard1.setInputVerifier(inputVerifier74);
        float float76 = managementDashboard1.getAlignmentY();
        java.util.function.Consumer<java.lang.String> strConsumer77 = null;
        ManagementDashboard managementDashboard78 = new ManagementDashboard(strConsumer77);
        managementDashboard78.setEnabled(true);
        java.awt.Point point81 = managementDashboard78.location();
        java.awt.Point point82 = managementDashboard1.getLocation(point81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(componentArray51);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(image67);
        org.junit.Assert.assertNotNull(dimension70);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertNotNull(dimension72);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNotNull(point81);
        org.junit.Assert.assertNotNull(point82);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        int int2 = managementAccountsView1.getHeight();
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        ManagementDashboard managementDashboard4 = new ManagementDashboard(strConsumer3);
        java.awt.event.ActionListener actionListener5 = null;
        javax.swing.KeyStroke keyStroke7 = null;
        managementDashboard4.registerKeyboardAction(actionListener5, "hi!", keyStroke7, (int) (short) 0);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = managementDashboard4.getHierarchyBoundsListeners();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.Dimension dimension14 = managementDashboard12.getMinimumSize();
        java.awt.image.ColorModel colorModel15 = managementDashboard12.getColorModel();
        int int18 = managementDashboard12.getBaseline(4, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        boolean boolean21 = managementDashboard20.isVisible();
        java.awt.Image image24 = managementDashboard20.createImage(13, (-1));
        managementDashboard20.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener27 = null;
        managementDashboard20.removeMouseMotionListener(mouseMotionListener27);
        managementDashboard20.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray32 = managementDashboard20.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.awt.event.ActionListener actionListener35 = null;
        javax.swing.KeyStroke keyStroke37 = null;
        managementDashboard34.registerKeyboardAction(actionListener35, "hi!", keyStroke37, (int) (short) 0);
        java.awt.Font font40 = managementDashboard34.getFont();
        managementDashboard20.setFont(font40);
        managementDashboard12.setFont(font40);
        managementDashboard4.setFont(font40);
        managementAccountsView1.setFont(font40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray10, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNotNull(colorModel15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNotNull(componentArray32);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = managementDashboard1.getFocusTraversalPolicy();
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard1.keyUp(event11, 0);
        managementDashboard1.transferFocusDownCycle();
        java.awt.Graphics graphics15 = null;
        managementDashboard1.paintAll(graphics15);
        boolean boolean17 = managementDashboard1.isVisible();
        java.awt.Point point18 = null;
        java.awt.Point point19 = managementDashboard1.getLocation(point18);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(focusTraversalPolicy10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = managementDashboard1.getBaselineResizeBehavior();
        managementDashboard1.setVisible(false);
        java.awt.MenuComponent menuComponent10 = null;
        managementDashboard1.remove(menuComponent10);
        managementDashboard1.revalidate();
        javax.swing.event.AncestorListener ancestorListener13 = null;
        managementDashboard1.removeAncestorListener(ancestorListener13);
        java.awt.event.MouseWheelListener mouseWheelListener15 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = managementDashboard1.getBaselineResizeBehavior();
        managementDashboard1.setVisible(false);
        java.awt.MenuComponent menuComponent10 = null;
        managementDashboard1.remove(menuComponent10);
        java.awt.event.KeyListener keyListener12 = null;
        managementDashboard1.addKeyListener(keyListener12);
        javax.swing.plaf.PanelUI panelUI14 = managementDashboard1.getUI();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(panelUI14);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener6);
        managementDashboard1.addNotify();
        managementDashboard1.repaint((long) (byte) 10);
        managementDashboard1.enable();
        javax.swing.TransferHandler transferHandler12 = null;
        managementDashboard1.setTransferHandler(transferHandler12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserBookingsView userBookingsView1 = new UserBookingsView(strConsumer0);
        java.awt.event.FocusEvent.Cause cause2 = null;
        boolean boolean3 = userBookingsView1.requestFocusInWindow(cause2);
        userBookingsView1.invalidate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        java.awt.Container container7 = managementDashboard1.getParent();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.awt.Dimension dimension11 = managementDashboard9.getMinimumSize();
        managementDashboard9.grabFocus();
        javax.accessibility.AccessibleContext accessibleContext13 = managementDashboard9.getAccessibleContext();
        java.awt.Graphics graphics14 = null;
        managementDashboard9.paint(graphics14);
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        boolean boolean19 = managementDashboard18.isVisible();
        java.awt.Image image22 = managementDashboard18.createImage(13, (-1));
        managementDashboard18.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener25 = null;
        managementDashboard18.removeMouseMotionListener(mouseMotionListener25);
        managementDashboard18.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray30 = managementDashboard18.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.event.ActionListener actionListener33 = null;
        javax.swing.KeyStroke keyStroke35 = null;
        managementDashboard32.registerKeyboardAction(actionListener33, "hi!", keyStroke35, (int) (short) 0);
        java.awt.Font font38 = managementDashboard32.getFont();
        managementDashboard18.setFont(font38);
        managementDashboard18.repaint();
        int int41 = managementDashboard18.getY();
        boolean boolean42 = managementDashboard9.isFocusCycleRoot((java.awt.Container) managementDashboard18);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        boolean boolean45 = managementDashboard44.isVisible();
        java.awt.Image image48 = managementDashboard44.createImage(13, (-1));
        managementDashboard44.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        managementDashboard52.addPropertyChangeListener(propertyChangeListener53);
        java.awt.event.FocusEvent.Cause cause55 = null;
        managementDashboard52.requestFocus(cause55);
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        managementDashboard52.addInputMethodListener(inputMethodListener57);
        java.awt.Point point59 = managementDashboard52.location();
        java.awt.Component component60 = managementDashboard44.findComponentAt(point59);
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        java.awt.image.ImageProducer imageProducer63 = null;
        java.awt.Image image64 = managementDashboard62.createImage(imageProducer63);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        managementDashboard66.addPropertyChangeListener(propertyChangeListener67);
        java.awt.event.FocusEvent.Cause cause69 = null;
        managementDashboard66.requestFocus(cause69);
        java.awt.event.InputMethodListener inputMethodListener71 = null;
        managementDashboard66.addInputMethodListener(inputMethodListener71);
        int int73 = managementDashboard44.checkImage(image64, (java.awt.image.ImageObserver) managementDashboard66);
        java.util.function.Consumer<java.lang.String> strConsumer74 = null;
        ManagementDashboard managementDashboard75 = new ManagementDashboard(strConsumer74);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        managementDashboard75.addPropertyChangeListener(propertyChangeListener76);
        java.util.Locale locale78 = managementDashboard75.getLocale();
        float float79 = managementDashboard75.getAlignmentY();
        java.awt.Component component80 = managementDashboard66.add((java.awt.Component) managementDashboard75);
        java.util.function.Consumer<java.lang.String> strConsumer81 = null;
        ManagementDashboard managementDashboard82 = new ManagementDashboard(strConsumer81);
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        managementDashboard82.addPropertyChangeListener(propertyChangeListener83);
        java.util.Locale locale85 = managementDashboard82.getLocale();
        managementDashboard75.setLocale(locale85);
        managementDashboard9.setLocale(locale85);
        int int88 = managementDashboard9.getX();
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNull(container7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(accessibleContext13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(componentArray30);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(image48);
        org.junit.Assert.assertNotNull(point59);
        org.junit.Assert.assertNull(component60);
        org.junit.Assert.assertNotNull(image64);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.5f + "'", float79 == 0.5f);
        org.junit.Assert.assertNotNull(component80);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        managementDashboard1.setName("ToolTipText");
        javax.swing.border.Border border16 = null;
        managementDashboard1.setBorder(border16);
        java.awt.Dimension dimension18 = managementDashboard1.getPreferredSize();
        java.awt.event.MouseEvent mouseEvent19 = null;
        java.lang.String str20 = managementDashboard1.getToolTipText(mouseEvent19);
        java.awt.Insets insets21 = managementDashboard1.getInsets();
        java.awt.event.ActionListener actionListener22 = null;
        javax.swing.KeyStroke keyStroke23 = null;
        managementDashboard1.registerKeyboardAction(actionListener22, keyStroke23, (int) (short) 1);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray26 = managementDashboard1.getMouseMotionListeners();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray26);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray26, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        managementDashboard1.setIgnoreRepaint(true);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.awt.event.ActionListener actionListener24 = null;
        javax.swing.KeyStroke keyStroke26 = null;
        managementDashboard23.registerKeyboardAction(actionListener24, "hi!", keyStroke26, (int) (short) 0);
        java.awt.Font font29 = managementDashboard23.getFont();
        managementDashboard1.setFont(font29);
        int int31 = managementDashboard1.getY();
        java.awt.Rectangle rectangle32 = managementDashboard1.bounds();
        managementDashboard1.repaint(12, 13, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(rectangle32);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.image.ImageProducer imageProducer4 = null;
        java.awt.Image image5 = managementDashboard1.createImage(imageProducer4);
        java.awt.Insets insets6 = managementDashboard1.getInsets();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = managementDashboard1.getPropertyChangeListeners("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isVisible();
        java.awt.Image image14 = managementDashboard10.createImage(13, (-1));
        managementDashboard10.remove((int) (short) 1);
        java.awt.Insets insets17 = managementDashboard10.getInsets();
        java.util.Locale locale18 = managementDashboard10.getLocale();
        java.awt.Graphics graphics19 = null;
        managementDashboard10.printAll(graphics19);
        boolean boolean21 = managementDashboard10.isPreferredSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        boolean boolean24 = managementDashboard23.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        boolean boolean27 = managementDashboard26.isVisible();
        java.awt.Image image30 = managementDashboard26.createImage(13, (-1));
        managementDashboard26.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        managementDashboard34.addPropertyChangeListener(propertyChangeListener35);
        java.awt.event.FocusEvent.Cause cause37 = null;
        managementDashboard34.requestFocus(cause37);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard34.addInputMethodListener(inputMethodListener39);
        java.awt.Point point41 = managementDashboard34.location();
        java.awt.Component component42 = managementDashboard26.findComponentAt(point41);
        java.awt.Component component43 = managementDashboard23.getComponentAt(point41);
        managementDashboard23.grabFocus();
        java.awt.Rectangle rectangle45 = managementDashboard23.bounds();
        managementDashboard10.setBounds(rectangle45);
        java.awt.Rectangle rectangle47 = managementDashboard1.getBounds(rectangle45);
        java.awt.im.InputMethodRequests inputMethodRequests48 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        boolean boolean51 = managementDashboard50.isVisible();
        java.awt.Image image54 = managementDashboard50.createImage(13, (-1));
        managementDashboard50.remove((int) (short) 1);
        java.awt.Dimension dimension57 = managementDashboard50.minimumSize();
        java.awt.Dimension dimension58 = managementDashboard50.getPreferredSize();
        managementDashboard1.setMinimumSize(dimension58);
        float float60 = managementDashboard1.getAlignmentX();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray8, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNotNull(point41);
        org.junit.Assert.assertNull(component42);
        org.junit.Assert.assertNull(component43);
        org.junit.Assert.assertNotNull(rectangle45);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNull(inputMethodRequests48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(image54);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.5f + "'", float60 == 0.5f);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.dnd.DropTarget dropTarget26 = managementDashboard1.getDropTarget();
        int int27 = managementDashboard1.getY();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener28);
        java.awt.Insets insets30 = managementDashboard1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(insets30);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        SuperManager superManager0 = new SuperManager();
        MainSystem.currentManager = superManager0;
        java.lang.String str2 = superManager0.getUsername();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUPERMAN" + "'", str2, "SUPERMAN");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        java.awt.dnd.DropTarget dropTarget26 = managementDashboard1.getDropTarget();
        boolean boolean29 = managementDashboard1.contains(3, (int) (short) 100);
        java.awt.Event event30 = null;
        boolean boolean33 = managementDashboard1.mouseDrag(event30, 2, (int) '#');
        int int34 = managementDashboard1.getComponentCount();
        java.awt.event.KeyListener keyListener35 = null;
        managementDashboard1.removeKeyListener(keyListener35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dropTarget26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        javax.accessibility.AccessibleContext accessibleContext19 = managementDashboard1.getAccessibleContext();
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        boolean boolean22 = managementDashboard21.isVisible();
        java.awt.LayoutManager layoutManager23 = managementDashboard21.getLayout();
        java.awt.Graphics graphics24 = null;
        managementDashboard21.print(graphics24);
        java.lang.String str26 = managementDashboard21.getToolTipText();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        boolean boolean32 = managementDashboard31.isVisible();
        java.awt.Image image35 = managementDashboard31.createImage(13, (-1));
        managementDashboard31.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.awt.event.FocusEvent.Cause cause42 = null;
        managementDashboard39.requestFocus(cause42);
        java.awt.event.InputMethodListener inputMethodListener44 = null;
        managementDashboard39.addInputMethodListener(inputMethodListener44);
        java.awt.Point point46 = managementDashboard39.location();
        java.awt.Component component47 = managementDashboard31.findComponentAt(point46);
        java.awt.Component component48 = managementDashboard28.getComponentAt(point46);
        managementDashboard28.grabFocus();
        java.awt.Rectangle rectangle50 = managementDashboard28.bounds();
        managementDashboard21.repaint(rectangle50);
        managementDashboard1.paintImmediately(rectangle50);
        javax.swing.KeyStroke keyStroke53 = null;
        int int54 = managementDashboard1.getConditionForKeyStroke(keyStroke53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(accessibleContext19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNotNull(point46);
        org.junit.Assert.assertNull(component47);
        org.junit.Assert.assertNull(component48);
        org.junit.Assert.assertNotNull(rectangle50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        ParkingSpace parkingSpace4 = new ParkingSpace(32, "", "PanelUI", "data/lotData.csv");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        managementDashboard1.grabFocus();
        boolean boolean5 = managementDashboard1.isDoubleBuffered();
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray7 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet8 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet8, aWTKeyStrokeArray7);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setFocusTraversalKeys((int) (short) 10, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray7);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray7, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        ParkingLot parkingLot1 = new ParkingLot("data/lotData.csv");
        java.lang.String str2 = parkingLot1.getLotName();
        parkingLot1.removeBooking((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "data/lotData.csv" + "'", str2, "data/lotData.csv");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard1.validate();
        javax.swing.TransferHandler transferHandler13 = null;
        managementDashboard1.setTransferHandler(transferHandler13);
        java.awt.Font font15 = managementDashboard1.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        managementDashboard17.addPropertyChangeListener(propertyChangeListener18);
        java.awt.event.FocusEvent.Cause cause20 = null;
        managementDashboard17.requestFocus(cause20);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard17.addInputMethodListener(inputMethodListener22);
        managementDashboard17.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float29 = managementDashboard17.getAlignmentY();
        java.awt.event.KeyListener keyListener30 = null;
        managementDashboard17.addKeyListener(keyListener30);
        managementDashboard17.list();
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        managementDashboard34.addPropertyChangeListener(propertyChangeListener35);
        java.awt.event.FocusEvent.Cause cause37 = null;
        managementDashboard34.requestFocus(cause37);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard34.addInputMethodListener(inputMethodListener39);
        java.awt.Color color41 = managementDashboard34.getBackground();
        managementDashboard34.setRequestFocusEnabled(true);
        java.awt.Shape shape44 = null;
        managementDashboard34.setMixingCutoutShape(shape44);
        java.awt.im.InputContext inputContext46 = managementDashboard34.getInputContext();
        int int49 = managementDashboard34.getBaseline((int) (byte) 100, (int) (byte) 10);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        managementDashboard51.addPropertyChangeListener(propertyChangeListener52);
        java.awt.event.FocusEvent.Cause cause54 = null;
        managementDashboard51.requestFocus(cause54);
        java.awt.event.InputMethodListener inputMethodListener56 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener56);
        managementDashboard51.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float63 = managementDashboard51.getAlignmentY();
        javax.swing.ActionMap actionMap64 = managementDashboard51.getActionMap();
        managementDashboard34.setActionMap(actionMap64);
        managementDashboard17.setActionMap(actionMap64);
        managementDashboard1.setActionMap(actionMap64);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNull(inputContext46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.5f + "'", float63 == 0.5f);
        org.junit.Assert.assertNotNull(actionMap64);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard1.setBounds(12, 16, (int) (short) -1, 1);
        boolean boolean17 = managementDashboard1.isFocusable();
        managementDashboard1.repaint((long) (short) -1, (int) (byte) 100, 100, 0, (int) (byte) -1);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        boolean boolean26 = managementDashboard25.isVisible();
        java.awt.Image image29 = managementDashboard25.createImage(13, (-1));
        managementDashboard25.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        managementDashboard33.addPropertyChangeListener(propertyChangeListener34);
        java.awt.event.FocusEvent.Cause cause36 = null;
        managementDashboard33.requestFocus(cause36);
        java.awt.event.InputMethodListener inputMethodListener38 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener38);
        java.awt.Point point40 = managementDashboard33.location();
        java.awt.Component component41 = managementDashboard25.findComponentAt(point40);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        int int44 = managementDashboard43.countComponents();
        managementDashboard43.resetKeyboardActions();
        managementDashboard43.layout();
        java.awt.event.MouseEvent mouseEvent47 = null;
        java.awt.Point point48 = managementDashboard43.getPopupLocation(mouseEvent47);
        boolean boolean49 = managementDashboard25.isAncestorOf((java.awt.Component) managementDashboard43);
        managementDashboard25.revalidate();
        managementDashboard1.remove((java.awt.Component) managementDashboard25);
        javax.swing.InputMap inputMap52 = managementDashboard25.getInputMap();
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(image29);
        org.junit.Assert.assertNotNull(point40);
        org.junit.Assert.assertNull(component41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNull(point48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inputMap52);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        java.awt.event.ActionListener actionListener14 = null;
        javax.swing.KeyStroke keyStroke16 = null;
        managementDashboard1.registerKeyboardAction(actionListener14, "data/parkingSpaceData.csv", keyStroke16, 1);
        managementDashboard1.transferFocus();
        javax.swing.TransferHandler transferHandler20 = managementDashboard1.getTransferHandler();
        managementDashboard1.repaint((long) (-1), (int) (byte) 100, 52, 4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(transferHandler20);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        java.awt.Event event49 = null;
        ParkingLot parkingLot51 = new ParkingLot("hi!");
        java.lang.String str52 = parkingLot51.getLotAvailability();
        boolean boolean53 = managementDashboard32.action(event49, (java.lang.Object) parkingLot51);
        int int54 = managementDashboard32.getX();
        java.awt.event.InputMethodListener[] inputMethodListenerArray55 = managementDashboard32.getInputMethodListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(inputMethodListenerArray55);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray55, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.event.KeyListener keyListener4 = null;
        managementDashboard1.removeKeyListener(keyListener4);
        java.awt.Font font6 = managementDashboard1.getFont();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.awt.Dimension dimension45 = managementDashboard32.getMaximumSize();
        boolean boolean46 = managementDashboard32.isFocusTraversalPolicySet();
        managementDashboard32.repaint((long) (byte) 0);
        managementDashboard32.repaint(100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        managementDashboard1.resize(2, 100);
        boolean boolean7 = managementDashboard1.requestDefaultFocus();
        boolean boolean10 = managementDashboard1.inside(2, (int) (short) -1);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.Graphics graphics6 = null;
        managementDashboard1.printComponents(graphics6);
        java.awt.event.MouseListener mouseListener8 = null;
        managementDashboard1.removeMouseListener(mouseListener8);
        managementDashboard1.setAutoscrolls(true);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = managementDashboard1.getInputMethodListeners();
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray12, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        java.awt.event.MouseListener mouseListener22 = null;
        managementDashboard1.addMouseListener(mouseListener22);
        javax.swing.InputMap inputMap25 = managementDashboard1.getInputMap(0);
        boolean boolean26 = managementDashboard1.isFocusTraversalPolicyProvider();
        managementDashboard1.firePropertyChange("PanelUI", 64, 9);
        javax.swing.TransferHandler transferHandler31 = null;
        managementDashboard1.setTransferHandler(transferHandler31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(inputMap25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.Insets insets20 = managementDashboard1.insets();
        managementDashboard1.disable();
        managementDashboard1.firePropertyChange("data/parkingSpaceData.csv", '#', '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(insets20);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener6);
        managementDashboard1.addNotify();
        managementDashboard1.repaint((long) (byte) 10);
        managementDashboard1.list();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = managementDashboard13.createImage(imageProducer14);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        managementDashboard17.addPropertyChangeListener(propertyChangeListener18);
        java.awt.event.FocusEvent.Cause cause20 = null;
        managementDashboard17.requestFocus(cause20);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard17.addInputMethodListener(inputMethodListener22);
        java.awt.Point point24 = managementDashboard17.location();
        java.awt.Component component25 = managementDashboard13.add((java.awt.Component) managementDashboard17);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        component25.removePropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener27);
        java.awt.image.ColorModel colorModel29 = component25.getColorModel();
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = component25.createImage(imageProducer30);
        java.awt.image.ImageObserver imageObserver34 = null;
        int int35 = managementDashboard1.checkImage(image31, 3, 0, imageObserver34);
        int int36 = managementDashboard1.getHeight();
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(point24);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(colorModel29);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        managementDashboard23.show();
        managementDashboard23.show();
        boolean boolean33 = managementDashboard23.getAutoscrolls();
        boolean boolean34 = managementDashboard23.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.setFocusTraversalKeysEnabled(false);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard15.addPropertyChangeListener(propertyChangeListener16);
        java.awt.event.FocusEvent.Cause cause18 = null;
        managementDashboard15.requestFocus(cause18);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        managementDashboard15.addInputMethodListener(inputMethodListener20);
        managementDashboard15.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float27 = managementDashboard15.getAlignmentY();
        managementDashboard15.doLayout();
        javax.swing.InputMap inputMap29 = managementDashboard15.getInputMap();
        managementDashboard1.setInputMap((int) (short) 0, inputMap29);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior31 = managementDashboard1.getBaselineResizeBehavior();
        boolean boolean32 = managementDashboard1.isBackgroundSet();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(inputMap29);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior31 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior31.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        managementDashboard1.move((-1), (int) '#');
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isVisible();
        java.awt.Image image17 = managementDashboard13.createImage(13, (-1));
        managementDashboard13.remove((int) (short) 1);
        java.awt.Dimension dimension20 = managementDashboard13.minimumSize();
        java.awt.Dimension dimension21 = managementDashboard13.getPreferredSize();
        float float22 = managementDashboard13.getAlignmentX();
        java.awt.Graphics graphics23 = null;
        managementDashboard13.paintComponents(graphics23);
        java.awt.Color color25 = managementDashboard13.getBackground();
        managementDashboard1.setBackground(color25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.list();
        managementDashboard32.setAlignmentY(0.0f);
        java.awt.event.MouseListener mouseListener48 = null;
        managementDashboard32.addMouseListener(mouseListener48);
        java.awt.event.ContainerListener[] containerListenerArray50 = managementDashboard32.getContainerListeners();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        managementDashboard52.addPropertyChangeListener(propertyChangeListener53);
        java.awt.event.FocusEvent.Cause cause55 = null;
        managementDashboard52.requestFocus(cause55);
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        managementDashboard52.addInputMethodListener(inputMethodListener57);
        java.awt.Color color59 = managementDashboard52.getBackground();
        managementDashboard32.setForeground(color59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(containerListenerArray50);
        org.junit.Assert.assertArrayEquals(containerListenerArray50, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertNotNull(color59);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        boolean boolean9 = managementDashboard1.isForegroundSet();
        java.awt.Component[] componentArray10 = managementDashboard1.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        managementDashboard12.addPropertyChangeListener(propertyChangeListener13);
        java.awt.event.FocusEvent.Cause cause15 = null;
        managementDashboard12.requestFocus(cause15);
        java.awt.Color color17 = managementDashboard12.getBackground();
        managementDashboard1.setForeground(color17);
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(componentArray10);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isVisible();
        java.awt.Dimension dimension12 = managementDashboard10.getMinimumSize();
        java.awt.image.ColorModel colorModel13 = managementDashboard10.getColorModel();
        int int16 = managementDashboard10.getBaseline(4, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        boolean boolean19 = managementDashboard18.isVisible();
        java.awt.Image image22 = managementDashboard18.createImage(13, (-1));
        managementDashboard18.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener25 = null;
        managementDashboard18.removeMouseMotionListener(mouseMotionListener25);
        managementDashboard18.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray30 = managementDashboard18.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.event.ActionListener actionListener33 = null;
        javax.swing.KeyStroke keyStroke35 = null;
        managementDashboard32.registerKeyboardAction(actionListener33, "hi!", keyStroke35, (int) (short) 0);
        java.awt.Font font38 = managementDashboard32.getFont();
        managementDashboard18.setFont(font38);
        managementDashboard10.setFont(font38);
        java.awt.FontMetrics fontMetrics41 = managementDashboard1.getFontMetrics(font38);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard43.addPropertyChangeListener(propertyChangeListener44);
        managementDashboard43.enableInputMethods(true);
        java.awt.Dimension dimension48 = managementDashboard43.getMinimumSize();
        float float49 = managementDashboard43.getAlignmentX();
        managementDashboard43.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        java.awt.event.MouseMotionListener mouseMotionListener54 = null;
        managementDashboard43.removeMouseMotionListener(mouseMotionListener54);
        boolean boolean56 = managementDashboard43.getIgnoreRepaint();
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        boolean boolean59 = managementDashboard58.isVisible();
        java.awt.Dimension dimension60 = managementDashboard58.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        managementDashboard62.addPropertyChangeListener(propertyChangeListener63);
        java.awt.event.FocusEvent.Cause cause65 = null;
        managementDashboard62.requestFocus(cause65);
        java.awt.event.InputMethodListener inputMethodListener67 = null;
        managementDashboard62.addInputMethodListener(inputMethodListener67);
        java.awt.Point point69 = managementDashboard62.location();
        managementDashboard58.setLocation(point69);
        java.awt.Rectangle rectangle71 = managementDashboard58.getBounds();
        managementDashboard43.repaint(rectangle71);
        managementDashboard1.paintImmediately(rectangle71);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(colorModel13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(componentArray30);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(fontMetrics41);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dimension60);
        org.junit.Assert.assertNotNull(point69);
        org.junit.Assert.assertNotNull(rectangle71);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior7 = managementDashboard1.getBaselineResizeBehavior();
        managementDashboard1.setVisible(false);
        boolean boolean10 = managementDashboard1.getInheritsPopupMenu();
        java.awt.Component component11 = managementDashboard1.getNextFocusableComponent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior7 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior7.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(component11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray45 = managementDashboard32.getVetoableChangeListeners();
        managementDashboard32.firePropertyChange("PanelUI", (byte) -1, (byte) 0);
        java.awt.event.MouseEvent mouseEvent50 = null;
        java.awt.Point point51 = managementDashboard32.getPopupLocation(mouseEvent50);
        java.awt.Rectangle rectangle52 = managementDashboard32.bounds();
        managementDashboard32.setAutoscrolls(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray45);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray45, new java.beans.VetoableChangeListener[] {});
        org.junit.Assert.assertNull(point51);
        org.junit.Assert.assertNotNull(rectangle52);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.Dimension dimension18 = managementDashboard1.getSize();
        java.awt.event.ComponentListener componentListener19 = null;
        managementDashboard1.removeComponentListener(componentListener19);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        managementDashboard22.enableInputMethods(true);
        java.awt.Dimension dimension27 = managementDashboard22.getMinimumSize();
        float float28 = managementDashboard22.getAlignmentX();
        managementDashboard22.addNotify();
        boolean boolean30 = managementDashboard22.isDoubleBuffered();
        java.awt.Rectangle rectangle31 = managementDashboard22.getBounds();
        managementDashboard1.repaint(rectangle31);
        java.awt.Color color33 = managementDashboard1.getForeground();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(color33);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = managementDashboard1.requestFocusInWindow(cause6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.awt.Image image13 = managementDashboard9.createImage(13, (-1));
        managementDashboard9.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        managementDashboard9.removeMouseMotionListener(mouseMotionListener16);
        managementDashboard9.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray21 = managementDashboard9.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.awt.event.ActionListener actionListener24 = null;
        javax.swing.KeyStroke keyStroke26 = null;
        managementDashboard23.registerKeyboardAction(actionListener24, "hi!", keyStroke26, (int) (short) 0);
        java.awt.Font font29 = managementDashboard23.getFont();
        managementDashboard9.setFont(font29);
        java.awt.Point point31 = managementDashboard9.getLocation();
        boolean boolean32 = managementDashboard1.contains(point31);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.awt.event.ActionListener actionListener35 = null;
        javax.swing.KeyStroke keyStroke37 = null;
        managementDashboard34.registerKeyboardAction(actionListener35, "hi!", keyStroke37, (int) (short) 0);
        java.awt.Font font40 = managementDashboard34.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        boolean boolean43 = managementDashboard42.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isVisible();
        java.awt.Image image49 = managementDashboard45.createImage(13, (-1));
        managementDashboard45.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        managementDashboard53.addPropertyChangeListener(propertyChangeListener54);
        java.awt.event.FocusEvent.Cause cause56 = null;
        managementDashboard53.requestFocus(cause56);
        java.awt.event.InputMethodListener inputMethodListener58 = null;
        managementDashboard53.addInputMethodListener(inputMethodListener58);
        java.awt.Point point60 = managementDashboard53.location();
        java.awt.Component component61 = managementDashboard45.findComponentAt(point60);
        java.awt.Component component62 = managementDashboard42.getComponentAt(point60);
        managementDashboard42.grabFocus();
        java.awt.Rectangle rectangle64 = managementDashboard42.bounds();
        java.awt.Rectangle rectangle65 = managementDashboard34.getBounds(rectangle64);
        managementDashboard34.setFocusCycleRoot(false);
        int int68 = managementDashboard34.getX();
        java.util.function.Consumer<java.lang.String> strConsumer69 = null;
        ManagementDashboard managementDashboard70 = new ManagementDashboard(strConsumer69);
        java.awt.image.ImageProducer imageProducer71 = null;
        java.awt.Image image72 = managementDashboard70.createImage(imageProducer71);
        java.util.function.Consumer<java.lang.String> strConsumer73 = null;
        ManagementDashboard managementDashboard74 = new ManagementDashboard(strConsumer73);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        managementDashboard74.addPropertyChangeListener(propertyChangeListener75);
        java.awt.event.FocusEvent.Cause cause77 = null;
        managementDashboard74.requestFocus(cause77);
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        managementDashboard74.addInputMethodListener(inputMethodListener79);
        java.awt.Point point81 = managementDashboard74.location();
        java.awt.Component component82 = managementDashboard70.add((java.awt.Component) managementDashboard74);
        javax.swing.JPopupMenu jPopupMenu83 = managementDashboard70.getComponentPopupMenu();
        javax.swing.border.Border border84 = null;
        managementDashboard70.setBorder(border84);
        java.util.function.Consumer<java.lang.String> strConsumer86 = null;
        ManagementDashboard managementDashboard87 = new ManagementDashboard(strConsumer86);
        java.beans.PropertyChangeListener propertyChangeListener88 = null;
        managementDashboard87.addPropertyChangeListener(propertyChangeListener88);
        java.awt.event.FocusEvent.Cause cause90 = null;
        managementDashboard87.requestFocus(cause90);
        java.awt.event.InputMethodListener inputMethodListener92 = null;
        managementDashboard87.addInputMethodListener(inputMethodListener92);
        java.awt.Color color94 = managementDashboard87.getBackground();
        managementDashboard70.setForeground(color94);
        managementDashboard34.setForeground(color94);
        managementDashboard1.setBackground(color94);
        managementDashboard1.resetKeyboardActions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(componentArray21);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(point60);
        org.junit.Assert.assertNull(component61);
        org.junit.Assert.assertNull(component62);
        org.junit.Assert.assertNotNull(rectangle64);
        org.junit.Assert.assertNotNull(rectangle65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(image72);
        org.junit.Assert.assertNotNull(point81);
        org.junit.Assert.assertNotNull(component82);
        org.junit.Assert.assertNull(jPopupMenu83);
        org.junit.Assert.assertNotNull(color94);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener6);
        managementDashboard1.addNotify();
        managementDashboard1.firePropertyChange("data/userData.csv", (byte) -1, (byte) 10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = managementDashboard32.createImage(imageProducer38);
        java.awt.event.KeyListener[] keyListenerArray40 = managementDashboard32.getKeyListeners();
        java.lang.String str41 = managementDashboard32.getName();
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.awt.image.ImageProducer imageProducer44 = null;
        java.awt.Image image45 = managementDashboard43.createImage(imageProducer44);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard43.add((java.awt.Component) managementDashboard47);
        javax.swing.JPopupMenu jPopupMenu56 = managementDashboard43.getComponentPopupMenu();
        javax.swing.border.Border border57 = null;
        managementDashboard43.setBorder(border57);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Color color67 = managementDashboard60.getBackground();
        managementDashboard43.setForeground(color67);
        managementDashboard32.setForeground(color67);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNotNull(keyListenerArray40);
        org.junit.Assert.assertArrayEquals(keyListenerArray40, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(image45);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNotNull(component55);
        org.junit.Assert.assertNull(jPopupMenu56);
        org.junit.Assert.assertNotNull(color67);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        boolean boolean18 = managementDashboard1.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy8);
        managementDashboard1.firePropertyChange("PanelUI", (short) (byte) 1, (short) 100);
        java.awt.Graphics graphics14 = null;
        managementDashboard1.update(graphics14);
        java.awt.Event event16 = null;
        boolean boolean18 = managementDashboard1.keyUp(event16, 9);
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        int int8 = managementDashboard1.getWidth();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isVisible();
        java.awt.Image image14 = managementDashboard10.createImage(13, (-1));
        managementDashboard10.remove((int) (short) 1);
        java.awt.Dimension dimension17 = managementDashboard10.minimumSize();
        managementDashboard1.setMinimumSize(dimension17);
        java.awt.LayoutManager layoutManager19 = managementDashboard1.getLayout();
        java.awt.Dimension dimension20 = managementDashboard1.getMinimumSize();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printWriter21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertNotNull(dimension20);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        java.util.Locale locale9 = managementDashboard1.getLocale();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.printAll(graphics10);
        java.lang.String str12 = managementDashboard1.toString();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (float) 64, (float) (short) 100);
        java.awt.event.MouseMotionListener mouseMotionListener17 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener17);
        boolean boolean19 = managementDashboard1.requestDefaultFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str12, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        DebitCardPayment debitCardPayment0 = new DebitCardPayment();
        debitCardPayment0.pay((double) 100L);
        debitCardPayment0.pay((double) (-1L));
        debitCardPayment0.pay((double) 2);
        debitCardPayment0.pay(1.0d);
        debitCardPayment0.pay(0.0d);
        debitCardPayment0.pay((double) (short) 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        java.awt.event.MouseMotionListener mouseMotionListener12 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener12);
        boolean boolean14 = managementDashboard1.getIgnoreRepaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point15 = managementDashboard1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard1.validate();
        java.awt.Event event13 = null;
        boolean boolean16 = managementDashboard1.mouseDrag(event13, 7, (int) '#');
        managementDashboard1.transferFocusDownCycle();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener18);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.resize(0, (int) '4');
        java.awt.event.FocusEvent.Cause cause9 = null;
        managementDashboard1.requestFocus(cause9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        managementDashboard1.grabFocus();
        managementDashboard1.firePropertyChange("123456789", (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        javax.swing.InputVerifier inputVerifier7 = null;
        managementDashboard1.setInputVerifier(inputVerifier7);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.firePropertyChange("", ' ', '4');
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.Container container47 = managementDashboard32.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        boolean boolean53 = managementDashboard52.isVisible();
        java.awt.Image image56 = managementDashboard52.createImage(13, (-1));
        managementDashboard52.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Point point67 = managementDashboard60.location();
        java.awt.Component component68 = managementDashboard52.findComponentAt(point67);
        java.awt.Component component69 = managementDashboard49.getComponentAt(point67);
        java.awt.Point point70 = managementDashboard32.getLocation(point67);
        boolean boolean71 = managementDashboard32.isFocusCycleRoot();
        java.awt.Point point72 = managementDashboard32.getLocation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(image56);
        org.junit.Assert.assertNotNull(point67);
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNull(component69);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(point72);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Font font7 = managementDashboard1.getFont();
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard1.requestFocus(cause8);
        java.awt.event.FocusListener focusListener10 = null;
        managementDashboard1.addFocusListener(focusListener10);
        boolean boolean12 = managementDashboard1.getFocusTraversalKeysEnabled();
        boolean boolean13 = managementDashboard1.isFocusOwner();
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        managementDashboard1.move((int) (short) 100, 9);
        boolean boolean10 = managementDashboard1.isDoubleBuffered();
        java.lang.String str11 = managementDashboard1.getUIClassID();
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = managementDashboard1.getPopupLocation(mouseEvent12);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PanelUI" + "'", str11, "PanelUI");
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        GenerateAccountView generateAccountView1 = new GenerateAccountView(strConsumer0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = generateAccountView1.getPropertyChangeListeners();
        int int3 = generateAccountView1.getX();
        java.awt.Cursor cursor4 = generateAccountView1.getCursor();
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray2, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cursor4);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        boolean boolean13 = managementDashboard1.isValid();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard15.addPropertyChangeListener(propertyChangeListener16);
        java.awt.image.ColorModel colorModel18 = managementDashboard15.getColorModel();
        javax.swing.plaf.PanelUI panelUI19 = managementDashboard15.getUI();
        java.awt.Insets insets20 = managementDashboard15.getInsets();
        java.awt.Insets insets21 = managementDashboard1.getInsets(insets20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(colorModel18);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertNotNull(insets21);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isVisible();
        java.awt.Image image43 = managementDashboard39.createImage(13, (-1));
        managementDashboard39.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        managementDashboard47.addPropertyChangeListener(propertyChangeListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        managementDashboard47.requestFocus(cause50);
        java.awt.event.InputMethodListener inputMethodListener52 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener52);
        java.awt.Point point54 = managementDashboard47.location();
        java.awt.Component component55 = managementDashboard39.findComponentAt(point54);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard57.createImage(imageProducer58);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        managementDashboard61.addPropertyChangeListener(propertyChangeListener62);
        java.awt.event.FocusEvent.Cause cause64 = null;
        managementDashboard61.requestFocus(cause64);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener66);
        int int68 = managementDashboard39.checkImage(image59, (java.awt.image.ImageObserver) managementDashboard61);
        java.util.function.Consumer<java.lang.String> strConsumer71 = null;
        ManagementDashboard managementDashboard72 = new ManagementDashboard(strConsumer71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard72.addPropertyChangeListener(propertyChangeListener73);
        java.util.Locale locale75 = managementDashboard72.getLocale();
        float float76 = managementDashboard72.getAlignmentY();
        java.awt.image.VolatileImage volatileImage79 = managementDashboard72.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj80 = managementDashboard72.getTreeLock();
        managementDashboard72.setVerifyInputWhenFocusTarget(true);
        int int83 = managementDashboard23.checkImage(image59, (int) 'a', 10, (java.awt.image.ImageObserver) managementDashboard72);
        javax.swing.InputMap inputMap84 = managementDashboard72.getInputMap();
        java.awt.Cursor cursor85 = managementDashboard72.getCursor();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior86 = managementDashboard72.getBaselineResizeBehavior();
        java.awt.Insets insets87 = managementDashboard72.getInsets();
        java.lang.Class<?> wildcardClass88 = managementDashboard72.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(point54);
        org.junit.Assert.assertNull(component55);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.5f + "'", float76 == 0.5f);
        org.junit.Assert.assertNull(volatileImage79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(inputMap84);
        org.junit.Assert.assertNotNull(cursor85);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior86 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior86.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(insets87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard1.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        java.awt.Point point30 = managementDashboard23.location();
        java.awt.Point point31 = managementDashboard1.getLocation(point30);
        managementDashboard1.enable();
        int int33 = managementDashboard1.getComponentCount();
        managementDashboard1.firePropertyChange("", '#', '#');
        int int38 = managementDashboard1.getHeight();
        int int41 = managementDashboard1.getBaseline(12, 6);
        java.awt.event.MouseMotionListener mouseMotionListener42 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener42);
        boolean boolean45 = managementDashboard1.requestFocus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(point30);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        java.awt.event.MouseListener mouseListener22 = null;
        managementDashboard1.addMouseListener(mouseListener22);
        managementDashboard1.validate();
        managementDashboard1.setVisible(false);
        java.awt.Dimension dimension27 = managementDashboard1.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(dimension27);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        managementDashboard1.disable();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard1.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener20);
        java.awt.Event event22 = null;
        boolean boolean24 = managementDashboard1.keyDown(event22, (int) (byte) 0);
        boolean boolean25 = managementDashboard1.isEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.awt.event.ActionListener actionListener28 = null;
        javax.swing.KeyStroke keyStroke30 = null;
        managementDashboard27.registerKeyboardAction(actionListener28, "hi!", keyStroke30, (int) (short) 0);
        java.awt.Point point33 = managementDashboard27.location();
        java.awt.Component component34 = managementDashboard1.findComponentAt(point33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNull(component34);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        javax.swing.KeyStroke keyStroke2 = null;
        java.awt.event.ActionListener actionListener3 = managementAccountsView1.getActionForKeyStroke(keyStroke2);
        java.awt.Component component5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component6 = managementAccountsView1.add("data/userData.csv", component5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(actionListener3);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        managementDashboard1.transferFocusDownCycle();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener8);
        java.awt.Container container10 = managementDashboard1.getParent();
        javax.swing.TransferHandler transferHandler11 = managementDashboard1.getTransferHandler();
        java.awt.Cursor cursor12 = managementDashboard1.getCursor();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(transferHandler11);
        org.junit.Assert.assertNotNull(cursor12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        boolean boolean6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean7 = managementDashboard1.requestDefaultFocus();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        java.awt.Event event10 = null;
        java.lang.Object obj11 = null;
        boolean boolean12 = managementDashboard1.lostFocus(event10, obj11);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Shape shape11 = null;
        managementDashboard1.setMixingCutoutShape(shape11);
        boolean boolean13 = managementDashboard1.isRequestFocusEnabled();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        MobilePayment mobilePayment0 = new MobilePayment();
        mobilePayment0.pay((double) 0L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.setEnabled(false);
        managementDashboard32.disable();
        int int52 = managementDashboard32.getHeight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        ParkingSpace[] parkingSpaceArray2 = parkingLot1.getSpaces();
        parkingLot1.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSpaceArray2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Point point8 = managementDashboard1.location();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard1.getUI();
        javax.swing.InputVerifier inputVerifier10 = managementDashboard1.getInputVerifier();
        managementDashboard1.validate();
        managementDashboard1.show();
        java.lang.String str13 = managementDashboard1.getUIClassID();
        org.junit.Assert.assertNotNull(point8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(inputVerifier10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PanelUI" + "'", str13, "PanelUI");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isMinimumSizeSet();
        java.awt.Point point11 = managementDashboard1.getLocation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(point11);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener5);
        managementDashboard1.setToolTipText("data/parkingSpaceData.csv");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard10.addPropertyChangeListener(propertyChangeListener11);
        java.awt.Insets insets13 = null;
        java.awt.Insets insets14 = managementDashboard10.getInsets(insets13);
        boolean boolean15 = managementDashboard10.isShowing();
        boolean boolean16 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard10);
        managementDashboard1.transferFocusBackward();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertNotNull(insets14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        java.awt.Dimension dimension7 = managementDashboard1.getMinimumSize();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.awt.Image image13 = managementDashboard9.createImage(13, (-1));
        boolean boolean14 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard9);
        boolean boolean15 = managementDashboard9.requestDefaultFocus();
        java.beans.VetoableChangeListener vetoableChangeListener16 = null;
        managementDashboard9.removeVetoableChangeListener(vetoableChangeListener16);
        managementDashboard9.firePropertyChange("", (short) 1, (short) (byte) 0);
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard9);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.revalidate();
        boolean boolean50 = managementDashboard32.isFocusTraversalPolicySet();
        boolean boolean51 = managementDashboard32.isPaintingForPrint();
        int int54 = managementDashboard32.getBaseline(13, 128);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = managementDashboard32.areFocusTraversalKeysSet(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        managementDashboard1.removeNotify();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet16 = managementDashboard1.getFocusTraversalKeys(3);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet16);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        int int14 = managementDashboard1.countComponents();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Insets insets8 = managementDashboard1.getInsets();
        java.util.Locale locale9 = managementDashboard1.getLocale();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.printAll(graphics10);
        java.lang.String str12 = managementDashboard1.toString();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (float) 64, (float) (short) 100);
        managementDashboard1.invalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(insets8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str12, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.resize(0, (int) '4');
        boolean boolean9 = managementDashboard1.isFocusTraversalPolicyProvider();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.print(graphics10);
        javax.swing.TransferHandler transferHandler12 = managementDashboard1.getTransferHandler();
        javax.swing.JPopupMenu jPopupMenu13 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(transferHandler12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.show(true);
        java.awt.Dimension dimension8 = managementDashboard1.size();
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jToolTip9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.awt.Graphics graphics31 = null;
        managementDashboard1.printAll(graphics31);
        boolean boolean33 = managementDashboard1.requestDefaultFocus();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isVisible();
        java.awt.Image image39 = managementDashboard35.createImage(13, (-1));
        managementDashboard35.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard43.addPropertyChangeListener(propertyChangeListener44);
        java.awt.event.FocusEvent.Cause cause46 = null;
        managementDashboard43.requestFocus(cause46);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard43.addInputMethodListener(inputMethodListener48);
        java.awt.Point point50 = managementDashboard43.location();
        java.awt.Component component51 = managementDashboard35.findComponentAt(point50);
        managementDashboard1.setLocation(point50);
        int int53 = managementDashboard1.getHeight();
        managementDashboard1.disable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNotNull(point50);
        org.junit.Assert.assertNull(component51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy8);
        managementDashboard1.firePropertyChange("PanelUI", (short) (byte) 1, (short) 100);
        java.awt.Insets insets14 = managementDashboard1.insets();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(insets14);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotAvailability();
        parkingLot1.setSpace(11, "hi!", "Empty", "SUPERMAN");
        parkingLot1.setEnabled(false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.awt.image.ImageProducer imageProducer6 = null;
        java.awt.Image image7 = managementDashboard5.createImage(imageProducer6);
        managementDashboard5.resize(2, 100);
        java.beans.VetoableChangeListener vetoableChangeListener11 = null;
        managementDashboard5.removeVetoableChangeListener(vetoableChangeListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        java.awt.Component component30 = managementDashboard14.findComponentAt(point29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.image.ImageProducer imageProducer33 = null;
        java.awt.Image image34 = managementDashboard32.createImage(imageProducer33);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        int int43 = managementDashboard14.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        managementDashboard45.addPropertyChangeListener(propertyChangeListener46);
        java.util.Locale locale48 = managementDashboard45.getLocale();
        float float49 = managementDashboard45.getAlignmentY();
        java.awt.Component component50 = managementDashboard36.add((java.awt.Component) managementDashboard45);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        managementDashboard52.addPropertyChangeListener(propertyChangeListener53);
        java.util.Locale locale55 = managementDashboard52.getLocale();
        managementDashboard45.setLocale(locale55);
        managementDashboard5.setLocale(locale55);
        java.awt.Dimension dimension58 = managementDashboard5.getMaximumSize();
        managementDashboard1.setSize(dimension58);
        org.junit.Assert.assertNotNull(image7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertNotNull(image34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.5f + "'", float49 == 0.5f);
        org.junit.Assert.assertNotNull(component50);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertNotNull(dimension58);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.countComponents();
        java.awt.Insets insets3 = managementDashboard1.getInsets();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.image.ColorModel colorModel8 = managementDashboard5.getColorModel();
        javax.swing.plaf.PanelUI panelUI9 = managementDashboard5.getUI();
        managementDashboard1.setUI(panelUI9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.awt.Point point12 = managementDashboard1.getToolTipLocation(mouseEvent11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.awt.Insets insets21 = managementDashboard14.getInsets();
        java.util.Locale locale22 = managementDashboard14.getLocale();
        java.awt.Graphics graphics23 = null;
        managementDashboard14.printAll(graphics23);
        boolean boolean25 = managementDashboard14.isPreferredSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        boolean boolean28 = managementDashboard27.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        boolean boolean31 = managementDashboard30.isVisible();
        java.awt.Image image34 = managementDashboard30.createImage(13, (-1));
        managementDashboard30.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        managementDashboard38.addPropertyChangeListener(propertyChangeListener39);
        java.awt.event.FocusEvent.Cause cause41 = null;
        managementDashboard38.requestFocus(cause41);
        java.awt.event.InputMethodListener inputMethodListener43 = null;
        managementDashboard38.addInputMethodListener(inputMethodListener43);
        java.awt.Point point45 = managementDashboard38.location();
        java.awt.Component component46 = managementDashboard30.findComponentAt(point45);
        java.awt.Component component47 = managementDashboard27.getComponentAt(point45);
        managementDashboard27.grabFocus();
        java.awt.Rectangle rectangle49 = managementDashboard27.bounds();
        managementDashboard14.setBounds(rectangle49);
        managementDashboard1.scrollRectToVisible(rectangle49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(insets3);
        org.junit.Assert.assertNotNull(colorModel8);
        org.junit.Assert.assertNotNull(panelUI9);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(insets21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(image34);
        org.junit.Assert.assertNotNull(point45);
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertNull(component47);
        org.junit.Assert.assertNotNull(rectangle49);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds((int) (byte) 1, (int) (short) 10, (int) (byte) 0, 10);
        float float13 = managementDashboard1.getAlignmentY();
        boolean boolean14 = managementDashboard1.isOptimizedDrawingEnabled();
        float float15 = managementDashboard1.getAlignmentX();
        managementDashboard1.setFocusTraversalKeysEnabled(true);
        java.util.Locale locale18 = managementDashboard1.getLocale();
        managementDashboard1.removeAll();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = null;
        managementDashboard23.setFocusTraversalPolicy(focusTraversalPolicy38);
        managementDashboard23.setAutoscrolls(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        boolean boolean6 = managementDashboard1.contains((int) (byte) -1, (int) '#');
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.show(true);
        java.awt.Dimension dimension15 = managementDashboard8.size();
        javax.swing.JToolTip jToolTip16 = managementDashboard8.createToolTip();
        java.lang.Object obj17 = null;
        managementDashboard1.putClientProperty((java.lang.Object) jToolTip16, obj17);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray19 = jToolTip16.getMouseMotionListeners();
        jToolTip16.setSize(128, 1);
        java.awt.event.FocusEvent.Cause cause23 = null;
        boolean boolean24 = jToolTip16.requestFocusInWindow(cause23);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.awt.event.FocusEvent.Cause cause29 = null;
        managementDashboard26.requestFocus(cause29);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener31);
        java.awt.Color color33 = managementDashboard26.getBackground();
        managementDashboard26.setRequestFocusEnabled(true);
        java.awt.event.MouseListener mouseListener36 = null;
        managementDashboard26.addMouseListener(mouseListener36);
        boolean boolean38 = managementDashboard26.isPaintingTile();
        java.awt.event.MouseEvent mouseEvent39 = null;
        java.awt.Point point40 = managementDashboard26.getPopupLocation(mouseEvent39);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setEnabled(true);
        java.awt.Point point45 = managementDashboard42.location();
        java.awt.Component component46 = managementDashboard26.findComponentAt(point45);
        java.awt.Component component47 = jToolTip16.getComponentAt(point45);
        java.awt.Dimension dimension48 = jToolTip16.minimumSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(jToolTip16);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray19);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray19, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(point40);
        org.junit.Assert.assertNotNull(point45);
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertNotNull(component47);
        org.junit.Assert.assertNotNull(dimension48);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener4);
        boolean boolean8 = managementDashboard1.contains(13, (-1));
        javax.swing.KeyStroke keyStroke9 = null;
        managementDashboard1.unregisterKeyboardAction(keyStroke9);
        managementDashboard1.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        boolean boolean6 = managementDashboard1.contains((int) (byte) -1, (int) '#');
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.show(true);
        java.awt.Dimension dimension15 = managementDashboard8.size();
        javax.swing.JToolTip jToolTip16 = managementDashboard8.createToolTip();
        java.lang.Object obj17 = null;
        managementDashboard1.putClientProperty((java.lang.Object) jToolTip16, obj17);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray19 = jToolTip16.getMouseMotionListeners();
        jToolTip16.setSize(128, 1);
        java.awt.event.FocusEvent.Cause cause23 = null;
        boolean boolean24 = jToolTip16.requestFocusInWindow(cause23);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.awt.event.FocusEvent.Cause cause29 = null;
        managementDashboard26.requestFocus(cause29);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener31);
        java.awt.Color color33 = managementDashboard26.getBackground();
        managementDashboard26.setRequestFocusEnabled(true);
        java.awt.event.MouseListener mouseListener36 = null;
        managementDashboard26.addMouseListener(mouseListener36);
        boolean boolean38 = managementDashboard26.isPaintingTile();
        java.awt.event.MouseEvent mouseEvent39 = null;
        java.awt.Point point40 = managementDashboard26.getPopupLocation(mouseEvent39);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setEnabled(true);
        java.awt.Point point45 = managementDashboard42.location();
        java.awt.Component component46 = managementDashboard26.findComponentAt(point45);
        java.awt.Component component47 = jToolTip16.getComponentAt(point45);
        component47.enableInputMethods(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(jToolTip16);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray19);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray19, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(point40);
        org.junit.Assert.assertNotNull(point45);
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertNotNull(component47);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        managementAccountsView1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = managementAccountsView1.isFocusTraversable();
        java.awt.Graphics graphics5 = null;
        managementAccountsView1.print(graphics5);
        managementAccountsView1.removeNotify();
        java.awt.event.MouseListener mouseListener8 = null;
        managementAccountsView1.addMouseListener(mouseListener8);
        java.awt.Point point10 = managementAccountsView1.getLocation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(point10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Font font7 = managementDashboard1.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.Image image16 = managementDashboard12.createImage(13, (-1));
        managementDashboard12.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard20.addPropertyChangeListener(propertyChangeListener21);
        java.awt.event.FocusEvent.Cause cause23 = null;
        managementDashboard20.requestFocus(cause23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        managementDashboard20.addInputMethodListener(inputMethodListener25);
        java.awt.Point point27 = managementDashboard20.location();
        java.awt.Component component28 = managementDashboard12.findComponentAt(point27);
        java.awt.Component component29 = managementDashboard9.getComponentAt(point27);
        managementDashboard9.grabFocus();
        java.awt.Rectangle rectangle31 = managementDashboard9.bounds();
        java.awt.Rectangle rectangle32 = managementDashboard1.getBounds(rectangle31);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        managementDashboard34.addPropertyChangeListener(propertyChangeListener35);
        managementDashboard34.enableInputMethods(true);
        java.awt.Dimension dimension39 = managementDashboard34.getMinimumSize();
        float float40 = managementDashboard34.getAlignmentX();
        managementDashboard34.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard34.validate();
        java.awt.Font font46 = managementDashboard34.getFont();
        managementDashboard1.setFont(font46);
        java.awt.Graphics graphics48 = null;
        managementDashboard1.print(graphics48);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(point27);
        org.junit.Assert.assertNull(component28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.5f + "'", float40 == 0.5f);
        org.junit.Assert.assertNotNull(font46);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        ParkingSpace parkingSpace4 = new ParkingSpace(128, "hi!", "PanelUI", "");
        java.lang.String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        java.lang.String str7 = parkingSpace4.getCurrentUser();
        java.lang.String str8 = parkingSpace4.getCurrentCar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128 + "'", int6 == 128);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PanelUI" + "'", str7, "PanelUI");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        java.awt.image.ImageProducer imageProducer11 = null;
        java.awt.Image image12 = managementDashboard10.createImage(imageProducer11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        managementDashboard14.addPropertyChangeListener(propertyChangeListener15);
        java.awt.event.FocusEvent.Cause cause17 = null;
        managementDashboard14.requestFocus(cause17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        managementDashboard14.addInputMethodListener(inputMethodListener19);
        java.awt.Point point21 = managementDashboard14.location();
        java.awt.Component component22 = managementDashboard10.add((java.awt.Component) managementDashboard14);
        component22.setBounds((int) (byte) 0, 0, 100, (int) (short) 1);
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = component22.createImage(imageProducer28);
        boolean boolean35 = managementDashboard1.imageUpdate(image29, 0, (int) (byte) 1, 1, 12, 32);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertNotNull(point21);
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            jPopupMenu14.paintImmediately(8, 0, 7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.Dimension dimension6 = managementDashboard1.getMinimumSize();
        float float7 = managementDashboard1.getAlignmentX();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
        managementDashboard1.validate();
        java.awt.Event event13 = null;
        boolean boolean16 = managementDashboard1.mouseDrag(event13, 7, (int) '#');
        managementDashboard1.transferFocusDownCycle();
        java.awt.FocusTraversalPolicy focusTraversalPolicy18 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy18);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        boolean boolean22 = managementDashboard21.isVisible();
        java.awt.Image image25 = managementDashboard21.createImage(13, (-1));
        managementDashboard21.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        managementDashboard29.addPropertyChangeListener(propertyChangeListener30);
        java.awt.event.FocusEvent.Cause cause32 = null;
        managementDashboard29.requestFocus(cause32);
        java.awt.event.InputMethodListener inputMethodListener34 = null;
        managementDashboard29.addInputMethodListener(inputMethodListener34);
        java.awt.Point point36 = managementDashboard29.location();
        java.awt.Component component37 = managementDashboard21.findComponentAt(point36);
        boolean boolean38 = managementDashboard21.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard21.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener40);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard43.addPropertyChangeListener(propertyChangeListener44);
        java.awt.event.FocusEvent.Cause cause46 = null;
        managementDashboard43.requestFocus(cause46);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard43.addInputMethodListener(inputMethodListener48);
        java.awt.Point point50 = managementDashboard43.location();
        java.awt.Point point51 = managementDashboard21.getLocation(point50);
        managementDashboard21.enable();
        java.awt.Toolkit toolkit53 = managementDashboard21.getToolkit();
        java.util.function.Consumer<java.lang.String> strConsumer54 = null;
        ManagementDashboard managementDashboard55 = new ManagementDashboard(strConsumer54);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        managementDashboard55.addPropertyChangeListener(propertyChangeListener56);
        java.awt.image.ImageProducer imageProducer58 = null;
        java.awt.Image image59 = managementDashboard55.createImage(imageProducer58);
        boolean boolean65 = managementDashboard21.imageUpdate(image59, (int) 'a', 9, (int) (byte) -1, 11, 97);
        java.awt.image.ImageObserver imageObserver66 = null;
        int int67 = managementDashboard1.checkImage(image59, imageObserver66);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(point36);
        org.junit.Assert.assertNull(component37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(point50);
        org.junit.Assert.assertNotNull(point51);
        org.junit.Assert.assertNotNull(toolkit53);
        org.junit.Assert.assertNotNull(image59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.awt.image.ColorModel colorModel4 = managementDashboard1.getColorModel();
        java.awt.ComponentOrientation componentOrientation5 = managementDashboard1.getComponentOrientation();
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        managementDashboard7.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isVisible();
        java.awt.Image image15 = managementDashboard11.createImage(13, (-1));
        managementDashboard11.remove((int) (short) 1);
        java.awt.Insets insets18 = managementDashboard11.getInsets();
        java.util.Locale locale19 = managementDashboard11.getLocale();
        java.awt.Graphics graphics20 = null;
        managementDashboard11.printAll(graphics20);
        java.lang.String str22 = managementDashboard11.toString();
        managementDashboard7.setNextFocusableComponent((java.awt.Component) managementDashboard11);
        java.awt.Dimension dimension24 = managementDashboard7.getSize();
        managementDashboard1.setMaximumSize(dimension24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(colorModel4);
        org.junit.Assert.assertNotNull(componentOrientation5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str22, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        java.awt.Graphics graphics5 = null;
        managementDashboard1.print(graphics5);
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        managementDashboard32.setVisible(true);
        java.awt.event.FocusEvent.Cause cause47 = null;
        managementDashboard32.requestFocus(cause47);
        managementDashboard32.setEnabled(false);
        java.awt.Color color51 = managementDashboard32.getForeground();
        java.awt.Event event52 = null;
        boolean boolean55 = managementDashboard32.mouseDrag(event52, 0, (int) (short) 0);
        java.awt.Graphics graphics56 = null;
        managementDashboard32.paintComponents(graphics56);
        java.awt.image.ColorModel colorModel58 = managementDashboard32.getColorModel();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(colorModel58);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        managementDashboard32.addNotify();
        java.awt.Graphics graphics45 = null;
        managementDashboard32.print(graphics45);
        java.awt.Event event47 = null;
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isVisible();
        java.awt.Image image53 = managementDashboard49.createImage(13, (-1));
        managementDashboard49.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener56 = null;
        managementDashboard49.removeMouseMotionListener(mouseMotionListener56);
        managementDashboard49.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray61 = managementDashboard49.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        java.awt.event.ActionListener actionListener64 = null;
        javax.swing.KeyStroke keyStroke66 = null;
        managementDashboard63.registerKeyboardAction(actionListener64, "hi!", keyStroke66, (int) (short) 0);
        java.awt.Font font69 = managementDashboard63.getFont();
        managementDashboard49.setFont(font69);
        javax.swing.JPopupMenu jPopupMenu71 = managementDashboard49.getComponentPopupMenu();
        boolean boolean72 = managementDashboard32.action(event47, (java.lang.Object) managementDashboard49);
        java.util.function.Consumer<java.lang.String> strConsumer73 = null;
        ManagementDashboard managementDashboard74 = new ManagementDashboard(strConsumer73);
        boolean boolean75 = managementDashboard74.isVisible();
        java.awt.Dimension dimension76 = managementDashboard74.getMinimumSize();
        managementDashboard74.grabFocus();
        javax.swing.event.AncestorListener[] ancestorListenerArray78 = managementDashboard74.getAncestorListeners();
        java.util.function.Consumer<java.lang.String> strConsumer79 = null;
        ManagementDashboard managementDashboard80 = new ManagementDashboard(strConsumer79);
        java.beans.PropertyChangeListener propertyChangeListener81 = null;
        managementDashboard80.addPropertyChangeListener(propertyChangeListener81);
        java.lang.String str83 = managementDashboard80.getName();
        boolean boolean84 = managementDashboard80.isPaintingTile();
        managementDashboard80.requestFocus();
        java.awt.Dimension dimension86 = managementDashboard80.getSize();
        managementDashboard74.resize(dimension86);
        managementDashboard32.setPreferredSize(dimension86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(image53);
        org.junit.Assert.assertNotNull(componentArray61);
        org.junit.Assert.assertNotNull(font69);
        org.junit.Assert.assertNull(jPopupMenu71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dimension76);
        org.junit.Assert.assertNotNull(ancestorListenerArray78);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray78, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(dimension86);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        managementDashboard1.setBounds(5, (int) (short) -1, 64, (int) (byte) 10);
        boolean boolean15 = managementDashboard1.contains(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.awt.Dimension dimension8 = managementDashboard1.minimumSize();
        java.awt.Dimension dimension9 = managementDashboard1.getPreferredSize();
        float float10 = managementDashboard1.getAlignmentX();
        managementDashboard1.setSize(13, (int) (short) 10);
        java.awt.event.FocusListener[] focusListenerArray14 = managementDashboard1.getFocusListeners();
        managementDashboard1.nextFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(focusListenerArray14);
        org.junit.Assert.assertArrayEquals(focusListenerArray14, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        managementDashboard1.enable();
        java.awt.Graphics graphics21 = null;
        managementDashboard1.printAll(graphics21);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard1.addPropertyChangeListener("data/userData.csv", propertyChangeListener24);
        int int26 = managementDashboard1.getDebugGraphicsOptions();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener6);
        java.awt.event.FocusEvent.Cause cause8 = null;
        managementDashboard5.requestFocus(cause8);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        managementDashboard5.addInputMethodListener(inputMethodListener10);
        java.awt.Point point12 = managementDashboard5.location();
        java.awt.Component component13 = managementDashboard1.add((java.awt.Component) managementDashboard5);
        javax.swing.JPopupMenu jPopupMenu14 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.repaint((int) '#', 9, 1, (-1));
        managementDashboard1.enable();
        java.awt.Image image23 = managementDashboard1.createImage((-1), 64);
        managementDashboard1.setEnabled(false);
        javax.swing.KeyStroke[] keyStrokeArray26 = managementDashboard1.getRegisteredKeyStrokes();
        java.util.Locale locale27 = managementDashboard1.getLocale();
        float float28 = managementDashboard1.getAlignmentX();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertNull(jPopupMenu14);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(keyStrokeArray26);
        org.junit.Assert.assertArrayEquals(keyStrokeArray26, new javax.swing.KeyStroke[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Font font7 = managementDashboard1.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.Image image16 = managementDashboard12.createImage(13, (-1));
        managementDashboard12.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard20.addPropertyChangeListener(propertyChangeListener21);
        java.awt.event.FocusEvent.Cause cause23 = null;
        managementDashboard20.requestFocus(cause23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        managementDashboard20.addInputMethodListener(inputMethodListener25);
        java.awt.Point point27 = managementDashboard20.location();
        java.awt.Component component28 = managementDashboard12.findComponentAt(point27);
        java.awt.Component component29 = managementDashboard9.getComponentAt(point27);
        managementDashboard9.grabFocus();
        java.awt.Rectangle rectangle31 = managementDashboard9.bounds();
        java.awt.Rectangle rectangle32 = managementDashboard1.getBounds(rectangle31);
        managementDashboard1.setFocusCycleRoot(false);
        java.awt.Color color35 = managementDashboard1.getBackground();
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(point27);
        org.junit.Assert.assertNull(component28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(color35);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotAvailability();
        parkingLot1.removeBooking(16);
        ParkingSpace parkingSpace6 = parkingLot1.getSpace(64);
        parkingSpace6.empty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        managementDashboard1.requestFocus(cause4);
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener6);
        java.awt.Color color8 = managementDashboard1.getBackground();
        managementDashboard1.paintImmediately((int) (byte) 0, (int) (byte) 10, (int) (short) 100, 0);
        managementDashboard1.setEnabled(false);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = managementDashboard1.getBaselineResizeBehavior();
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        managementDashboard1.enableInputMethods(true);
        java.awt.event.ComponentListener componentListener6 = null;
        managementDashboard1.removeComponentListener(componentListener6);
        managementDashboard1.grabFocus();
        managementDashboard1.updateUI();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        managementDashboard11.addPropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = managementDashboard11.getName();
        java.awt.event.ComponentListener componentListener15 = null;
        managementDashboard11.removeComponentListener(componentListener15);
        managementDashboard11.move((int) (short) 100, 9);
        boolean boolean20 = managementDashboard11.isLightweight();
        managementDashboard11.hide();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setEnabled(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior26 = managementDashboard23.getBaselineResizeBehavior();
        java.awt.Dimension dimension27 = managementDashboard23.getMinimumSize();
        managementDashboard11.setPreferredSize(dimension27);
        managementDashboard1.resize(dimension27);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior26 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior26.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(dimension27);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        int int20 = managementDashboard19.countComponents();
        managementDashboard19.resetKeyboardActions();
        managementDashboard19.layout();
        java.awt.event.MouseEvent mouseEvent23 = null;
        java.awt.Point point24 = managementDashboard19.getPopupLocation(mouseEvent23);
        boolean boolean25 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard19);
        managementDashboard19.firePropertyChange("data/managerData.csv", true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(point24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        boolean boolean18 = managementDashboard1.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        managementDashboard1.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener20);
        java.awt.Event event22 = null;
        boolean boolean24 = managementDashboard1.keyDown(event22, (int) (byte) 0);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard26.addPropertyChangeListener(propertyChangeListener27);
        java.awt.event.FocusEvent.Cause cause29 = null;
        managementDashboard26.requestFocus(cause29);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener31);
        java.awt.Point point33 = managementDashboard26.location();
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard26.getUI();
        javax.swing.InputVerifier inputVerifier35 = managementDashboard26.getInputVerifier();
        javax.swing.InputVerifier inputVerifier36 = managementDashboard26.getInputVerifier();
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        boolean boolean39 = managementDashboard38.isVisible();
        java.awt.Image image42 = managementDashboard38.createImage(13, (-1));
        managementDashboard38.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        managementDashboard46.addPropertyChangeListener(propertyChangeListener47);
        java.awt.event.FocusEvent.Cause cause49 = null;
        managementDashboard46.requestFocus(cause49);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        managementDashboard46.addInputMethodListener(inputMethodListener51);
        java.awt.Point point53 = managementDashboard46.location();
        java.awt.Component component54 = managementDashboard38.findComponentAt(point53);
        boolean boolean55 = managementDashboard38.isRequestFocusEnabled();
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        managementDashboard38.addPropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener57);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard60.addPropertyChangeListener(propertyChangeListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        managementDashboard60.requestFocus(cause63);
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener65);
        java.awt.Point point67 = managementDashboard60.location();
        java.awt.Point point68 = managementDashboard38.getLocation(point67);
        boolean boolean69 = managementDashboard26.contains(point68);
        java.awt.Point point70 = managementDashboard1.getLocation(point68);
        managementDashboard1.firePropertyChange("ManagementDashboard[,100,9,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 97, 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(panelUI34);
        org.junit.Assert.assertNull(inputVerifier35);
        org.junit.Assert.assertNull(inputVerifier36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(image42);
        org.junit.Assert.assertNotNull(point53);
        org.junit.Assert.assertNull(component54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(point67);
        org.junit.Assert.assertNotNull(point68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(point70);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        java.awt.Graphics graphics4 = null;
        managementDashboard1.print(graphics4);
        java.lang.String str6 = managementDashboard1.getToolTipText();
        java.awt.Component component9 = managementDashboard1.findComponentAt(4, (int) (short) 100);
        boolean boolean10 = managementDashboard1.getVerifyInputWhenFocusTarget();
        managementDashboard1.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        java.lang.String str5 = managementDashboard1.getUIClassID();
        java.awt.event.ComponentListener[] componentListenerArray6 = managementDashboard1.getComponentListeners();
        boolean boolean7 = managementDashboard1.isForegroundSet();
        boolean boolean8 = managementDashboard1.isRequestFocusEnabled();
        java.awt.event.ContainerListener[] containerListenerArray9 = managementDashboard1.getContainerListeners();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PanelUI" + "'", str5, "PanelUI");
        org.junit.Assert.assertNotNull(componentListenerArray6);
        org.junit.Assert.assertArrayEquals(componentListenerArray6, new java.awt.event.ComponentListener[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(containerListenerArray9);
        org.junit.Assert.assertArrayEquals(containerListenerArray9, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        boolean boolean5 = managementDashboard1.isPreferredSizeSet();
        managementDashboard1.enableInputMethods(true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point8 = managementDashboard1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.LayoutManager layoutManager3 = managementDashboard1.getLayout();
        boolean boolean6 = managementDashboard1.contains((int) (byte) -1, (int) '#');
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        boolean boolean9 = managementDashboard8.isVisible();
        java.awt.Image image12 = managementDashboard8.createImage(13, (-1));
        managementDashboard8.show(true);
        java.awt.Dimension dimension15 = managementDashboard8.size();
        javax.swing.JToolTip jToolTip16 = managementDashboard8.createToolTip();
        java.lang.Object obj17 = null;
        managementDashboard1.putClientProperty((java.lang.Object) jToolTip16, obj17);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray19 = jToolTip16.getMouseMotionListeners();
        jToolTip16.requestFocus();
        java.awt.Graphics graphics21 = null;
        jToolTip16.printAll(graphics21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(layoutManager3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(jToolTip16);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray19);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray19, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        int int18 = managementDashboard1.getDebugGraphicsOptions();
        javax.swing.JToolTip jToolTip19 = managementDashboard1.createToolTip();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jToolTip19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementAccountsView managementAccountsView1 = new ManagementAccountsView(strConsumer0);
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        managementAccountsView1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = managementAccountsView1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests5 = managementAccountsView1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        managementDashboard7.addPropertyChangeListener(propertyChangeListener8);
        java.awt.event.FocusEvent.Cause cause10 = null;
        managementDashboard7.requestFocus(cause10);
        java.awt.Color color12 = managementDashboard7.getBackground();
        managementDashboard7.repaint();
        boolean boolean14 = managementDashboard7.isOpaque();
        managementDashboard7.firePropertyChange("hi!", 10, 10);
        javax.swing.plaf.PanelUI panelUI19 = managementDashboard7.getUI();
        managementAccountsView1.setUI(panelUI19);
        float float21 = managementAccountsView1.getAlignmentY();
        boolean boolean22 = managementAccountsView1.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(inputMethodRequests5);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        managementDashboard23.transferFocusUpCycle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseMove(event6, (-1), (int) (byte) 0);
        boolean boolean10 = managementDashboard1.isFocusable();
        java.awt.event.ComponentListener componentListener11 = null;
        managementDashboard1.addComponentListener(componentListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isVisible();
        java.awt.Image image18 = managementDashboard14.createImage(13, (-1));
        managementDashboard14.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard22.addPropertyChangeListener(propertyChangeListener23);
        java.awt.event.FocusEvent.Cause cause25 = null;
        managementDashboard22.requestFocus(cause25);
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        managementDashboard22.addInputMethodListener(inputMethodListener27);
        java.awt.Point point29 = managementDashboard22.location();
        java.awt.Component component30 = managementDashboard14.findComponentAt(point29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.awt.image.ImageProducer imageProducer33 = null;
        java.awt.Image image34 = managementDashboard32.createImage(imageProducer33);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        managementDashboard36.addPropertyChangeListener(propertyChangeListener37);
        java.awt.event.FocusEvent.Cause cause39 = null;
        managementDashboard36.requestFocus(cause39);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener41);
        int int43 = managementDashboard14.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard36);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isVisible();
        java.awt.Image image49 = managementDashboard45.createImage(13, (-1));
        managementDashboard45.show(true);
        java.awt.event.MouseMotionListener mouseMotionListener52 = null;
        managementDashboard45.removeMouseMotionListener(mouseMotionListener52);
        managementDashboard45.resize((int) (byte) -1, (int) (byte) -1);
        java.awt.Component[] componentArray57 = managementDashboard45.getComponents();
        java.awt.Point point58 = managementDashboard45.location();
        managementDashboard45.setFocusTraversalPolicyProvider(false);
        int int61 = managementDashboard1.checkImage(image34, (java.awt.image.ImageObserver) managementDashboard45);
        java.awt.event.MouseEvent mouseEvent62 = null;
        java.awt.Point point63 = managementDashboard1.getToolTipLocation(mouseEvent62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(point29);
        org.junit.Assert.assertNull(component30);
        org.junit.Assert.assertNotNull(image34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNotNull(componentArray57);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(point63);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        int int7 = managementDashboard1.getHeight();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.addVetoableChangeListener(vetoableChangeListener8);
        managementDashboard1.setEnabled(true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isVisible();
        java.awt.Image image9 = managementDashboard5.createImage(13, (-1));
        managementDashboard5.remove((int) (short) 1);
        java.awt.Insets insets12 = managementDashboard5.getInsets();
        java.util.Locale locale13 = managementDashboard5.getLocale();
        java.awt.Graphics graphics14 = null;
        managementDashboard5.printAll(graphics14);
        java.lang.String str16 = managementDashboard5.toString();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard5);
        java.awt.event.MouseListener mouseListener18 = null;
        managementDashboard1.addMouseListener(mouseListener18);
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener20);
        java.awt.Component component22 = managementDashboard1.getNextFocusableComponent();
        java.awt.Graphics graphics23 = null;
        managementDashboard1.print(graphics23);
        java.awt.im.InputContext inputContext25 = managementDashboard1.getInputContext();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        java.awt.image.ImageProducer imageProducer28 = null;
        java.awt.Image image29 = managementDashboard27.createImage(imageProducer28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard31.addPropertyChangeListener(propertyChangeListener32);
        java.awt.event.FocusEvent.Cause cause34 = null;
        managementDashboard31.requestFocus(cause34);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard31.addInputMethodListener(inputMethodListener36);
        java.awt.Point point38 = managementDashboard31.location();
        java.awt.Component component39 = managementDashboard27.add((java.awt.Component) managementDashboard31);
        javax.swing.JPopupMenu jPopupMenu40 = managementDashboard27.getComponentPopupMenu();
        managementDashboard27.repaint((int) '#', 9, 1, (-1));
        managementDashboard27.enable();
        java.awt.Graphics graphics47 = null;
        managementDashboard27.printAll(graphics47);
        java.awt.Dimension dimension49 = managementDashboard27.getMinimumSize();
        managementDashboard1.setNextFocusableComponent((java.awt.Component) managementDashboard27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(insets12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str16, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(component22);
        org.junit.Assert.assertNull(inputContext25);
        org.junit.Assert.assertNotNull(image29);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertNull(jPopupMenu40);
        org.junit.Assert.assertNotNull(dimension49);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.lang.String str4 = managementDashboard1.getName();
        java.awt.event.ComponentListener componentListener5 = null;
        managementDashboard1.removeComponentListener(componentListener5);
        managementDashboard1.move((int) (short) 100, 9);
        int int10 = managementDashboard1.getDebugGraphicsOptions();
        managementDashboard1.setSize(11, 8);
        java.beans.VetoableChangeListener vetoableChangeListener14 = null;
        managementDashboard1.addVetoableChangeListener(vetoableChangeListener14);
        managementDashboard1.disable();
        javax.swing.TransferHandler transferHandler17 = null;
        managementDashboard1.setTransferHandler(transferHandler17);
        managementDashboard1.firePropertyChange("SUPERMAN", false, true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.awt.Graphics graphics18 = null;
        managementDashboard1.update(graphics18);
        javax.swing.InputVerifier inputVerifier20 = managementDashboard1.getInputVerifier();
        managementDashboard1.firePropertyChange("PanelUI", 'a', '4');
        java.lang.String str25 = managementDashboard1.getUIClassID();
        java.awt.event.ContainerListener containerListener26 = null;
        managementDashboard1.addContainerListener(containerListener26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNull(inputVerifier20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PanelUI" + "'", str25, "PanelUI");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.image.ImageProducer imageProducer2 = null;
        java.awt.Image image3 = managementDashboard1.createImage(imageProducer2);
        javax.swing.event.AncestorListener[] ancestorListenerArray4 = managementDashboard1.getAncestorListeners();
        managementDashboard1.hide();
        boolean boolean6 = managementDashboard1.isEnabled();
        java.awt.im.InputMethodRequests inputMethodRequests7 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.firePropertyChange("123456789", (short) 0, (short) -1);
        boolean boolean14 = managementDashboard1.contains((int) (short) 0, 13);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = managementDashboard1.getInputMethodListeners();
        org.junit.Assert.assertNotNull(image3);
        org.junit.Assert.assertNotNull(ancestorListenerArray4);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray4, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(inputMethodRequests7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray15, new java.awt.event.InputMethodListener[] {});
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        ParkingLot parkingLot1 = new ParkingLot("data/lotData.csv");
        parkingLot1.removeBooking((int) (byte) -1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke4 = null;
        managementDashboard1.registerKeyboardAction(actionListener2, "hi!", keyStroke4, (int) (short) 0);
        java.awt.Font font7 = managementDashboard1.getFont();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isVisible();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isVisible();
        java.awt.Image image16 = managementDashboard12.createImage(13, (-1));
        managementDashboard12.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard20.addPropertyChangeListener(propertyChangeListener21);
        java.awt.event.FocusEvent.Cause cause23 = null;
        managementDashboard20.requestFocus(cause23);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        managementDashboard20.addInputMethodListener(inputMethodListener25);
        java.awt.Point point27 = managementDashboard20.location();
        java.awt.Component component28 = managementDashboard12.findComponentAt(point27);
        java.awt.Component component29 = managementDashboard9.getComponentAt(point27);
        managementDashboard9.grabFocus();
        java.awt.Rectangle rectangle31 = managementDashboard9.bounds();
        java.awt.Rectangle rectangle32 = managementDashboard1.getBounds(rectangle31);
        javax.accessibility.AccessibleContext accessibleContext33 = managementDashboard1.getAccessibleContext();
        managementDashboard1.setIgnoreRepaint(false);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(point27);
        org.junit.Assert.assertNull(component28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(accessibleContext33);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        managementDashboard1.addPropertyChangeListener(propertyChangeListener2);
        java.util.Locale locale4 = managementDashboard1.getLocale();
        float float5 = managementDashboard1.getAlignmentY();
        java.awt.image.VolatileImage volatileImage8 = managementDashboard1.createVolatileImage((int) 'a', (int) (short) 1);
        java.lang.Object obj9 = managementDashboard1.getTreeLock();
        managementDashboard1.setFocusTraversalKeysEnabled(false);
        managementDashboard1.doLayout();
        java.awt.Graphics graphics13 = null;
        managementDashboard1.printAll(graphics13);
        java.beans.VetoableChangeListener vetoableChangeListener15 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener15);
        java.awt.image.ColorModel colorModel17 = managementDashboard1.getColorModel();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(colorModel17);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Image image5 = managementDashboard1.createImage(13, (-1));
        managementDashboard1.remove((int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard9.addPropertyChangeListener(propertyChangeListener10);
        java.awt.event.FocusEvent.Cause cause12 = null;
        managementDashboard9.requestFocus(cause12);
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        managementDashboard9.addInputMethodListener(inputMethodListener14);
        java.awt.Point point16 = managementDashboard9.location();
        java.awt.Component component17 = managementDashboard1.findComponentAt(point16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = managementDashboard19.createImage(imageProducer20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        managementDashboard23.addPropertyChangeListener(propertyChangeListener24);
        java.awt.event.FocusEvent.Cause cause26 = null;
        managementDashboard23.requestFocus(cause26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        managementDashboard23.addInputMethodListener(inputMethodListener28);
        int int30 = managementDashboard1.checkImage(image21, (java.awt.image.ImageObserver) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        managementDashboard32.addPropertyChangeListener(propertyChangeListener33);
        java.util.Locale locale35 = managementDashboard32.getLocale();
        float float36 = managementDashboard32.getAlignmentY();
        java.awt.Component component37 = managementDashboard23.add((java.awt.Component) managementDashboard32);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard39.addPropertyChangeListener(propertyChangeListener40);
        java.util.Locale locale42 = managementDashboard39.getLocale();
        managementDashboard32.setLocale(locale42);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = managementDashboard45.createImage(imageProducer46);
        javax.swing.KeyStroke keyStroke48 = null;
        int int49 = managementDashboard45.getConditionForKeyStroke(keyStroke48);
        managementDashboard45.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (short) -1, (short) 1);
        boolean boolean54 = managementDashboard45.getInheritsPopupMenu();
        java.lang.Object obj55 = null;
        managementDashboard32.add((java.awt.Component) managementDashboard45, obj55);
        java.awt.im.InputContext inputContext57 = managementDashboard45.getInputContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNull(component17);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputContext57);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isVisible();
        java.awt.Dimension dimension3 = managementDashboard1.getMinimumSize();
        java.awt.Component component6 = managementDashboard1.getComponentAt(64, 11);
        boolean boolean7 = managementDashboard1.isOptimizedDrawingEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNull(component6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

