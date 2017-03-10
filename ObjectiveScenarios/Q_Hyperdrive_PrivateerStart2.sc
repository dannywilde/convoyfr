<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_Hyperdrive_PrivateerStart2.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>226</x>
        <y>119</y>
        <center>
          <x>301.5</x>
          <y>169.5</y>
        </center>
        <width>151</width>
        <height>101</height>
        <xMin>226</xMin>
        <yMin>119</yMin>
        <xMax>377</xMax>
        <yMax>220</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the coordinates Andy supplied, when he starts saying:

"Just trees and dark, my brother, with real country dark! Just the spot for some of the old ultra-violence!"
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
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>What's the plan?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>201</x>
        <y>446</y>
        <center>
          <x>295</x>
          <y>496</y>
        </center>
        <width>188</width>
        <height>100</height>
        <xMin>201</xMin>
        <yMin>446</yMin>
        <xMax>389</xMax>
        <yMax>546</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Andy chortles with joy after the carnage you've wrought.

"Victims of the modern age, O my brother!"

You drag a survivor from the wrecks.

[0loot]</Text>
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
                <x>176</x>
                <y>65</y>
                <center>
                  <x>181</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>176</xMin>
                <yMin>65</yMin>
                <xMax>186</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Interrogate the survivor.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>565</x>
        <y>19</y>
        <center>
          <x>678.5</x>
          <y>114.5</y>
        </center>
        <width>227</width>
        <height>191</height>
        <xMin>565</xMin>
        <yMin>19</yMin>
        <xMax>792</xMax>
        <yMax>210</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Viddy well, you can see the wretched privateers and their scummy ways just now."

Andy points towards a distant dust-cloud. You discern several vehicles.

"A privateer raiding party, preying on the weak for sport and gain. They deserve to perish.

Killing this group won't solve the infection, however. We need to find the source... and THEN kill all of them!

You tell me, what is wisdom?"</Text>
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
                <x>215</x>
                <y>65</y>
                <center>
                  <x>220</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>65</yMin>
                <xMax>225</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>215</x>
                <y>83</y>
                <center>
                  <x>220</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>83</yMin>
                <xMax>225</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Blast them, ask questions later.</Name>
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
                <x>215</x>
                <y>127</y>
                <center>
                  <x>220</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>127</yMin>
                <xMax>225</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Track them to their base.</Name>
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
                <x>215</x>
                <y>171</y>
                <center>
                  <x>220</x>
                  <y>176</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>171</yMin>
                <xMax>225</xMax>
                <yMax>181</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Radio them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>891</x>
        <y>-493</y>
        <center>
          <x>1069</x>
          <y>-428.5</y>
        </center>
        <width>356</width>
        <height>129</height>
        <xMin>891</xMin>
        <yMin>-493</yMin>
        <xMax>1247</xMax>
        <yMax>-364</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy smiles broadly.

"Itching to fight, eh? Wonderful!

Sounds good to me, just make sure you don't kill all of them before we get a chance to talk!"

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableMineField">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="EnableWarZone">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Start shooting.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1014</x>
        <y>-329</y>
        <center>
          <x>1187</x>
          <y>-264.5</y>
        </center>
        <width>346</width>
        <height>129</height>
        <xMin>1014</xMin>
        <yMin>-329</yMin>
        <xMax>1360</xMax>
        <yMax>-200</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Not so hasty, little brother. Lest you end up like the wrecks of their previous victims.

You can see them there, evidence of your own glazzies! Much more exciting to fight them amidst their previous prey. The hunter becoming the prey like, real horrorshow." </Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableWarZone">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight them amidst the wrecks.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Wait for a more favourable moment to attack them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>470</x>
        <y>494</y>
        <center>
          <x>616.5</x>
          <y>558.5</y>
        </center>
        <width>293</width>
        <height>129</height>
        <xMin>470</xMin>
        <yMin>494</yMin>
        <xMax>763</xMax>
        <yMax>623</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateer is quickly persuaded to reveal the location of the privateer base.

Andy nods approvingly.

"We got what we need. So, shall we kill this blubbering fool?"</Text>
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
                <x>281</x>
                <y>65</y>
                <center>
                  <x>286</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>281</xMin>
                <yMin>65</yMin>
                <xMax>291</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Do the honours, Andy.</Name>
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
                <x>281</x>
                <y>109</y>
                <center>
                  <x>286</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>281</xMin>
                <yMin>109</yMin>
                <xMax>291</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Leave him be.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>939</x>
        <y>409</y>
        <center>
          <x>1036</x>
          <y>460.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>939</xMin>
        <yMin>409</yMin>
        <xMax>1133</xMax>
        <yMax>512</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy produces a knife from his sleeve and swiftly slashes the throat of the privateer.

"Onwards to the base... there is more killing to be done."
</Text>
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
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You learned the location of the privateer base after interrogating a survivor.

Head over to the base and wipe them out.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>927</x>
        <y>606</y>
        <center>
          <x>1024</x>
          <y>657.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>927</xMin>
        <yMin>606</yMin>
        <xMax>1121</xMax>
        <yMax>709</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy looks disappointed, but subjects to your decision regardless.

