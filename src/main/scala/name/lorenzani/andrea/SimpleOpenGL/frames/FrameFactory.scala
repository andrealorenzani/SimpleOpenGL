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

object FrameType extends Enumeration {
  type FrameType = Value
  val Swing, Awt = Value
}

object FrameFactory {
  import name.lorenzani.andrea.SimpleOpenGL.frames.FrameType.FrameType

  def startFrame(capabilities: GLCapabilitiesImmutable,
                 eventListener: GLEventListener,
                 frameType: FrameType = FrameType.Swing): BaseFrame = {
    frameType match {
      case FrameType.Swing => new SwingFrame(capabilities, eventListener)
      case FrameType.Awt => new AwtFrame(capabilities, eventListener)
    }
  }
}
