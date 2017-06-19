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

import java.awt.{Frame => AwtNativeFrame}

import com.jogamp.opengl.awt.{GLCanvas => AwtGlCanvas}
import com.jogamp.opengl.{GLCapabilitiesImmutable, GLEventListener}

class AwtFrame(capabilities: GLCapabilitiesImmutable,
               eventListener: GLEventListener) extends BaseFrame {

  private def startAwtFrame: AwtNativeFrame = {

    // The canvas
    val awtglcanvas: AwtGlCanvas = new AwtGlCanvas(capabilities)
    awtglcanvas.addGLEventListener(eventListener)
    awtglcanvas.setSize(400, 400)

    //creating frame
    val frame: AwtNativeFrame = new AwtNativeFrame (" Basic Frame")

    //adding canvas to frame
    frame.add(awtglcanvas)
    frame.setSize( 640, 480 )
    frame
  }

  lazy val frame: AwtNativeFrame = startAwtFrame
  override def show: Unit =  frame.setVisible(true)
}
