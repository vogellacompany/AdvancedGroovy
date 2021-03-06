/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package gjdk

// trivial username, password
def u = 'username'
def p = 'password'

// base 64 encoding
def encoded = "$u:$p".getBytes().encodeBase64().toString()
println "$u:$p -> $encoded"
assert encoded == 'dXNlcm5hbWU6cGFzc3dvcmQ='

// decoded with multiple returns
def (user,pass) = new String(encoded.decodeBase64()).split(':')
println "(user,pass) = ($user,$pass)"
assert user == u
assert pass == p
