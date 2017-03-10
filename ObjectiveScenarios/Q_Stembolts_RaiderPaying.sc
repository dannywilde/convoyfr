<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Stembolts_RaiderPaying.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>309</x>
        <y>371</y>
        <center>
          <x>384.5</x>
          <y>435.5</y>
        </center>
        <width>151</width>
        <height>129</height>
        <xMin>309</xMin>
        <yMin>371</yMin>
        <xMax>460</xMax>
        <yMax>500</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You return to the privateer base.
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
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Contact them.</Name>
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
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Attack them!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>316</x>
        <y>794</y>
        <center>
          <x>391</x>
          <y>844</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>316</xMin>
        <yMin>794</yMin>
        <xMax>466</xMax>
        <yMax>894</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You destroy every last privateer vehicle and blast their base to smithereens.

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
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Good...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>772</x>
        <y>571</y>
        <center>
          <x>847</x>
          <y>621</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>772</xMin>
        <yMin>571</yMin>
        <xMax>922</xMax>
        <yMax>671</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>They weren't expecting you to attack them, considering you went to collect their payment, leaving you at an advantage in the following combat.</Text>
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
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>579</x>
        <y>211</y>
        <center>
          <x>679</x>
          <y>306.5</y>
        </center>
        <width>200</width>
        <height>191</height>
        <xMin>579</xMin>
        <yMin>211</yMin>
        <xMax>779</xMax>
        <yMax>402</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Welcome back, errand boys!

We're ready to leave if you got the cash!"</Text>
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
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Pay them [$].</Name>
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
                <y>109</y>
                <center>
                  <x>193</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>109</yMin>
                <xMax>198</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
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
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Eiffels Inc. refused to pay.</Name>
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
                <y>171</y>
                <center>
                  <x>193</x>
                  <y>176</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>171</yMin>
                <xMax>198</xMax>
                <yMax>181</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Prepare to die!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1033</x>
        <y>7</y>
        <center>
          <x>1130</x>
          <y>57</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>1033</xMin>
        <yMin>7</yMin>
        <xMax>1227</xMax>
        <yMax>107</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Awwhh yeah, this business thing pays a lot better than pillaging.

Thanks a bunch, chumps. We'll be leaving now!"

The privateers pack up their things and leave.

You should return to Eiffels Inc. to report your success.</Text>
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
              <nodeName>Q_Stembolts_SuccessPrivateersPaid2</nodeName>
              <nodeDiscription>The privateers have been paid to leave the location Eiffels Inc. covets.

Return to their office to report your success and receive your stem bolts.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Stembolts</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>911</x>
        <y>211</y>
        <center>
          <x>996.5</x>
          <y>275.5</y>
        </center>
        <width>171</width>
        <height>129</height>
        <xMin>911</xMin>
        <yMin>211</yMin>
        <xMax>1082</xMax>
        <yMax>340</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Well damn... and here we were all enjoying this business thing.

So what about you? You want to pay us like fine respectable business folks?"</Text>
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
                <x>159</x>
                <y>65</y>
                <center>
                  <x>164</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>159</xMin>
                <yMin>65</yMin>
                <xMax>169</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Very well... [$]</Name>
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
                <x>159</x>
                <y>109</y>
                <center>
                  <x>164</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>159</xMin>
                <yMin>109</yMin>
                <xMax>169</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Nope, prepare to die.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>923</x>
        <y>410</y>
        <center>
          <x>998</x>
          <y>460</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>923</xMin>
        <yMin>410</yMin>
        <xMax>1073</xMax>
        <yMax>510</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Well damn... so much for being all business like.

Let's go pillage these fools, boys!"

Several privateer vehicles move out to engage you.</Text>
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
        <x>1164</x>
        <y>309</y>
        <center>
          <x>1239</x>
          <y>359</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1164</xMin>
        <yMin>309</yMin>
        <xMax>1314</xMax>
        <yMax>409</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Having told the privateers you weren't going to pay them, you lack the element of surprise in the following combat.</Text>
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
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>557</x>
        <y>729</y>
        <center>
          <x>654</x>
          <y>779</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>557</xMin>
        <yMin>729</yMin>
        <xMax>751</xMax>
        <yMax>829</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You should return to Eiffels Inc. to report your success.</Text>
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
              <nodeName>Q_Stembolts_SuccessPrivateersDead</nodeName>
              <nodeDiscription>The privateer base has been destroyed.

Return to the Eiffels Inc. office to report your success.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Stembolts</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Stembolts_RaiderPaying</Name>
</Scenario>