"Let us make haste to the privateer base. I trust you won't let that filth live!"

The privateer runs off, you doubt he'll survive long without a working vehicle.</Text>
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
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You learned the location of the privateer base after interrogating a survivor.

Head over to the base and wipe them out.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1081</x>
        <y>-160</y>
        <center>
          <x>1178</x>
          <y>-108.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>1081</xMin>
        <yMin>-160</yMin>
        <xMax>1275</xMax>
        <yMax>-57</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy smiles.

"A wise choice, although a bit less exciting than simply killing them.

Onwards we go, then. Towards their filthy nest!"</Text>
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
              <nodeName>Q_Hyperdrive_Tracking2</nodeName>
              <nodeDiscription>Andy pointed you towards some privateers.

You decided to try tracking them to their base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Let's go.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1066</x>
        <y>-17</y>
        <center>
          <x>1145</x>
          <y>34.5</y>
        </center>
        <width>158</width>
        <height>103</height>
        <xMin>1066</xMin>
        <yMin>-17</yMin>
        <xMax>1224</xMax>
        <yMax>86</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy looks slightly puzzled.

"Speaking with the filth as if they were proper folks? A strange choice, but I am interested to see how it pans out.

Show me your diplomacy, friend!"</Text>
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
                <x>146</x>
                <y>65</y>
                <center>
                  <x>151</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>146</xMin>
                <yMin>65</yMin>
                <xMax>156</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>146</x>
                <y>83</y>
                <center>
                  <x>151</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>146</xMin>
                <yMin>83</yMin>
                <xMax>156</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Hail the privateers.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1498</x>
        <y>-199</y>
        <center>
          <x>1573</x>
          <y>-149</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1498</xMin>
        <yMin>-199</yMin>
        <xMax>1648</xMax>
        <yMax>-99</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers don't seem interested in conversation, as they ignore your hails.

They do appear interested in fighting, their vehicles approach your convoy with weapons armed.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Prepare to fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1449</x>
        <y>-52</y>
        <center>
          <x>1549</x>
          <y>52.5</y>
        </center>
        <width>200</width>
        <height>209</height>
        <xMin>1449</xMin>
        <yMin>-52</yMin>
        <xMax>1649</xMax>
        <yMax>157</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The privateers respond to your hails.

"You got some nerve talkin' to us! But thanks for letting us know of your position.

Speak quick, before we plunder and loot that fancy convoy of yours!"</Text>
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
                <x>188</x>
                <y>65</y>
                <center>
                  <x>193</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>65</yMin>
                <xMax>198</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>83</y>
                <center>
                  <x>193</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>83</yMin>
                <xMax>198</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Threaten them.</Name>
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
                <x>188</x>
                <y>127</y>
                <center>
                  <x>193</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>127</yMin>
                <xMax>198</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>12</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>145</y>
                <center>
                  <x>193</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>145</yMin>
                <xMax>198</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Offer to trade.</Name>
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
                <x>188</x>
                <y>189</y>
                <center>
                  <x>193</x>
                  <y>194</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>189</yMin>
                <xMax>198</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Screw it, just attack them.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2031</x>
        <y>51</y>
        <center>
          <x>2175.5</x>
          <y>133.5</y>
        </center>
        <width>289</width>
        <height>165</height>
        <xMin>2031</xMin>
        <yMin>51</yMin>
        <xMax>2320</xMax>
        <yMax>216</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Hrrm.... you have our attention, what is it you're offering and what is it you want?"
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
                <x>277</x>
                <y>65</y>
                <center>
                  <x>282</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>65</yMin>
                <xMax>287</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>16</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>83</y>
                <center>
                  <x>282</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>83</yMin>
                <xMax>287</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>17</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Parts for their base location.</Name>
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
                <x>277</x>
                <y>127</y>
                <center>
                  <x>282</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>127</yMin>
                <xMax>287</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>18</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>145</y>
                <center>
                  <x>282</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>145</yMin>
                <xMax>287</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>19</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Lure them into an ambush.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1755</x>
        <y>109</y>
        <center>
          <x>1830</x>
          <y>159</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1755</xMin>
        <yMin>109</yMin>
        <xMax>1905</xMax>
        <yMax>209</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Are you accusing us of being mere merchants? 

We are no such thing, we are mighty privateers! Prepare to be boarded for your insolence!"

Andy chortles quietly.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1760</x>
        <y>-19</y>
        <center>
          <x>1835</x>
          <y>31</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1760</xMin>
        <yMin>-19</yMin>
        <xMax>1910</xMax>
        <yMax>81</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"You're threatening us? Is this some kind of joke?

Prepare to be boarded!"

Andy chortles quietly.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1794</x>
        <y>-419</y>
        <center>
          <x>1890</x>
          <y>-354.5</y>
        </center>
        <width>192</width>
        <height>129</height>
        <xMin>1794</xMin>
        <yMin>-419</yMin>
        <xMax>1986</xMax>
        <yMax>-290</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Woahhh, that convoy of yours is a lot more armed than we're comfortable with.

