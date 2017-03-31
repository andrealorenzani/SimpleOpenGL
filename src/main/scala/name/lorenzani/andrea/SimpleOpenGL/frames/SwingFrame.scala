package name.lorenzani.andrea.SimpleOpenGL.frames

import com.jogamp.opengl.{GLCapabilitiesImmutable, GLEventListener}
import com.jogamp.opengl.awt.{GLCanvas => AwtGlCanvas}
import javax.swing.{JFrame => SwingNativeFrame}

class SwingFrame(capabilities: GLCapabilitiesImmutable,
                 eventListener: GLEventListener) extends BaseFrame{

  private def startSwingFrame = {

    // The canvas
    val glcanvas = new AwtGlCanvas(capabilities)
    glcanvas.addGLEventListener(eventListener)
    glcanvas.setSize(400, 400)

    //creating frame
    val frame: SwingNativeFrame = new SwingNativeFrame (" Basic Frame")

    //adding canvas to it
    frame.getContentPane().add(glcanvas)
    frame.setSize(frame.getContentPane().getPreferredSize())
    frame
  }

  lazy val frame: SwingNativeFrame = startSwingFrame
  override def show: Unit =  frame.setVisible(true)

}
