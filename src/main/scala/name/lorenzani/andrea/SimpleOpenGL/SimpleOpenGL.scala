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

package name.lorenzani.andrea.SimpleOpenGL

import com.jogamp.opengl.{GLCapabilities, GLCapabilitiesImmutable, GLProfile}
import name.lorenzani.andrea.SimpleOpenGL.frames.FrameFactory
import name.lorenzani.andrea.SimpleOpenGL.frames.framelisteners.BasicFrameListener

// Starting point: https://www.tutorialspoint.com/jogl/jogl_canvas_with_awt.htm
object SimpleOpenGL extends App {

  //getting the capabilities object of GL2 profile
  val profile: GLProfile = GLProfile.get(GLProfile.GL2)
  val capabilities: GLCapabilitiesImmutable = new GLCapabilities(profile)

  // We create a Frame (the default third parameter is a SWING frame)
  val frame = FrameFactory.startFrame(capabilities, new BasicFrameListener())

  // We show the frame
  frame.show
}
