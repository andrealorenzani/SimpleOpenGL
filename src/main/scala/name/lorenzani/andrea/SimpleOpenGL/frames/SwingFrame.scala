/***
*   Copyright 2017 Andrea Lorenzani
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*
***/

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