We surrender, we'll leave you alone! Leave us be!"

Andy snickers quietly.

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
                <x>180</x>
                <y>65</y>
                <center>
                  <x>185</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>180</xMin>
                <yMin>65</yMin>
                <xMax>190</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>21</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Where is your base?</Name>
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
                <x>180</x>
                <y>109</y>
                <center>
                  <x>185</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>180</xMin>
                <yMin>109</yMin>
                <xMax>190</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Cowards, prepare to die!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2502</x>
        <y>-215</y>
        <center>
          <x>2599.5</x>
          <y>-132.5</y>
        </center>
        <width>195</width>
        <height>165</height>
        <xMin>2502</xMin>
        <yMin>-215</yMin>
        <xMax>2697</xMax>
        <yMax>-50</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Whut? That is... remarkably forward.

To be honest, we've had out share of looting and plundering. If you pay us [0$] we'll be able to start a new life.

In return, we'll happily tell you where the base is."

Andy nods approvingly.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>65</y>
                <center>
                  <x>188</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>65</yMin>
                <xMax>193</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-100</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>83</y>
                <center>
                  <x>188</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>83</yMin>
                <xMax>193</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-200</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>101</y>
                <center>
                  <x>188</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>101</yMin>
                <xMax>193</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Pay them.</Name>
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
                <x>183</x>
                <y>145</y>
                <center>
                  <x>188</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>145</yMin>
                <xMax>193</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We'll just kill you instead.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2483</x>
        <y>17</y>
        <center>
          <x>2558</x>
          <y>67</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2483</xMin>
        <yMin>17</yMin>
        <xMax>2633</xMax>
        <yMax>117</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Whut? Why would we give you the location of our base of operations?

Enough of this nonsense, prepare to be boarded!"

Andy grins widely.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2489</x>
        <y>206</y>
        <center>
          <x>2564</x>
          <y>256</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2489</xMin>
        <yMin>206</yMin>
        <xMax>2639</xMax>
        <yMax>306</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You spew some lies about trading cargo to the privateers, who take the bait and drive right into your ambush.

This should make combat considerably easier.

Andy nods approvingly.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2487</x>
        <y>332</y>
        <center>
          <x>2562</x>
          <y>382</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2487</xMin>
        <yMin>332</yMin>
        <xMax>2637</xMax>
        <yMax>432</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You spew some lies about trading cargo to the privateers, who seem eager to approach, but are wise enough to keep their weapons primed expecting the worst.

No advantage was gained.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Fight!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2799</x>
        <y>-191</y>
        <center>
          <x>2896</x>
          <y>-141</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2799</xMin>
        <yMin>-191</yMin>
        <xMax>2993</xMax>
        <yMax>-91</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You pay the privateers, who give you the coordinates of their former base.

Andy raises an eyebrow.

"Paying the scum? And letting them live? How disappointing.

I suppose your diplomacy was impressive, though. Let us head to the privateer base and kill 'em all! No more diplomacy!"</Text>
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
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You obtained the privateer base location by giving some of them enough parts to start a new life.

Head over to the base and kill them all.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2063</x>
        <y>-465</y>
        <center>
          <x>2138.5</x>
          <y>-400.5</y>
        </center>
        <width>151</width>
        <height>129</height>
        <xMin>2063</xMin>
        <yMin>-465</yMin>
        <xMax>2214</xMax>
        <yMax>-336</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"We'll tell you, we'll tell you. Just leave us be!"

The raiders give you the location of your base.

Andy nods approvingly, then asks: "Surely, we'll kill them anyway?"
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
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>22</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Naturally.</Name>
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
                <x>139</x>
                <y>109</y>
                <center>
                  <x>144</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>109</yMin>
                <xMax>149</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>24</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Leave them be.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2298</x>
        <y>-594</y>
        <center>
          <x>2373</x>
          <y>-544</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2298</xMin>
        <yMin>-594</yMin>
        <xMax>2448</xMax>
        <yMax>-494</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to catch up to the fleeing privateers and easily dispatch them.

[0loot]</Text>
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
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>23</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Excellent.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2521</x>
        <y>-622</y>
        <center>
          <x>2618</x>
          <y>-572</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2521</xMin>
        <yMin>-622</yMin>
        <xMax>2715</xMax>
        <yMax>-522</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy applauds your efforts.

"Onwards to the privateer base, O my brother!"</Text>
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
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You bullied some privateers into revealing the location of their base, before promptly executing them.

Head over to the base and wipe out the rest of them.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2310</x>
        <y>-453</y>
        <center>
          <x>2407</x>
          <y>-403</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2310</xMin>
        <yMin>-453</yMin>
        <xMax>2504</xMax>
        <yMax>-353</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy looks disappointed.

You enter the coordinates of the raider base to your map.</Text>
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
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>You bullied some privateers into revealing the location of their base, then decided to let them live.

Head over to the privateer base and wipe it out.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_PrivateerStart2</Name>
</Scenario>