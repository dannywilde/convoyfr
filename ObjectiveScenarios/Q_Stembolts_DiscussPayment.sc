<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_Stembolts_DiscussPayment.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-336</x>
        <y>497</y>
        <center>
          <x>-237</x>
          <y>548.5</y>
        </center>
        <width>198</width>
        <height>103</height>
        <xMin>-336</xMin>
        <yMin>497</yMin>
        <xMax>-138</xMax>
        <yMax>600</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the Eiffels Incorporated office and head to the main gate.

You are told that your visit is unexpected, but are allowed to speak with Samuel and Maxwell regardless.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>186</x>
                <y>65</y>
                <center>
                  <x>191</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>186</xMin>
                <yMin>65</yMin>
                <xMax>196</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Head inside.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-190</x>
        <y>838</y>
        <center>
          <x>-115</x>
          <y>888</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>-190</xMin>
        <yMin>838</yMin>
        <xMax>-40</xMax>
        <yMax>938</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-55</x>
        <y>392</y>
        <center>
          <x>52</x>
          <y>465.5</y>
        </center>
        <width>214</width>
        <height>147</height>
        <xMin>-55</xMin>
        <yMin>392</yMin>
        <xMax>159</xMax>
        <yMax>539</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"A surprise to see you so soon."

"We have not received word that the privateers infesting the area have left."

"You're not here to complain about us withholding that information, surely?"
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>65</y>
                <center>
                  <x>207</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>202</xMin>
                <yMin>65</yMin>
                <xMax>212</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>83</y>
                <center>
                  <x>207</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>202</xMin>
                <yMin>83</yMin>
                <xMax>212</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>I need $300 to pay them off.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>127</y>
                <center>
                  <x>207</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>202</xMin>
                <yMin>127</yMin>
                <xMax>212</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>You lied to me!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>660</x>
        <y>153</y>
        <center>
          <x>757</x>
          <y>203</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>660</xMin>
        <yMin>153</yMin>
        <xMax>854</xMax>
        <yMax>253</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"You've managed to engage them in dialogue?"

"My, my. That is impressive."

"Here you go, good sir. Take these 300 parts and pay them off."

"Best of luck, return when you are finished."

Before you have a chance to respond, you are being led out of the office building.

You prepare your convoy to leave.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Stembolts_RaiderPaying</nodeName>
              <nodeDiscription>Eiffels Inc. has given you the parts you need to pay the privateers infesting the plot of land.

Head over to pay them, or simply kill them.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_Stembolts_MissionAccept</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>659</x>
        <y>381</y>
        <center>
          <x>756</x>
          <y>431</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>659</xMin>
        <yMin>381</yMin>
        <xMax>853</xMax>
        <yMax>481</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"You've managed to engage them in dialogue?"

"My, my. That is impressive."

"Regardless, we don't deal with filthy privateer scum. We have a reputation to uphold!

"Feel free to pay them with your own parts, or, you know, simply kill them all? Isn't that what you folks do?"

"Best of luck, return when you are finished."

Before you have a chance to respond, you are being led out of the office building.

You prepare your convoy to leave.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Stembolts_RaiderPaying</nodeName>
              <nodeDiscription>Eiffels Inc. refused to give you the parts you need to pay the privateers infesting the plot of land.

Head over to pay them with your own parts, or simply kill them.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_Stembolts_MissionAccept</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>254</x>
        <y>571</y>
        <center>
          <x>371</x>
          <y>622.5</y>
        </center>
        <width>234</width>
        <height>103</height>
        <xMin>254</xMin>
        <yMin>571</yMin>
        <xMax>488</xMax>
        <yMax>674</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We did no such thing, we simply neglected to tell you that the deed of the land was in the possession of a group of privateers."

"It must have slipped our mind."

"Regardless, feel free to obtain your stem bolts elsewhere."
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>222</x>
                <y>65</y>
                <center>
                  <x>227</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>222</xMin>
                <yMin>65</yMin>
                <xMax>232</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>222</x>
                <y>83</y>
                <center>
                  <x>227</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>222</xMin>
                <yMin>83</yMin>
                <xMax>232</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Fine... I need $300 to pay them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Stembolts_DiscussPayment</Name>
</Scenario>