<h1>
  <img alt = "WSL Logo" width="100" align="left" src="https://github.com/Brittank88/WhatSpeedLimit/blob/main/src/main/resources/assets/WSL/icon.png" />
    What Speed Limit?
    <br>
</h1>
<span>
    <img alt = "License Badge" src = "https://img.shields.io/github/license/Brittank88/WhatSpeedLimit?style=flat-square" />
    &nbsp; <img alt = "Server-Side Only" src = "https://img.shields.io/badge/environment-Server-1976d2?style=flat-square">
    &nbsp; <img alt = "Uses Fabric Loader" src = "https://img.shields.io/badge/modloader-Fabric-1976d2?style=flat-square">
    &nbsp; <img alt = "Latest Release Badge" src = "https://img.shields.io/github/v/release/Brittank88/WhatSpeedLimit?style=flat-square" />
    &nbsp; <img alt = "Latest (Pre-)Release Badge" src = "https://img.shields.io/github/v/release/Brittank88/WhatSpeedLimit?style=flat-square&include_prereleases" />
</span><br><br>

Performs the following changes via a mixin to `ServerPlayNetworkHandler`:

| Speed Category | Old Value | New Value          |
| -------------- | --------- | ------------------ |
| Player         | `100.0F`  | `Float.MAX_VALUE`  |
| Elytra         | `300.0F`  | `Float.MAX_VALUE`  |
| Vehicle        | `100.0`   | `Double.MAX_VALUE` |

This should prevent "Player moved too quickly!" and rubber-banding issues on servers that have the mod installed.
