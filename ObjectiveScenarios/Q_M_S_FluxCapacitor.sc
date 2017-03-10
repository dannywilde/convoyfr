<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveName>Flux Capacitor</objectiveName>
  <objectiveDiscription>A local professor on Omek Prime should have access to a Flux Capacitor. Finding him might allow you to acquire one.</objectiveDiscription>
  <objectiveMainDiscription>The Flux Capacitor consists of a rectangle-shaped compartment with three flashing Geissler tubes. It requires 1.21 gigawatts of electrical power to operate.

Omek Prime has a local professor who should have access to a Flux Capacitor, finding him might allow you to acquire this item.</objectiveMainDiscription>
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_M_S_FluxCapacitor.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-645</x>
        <y>-264</y>
        <position>
          <x>-645</x>
          <y>-264</y>
        </position>
        <center>
          <x>-511</x>
          <y>-172.5</y>
        </center>
        <min>
          <x>-645</x>
          <y>-264</y>
        </min>
        <max>
          <x>-377</x>
          <y>-81</y>
        </max>
        <width>268</width>
        <height>183</height>
        <size>
          <x>268</x>
          <y>183</y>
        </size>
        <xMin>-645</xMin>
        <yMin>-264</yMin>
        <xMax>-377</xMax>
        <yMax>-81</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You arrive at the professor's laboratory.

The plot around it is littered with various bits of machinery, presumably discarded experiments, whilst the laboratory itself appears to be an old hangar.</Text>
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
                <x>256</x>
                <y>65</y>
                <position>
                  <x>256</x>
                  <y>65</y>
                </position>
                <center>
                  <x>261</x>
                  <y>70</y>
                </center>
                <min>
                  <x>256</x>
                  <y>65</y>
                </min>
                <max>
                  <x>266</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>256</xMin>
                <yMin>65</yMin>
                <xMax>266</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>8</ToDialog>
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
                <x>256</x>
                <y>83</y>
                <position>
                  <x>256</x>
                  <y>83</y>
                </position>
                <center>
                  <x>261</x>
                  <y>88</y>
                </center>
                <min>
                  <x>256</x>
                  <y>83</y>
                </min>
                <max>
                  <x>266</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>256</xMin>
                <yMin>83</yMin>
                <xMax>266</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>4</ToDialog>
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
                <x>256</x>
                <y>101</y>
                <position>
                  <x>256</x>
                  <y>101</y>
                </position>
                <center>
                  <x>261</x>
                  <y>106</y>
                </center>
                <min>
                  <x>256</x>
                  <y>101</y>
                </min>
                <max>
                  <x>266</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>256</xMin>
                <yMin>101</yMin>
                <xMax>266</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>5</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Approach the laboratory.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-454</x>
        <y>265</y>
        <position>
          <x>-454</x>
          <y>265</y>
        </position>
        <center>
          <x>-379</x>
          <y>315</y>
        </center>
        <min>
          <x>-454</x>
          <y>265</y>
        </min>
        <max>
          <x>-304</x>
          <y>365</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>-454</xMin>
        <yMin>265</yMin>
        <xMax>-304</xMax>
        <yMax>365</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You defeat the final raider vehicle that was attacking the laboratory.

[0loot]

A white-haired man wearing a lab coat comes running out, approaching your convoy.</Text>
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
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Let's hear it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-168</x>
        <y>-315</y>
        <position>
          <x>-168</x>
          <y>-315</y>
        </position>
        <center>
          <x>5.5</x>
          <y>-228.5</y>
        </center>
        <min>
          <x>-168</x>
          <y>-315</y>
        </min>
        <max>
          <x>179</x>
          <y>-142</y>
        </max>
        <width>347</width>
        <height>173</height>
        <size>
          <x>347</x>
          <y>173</y>
        </size>
        <xMin>-168</xMin>
        <yMin>-315</yMin>
        <xMax>179</xMax>
        <yMax>-142</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you head over to the laboratory, a white-haired distraught looking man walks out. 

He looks startled as he sees you, adjusts his glasses and exclaims frantically:

"What? How? You found me?! I'm warning you, I've got mighty science weapon things! I'm not afraid to use them!"</Text>
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
                <x>335</x>
                <y>65</y>
                <position>
                  <x>335</x>
                  <y>65</y>
                </position>
                <center>
                  <x>340</x>
                  <y>70</y>
                </center>
                <min>
                  <x>335</x>
                  <y>65</y>
                </min>
                <max>
                  <x>345</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>335</xMin>
                <yMin>65</yMin>
                <xMax>345</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Calm him down.</Name>
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
                <x>335</x>
                <y>109</y>
                <position>
                  <x>335</x>
                  <y>109</y>
                </position>
                <center>
                  <x>340</x>
                  <y>114</y>
                </center>
                <min>
                  <x>335</x>
                  <y>109</y>
                </min>
                <max>
                  <x>345</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>335</xMin>
                <yMin>109</yMin>
                <xMax>345</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>16</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Call his bluff.</Name>
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
                <x>335</x>
                <y>153</y>
                <position>
                  <x>335</x>
                  <y>153</y>
                </position>
                <center>
                  <x>340</x>
                  <y>158</y>
                </center>
                <min>
                  <x>335</x>
                  <y>153</y>
                </min>
                <max>
                  <x>345</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>335</xMin>
                <yMin>153</yMin>
                <xMax>345</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>24</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Shoot him.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>595</x>
        <y>-116</y>
        <position>
          <x>595</x>
          <y>-116</y>
        </position>
        <center>
          <x>698</x>
          <y>-42.5</y>
        </center>
        <min>
          <x>595</x>
          <y>-116</y>
        </min>
        <max>
          <x>801</x>
          <y>31</y>
        </max>
        <width>206</width>
        <height>147</height>
        <size>
          <x>206</x>
          <y>147</y>
        </size>
        <xMin>595</xMin>
        <yMin>-116</yMin>
        <xMax>801</xMax>
        <yMax>31</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"So... a Flux Capacitor you say?

I've been experimenting on those things, I have. Trying to assemble one to a regular road vehicle. The possibilities are endless!

Unfortunately, because the Capacitor needs such a high energy input I made a... rather unfortunate deal with some local arms dealers.

It didn't go too well, they're out for my head right now... but you look like a capable bunch! If you go ahead and take care of those nasty privateer arms dealers for me, I'll get you that Flux Capacitor for your spaceship."
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Armsdealers</nodeName>
              <nodeDiscription>The professor, who didn't bother mentioning his name, told you he can get you a Flux Capacitor if you help him with his troubles.

Apparently he made a deal with some privateer arms dealers, who he wants taken care of.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Right, Ill help you.</Name>
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
                <x>194</x>
                <y>109</y>
                <position>
                  <x>194</x>
                  <y>109</y>
                </position>
                <center>
                  <x>199</x>
                  <y>114</y>
                </center>
                <min>
                  <x>194</x>
                  <y>109</y>
                </min>
                <max>
                  <x>204</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>194</xMin>
                <yMin>109</yMin>
                <xMax>204</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>21</ToDialog>
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
                <x>194</x>
                <y>127</y>
                <position>
                  <x>194</x>
                  <y>127</y>
                </position>
                <center>
                  <x>199</x>
                  <y>132</y>
                </center>
                <min>
                  <x>194</x>
                  <y>127</y>
                </min>
                <max>
                  <x>204</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>194</xMin>
                <yMin>127</yMin>
                <xMax>204</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>22</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Or I'll just take it from you.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-182</x>
        <y>-442</y>
        <position>
          <x>-182</x>
          <y>-442</y>
        </position>
        <center>
          <x>-107</x>
          <y>-392</y>
        </center>
        <min>
          <x>-182</x>
          <y>-442</y>
        </min>
        <max>
          <x>-32</x>
          <y>-342</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>-182</xMin>
        <yMin>-442</yMin>
        <xMax>-32</xMax>
        <yMax>-342</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you approach the laboratory, you hear the unmistakable sounds of combat.

It appears several raider vehicles are attacking it.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Intervene!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-161</x>
        <y>175</y>
        <position>
          <x>-161</x>
          <y>175</y>
        </position>
        <center>
          <x>-57.5</x>
          <y>226.5</y>
        </center>
        <min>
          <x>-161</x>
          <y>175</y>
        </min>
        <max>
          <x>46</x>
          <y>278</y>
        </max>
        <width>207</width>
        <height>103</height>
        <size>
          <x>207</x>
          <y>103</y>
        </size>
        <xMin>-161</xMin>
        <yMin>175</yMin>
        <xMax>46</xMax>
        <yMax>278</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Many thanks!

I struck an unfortunate deal with some armsdealers, but suffered a slight delay in regards to... payment... so they decided to take matters in their own hands.

Unfortunately, I sadly lack mighty science weapons to fight for myself... I should remedy that.

So, what can I help you with?"</Text>
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
                <x>195</x>
                <y>65</y>
                <position>
                  <x>195</x>
                  <y>65</y>
                </position>
                <center>
                  <x>200</x>
                  <y>70</y>
                </center>
                <min>
                  <x>195</x>
                  <y>65</y>
                </min>
                <max>
                  <x>205</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>65</yMin>
                <xMax>205</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>7</ToDialog>
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
                <x>195</x>
                <y>83</y>
                <position>
                  <x>195</x>
                  <y>83</y>
                </position>
                <center>
                  <x>200</x>
                  <y>88</y>
                </center>
                <min>
                  <x>195</x>
                  <y>83</y>
                </min>
                <max>
                  <x>205</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>83</yMin>
                <xMax>205</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>17</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ask about a Flux Capacitor.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>245</x>
        <y>-437</y>
        <position>
          <x>245</x>
          <y>-437</y>
        </position>
        <center>
          <x>320.5</x>
          <y>-376.5</y>
        </center>
        <min>
          <x>245</x>
          <y>-437</y>
        </min>
        <max>
          <x>396</x>
          <y>-316</y>
        </max>
        <width>151</width>
        <height>121</height>
        <size>
          <x>151</x>
          <y>121</y>
        </size>
        <xMin>245</xMin>
        <yMin>-437</yMin>
        <xMax>396</xMax>
        <yMax>-316</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After explaining that you're stranded on Omek Prime and are in need of a Flux Capacitor, the professor looks a lot less panicked, although still slightly erratic.

"I see! I see! No revenge squad out to get me for lack of payment. Excellent!

A good thing too, you might be surprised to learn that I was, in fact, bluffing about my mighty science weapons things..."</Text>
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
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>7</ToDialog>
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
                <x>139</x>
                <y>83</y>
                <position>
                  <x>139</x>
                  <y>83</y>
                </position>
                <center>
                  <x>144</x>
                  <y>88</y>
                </center>
                <min>
                  <x>139</x>
                  <y>83</y>
                </min>
                <max>
                  <x>149</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>83</yMin>
                <xMax>149</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>17</ToDialog>
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
                <x>139</x>
                <y>101</y>
                <position>
                  <x>139</x>
                  <y>101</y>
                </position>
                <center>
                  <x>144</x>
                  <y>106</y>
                </center>
                <min>
                  <x>139</x>
                  <y>101</y>
                </min>
                <max>
                  <x>149</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>101</yMin>
                <xMax>149</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>You don't say...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>479</x>
        <y>-500</y>
        <position>
          <x>479</x>
          <y>-500</y>
        </position>
        <center>
          <x>593.5</x>
          <y>-426.5</y>
        </center>
        <min>
          <x>479</x>
          <y>-500</y>
        </min>
        <max>
          <x>708</x>
          <y>-353</y>
        </max>
        <width>229</width>
        <height>147</height>
        <size>
          <x>229</x>
          <y>147</y>
        </size>
        <xMin>479</xMin>
        <yMin>-500</yMin>
        <xMax>708</xMax>
        <yMax>-353</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"So... a Flux Capacitor you say!

You came to the right place, I'm quite an expert on those babies. I can build you one suitable for a spaceship, but I haven't got everything I need.

In order to generate the required 1.21 gigawatts I'll need a highly volatile energy source, which I haven't got lying around... but I know where to find some!

Only T.O.R.V.A.K. has access to energy sources of this magnitude. It's not as if we could try to harness the power of nature or anything. So if you could acquire an Energy Pylon and bring it back, I can fix you up with a Flux Capacitor and use the excess energy for my own projects!

We have a deal, yes?"</Text>
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
                <x>217</x>
                <y>65</y>
                <position>
                  <x>217</x>
                  <y>65</y>
                </position>
                <center>
                  <x>222</x>
                  <y>70</y>
                </center>
                <min>
                  <x>217</x>
                  <y>65</y>
                </min>
                <max>
                  <x>227</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>217</xMin>
                <yMin>65</yMin>
                <xMax>227</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
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
                <x>217</x>
                <y>83</y>
                <position>
                  <x>217</x>
                  <y>83</y>
                </position>
                <center>
                  <x>222</x>
                  <y>88</y>
                </center>
                <min>
                  <x>217</x>
                  <y>83</y>
                </min>
                <max>
                  <x>227</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>217</xMin>
                <yMin>83</yMin>
                <xMax>227</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Very well.</Name>
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
                <x>217</x>
                <y>127</y>
                <position>
                  <x>217</x>
                  <y>127</y>
                </position>
                <center>
                  <x>222</x>
                  <y>132</y>
                </center>
                <min>
                  <x>217</x>
                  <y>127</y>
                </min>
                <max>
                  <x>227</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>217</xMin>
                <yMin>127</yMin>
                <xMax>227</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Or I threaten you to make one.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-169</x>
        <y>-634</y>
        <position>
          <x>-169</x>
          <y>-634</y>
        </position>
        <center>
          <x>-65.5</x>
          <y>-582.5</y>
        </center>
        <min>
          <x>-169</x>
          <y>-634</y>
        </min>
        <max>
          <x>38</x>
          <y>-531</y>
        </max>
        <width>207</width>
        <height>103</height>
        <size>
          <x>207</x>
          <y>103</y>
        </size>
        <xMin>-169</xMin>
        <yMin>-634</yMin>
        <xMax>38</xMax>
        <yMax>-531</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You enter the laboratory, which is filled with machines and experiments making all manner of sounds.

Amidst the chaos the professor is running around, pulling levers, adjusting dials and scribbling notes whilst mumbling to himself.

He notices you, and approaches.

"Hello! My name is... professor.

Used to have a different name, but I forgot. Hardly any use for a name anyway. Ha-hah!"</Text>
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
                <x>195</x>
                <y>65</y>
                <position>
                  <x>195</x>
                  <y>65</y>
                </position>
                <center>
                  <x>200</x>
                  <y>70</y>
                </center>
                <min>
                  <x>195</x>
                  <y>65</y>
                </min>
                <max>
                  <x>205</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>65</yMin>
                <xMax>205</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>7</ToDialog>
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
                <x>195</x>
                <y>83</y>
                <position>
                  <x>195</x>
                  <y>83</y>
                </position>
                <center>
                  <x>200</x>
                  <y>88</y>
                </center>
                <min>
                  <x>195</x>
                  <y>83</y>
                </min>
                <max>
                  <x>205</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>83</yMin>
                <xMax>205</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>17</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ask about a Flux Capacitor.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>778</x>
        <y>-400</y>
        <position>
          <x>778</x>
          <y>-400</y>
        </position>
        <center>
          <x>877.5</x>
          <y>-348.5</y>
        </center>
        <min>
          <x>778</x>
          <y>-400</y>
        </min>
        <max>
          <x>977</x>
          <y>-297</y>
        </max>
        <width>199</width>
        <height>103</height>
        <size>
          <x>199</x>
          <y>103</y>
        </size>
        <xMin>778</xMin>
        <yMin>-400</yMin>
        <xMax>977</xMax>
        <yMax>-297</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Quite right. I did mention I lacked super science weapons.

The only flaw in your plan, however, is the aforementioned lack of energy sources I have lying around... Afraid threatening me won't accomplish anything.

Except perhaps some latent anger management issues."
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
                <x>187</x>
                <y>65</y>
                <position>
                  <x>187</x>
                  <y>65</y>
                </position>
                <center>
                  <x>192</x>
                  <y>70</y>
                </center>
                <min>
                  <x>187</x>
                  <y>65</y>
                </min>
                <max>
                  <x>197</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>187</xMin>
                <yMin>65</yMin>
                <xMax>197</xMax>
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
                <x>187</x>
                <y>83</y>
                <position>
                  <x>187</x>
                  <y>83</y>
                </position>
                <center>
                  <x>192</x>
                  <y>88</y>
                </center>
                <min>
                  <x>187</x>
                  <y>83</y>
                </min>
                <max>
                  <x>197</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>187</xMin>
                <yMin>83</yMin>
                <xMax>197</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Right... the energy source.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1029</x>
        <y>-694</y>
        <position>
          <x>1029</x>
          <y>-694</y>
        </position>
        <center>
          <x>1126</x>
          <y>-629.5</y>
        </center>
        <min>
          <x>1029</x>
          <y>-694</y>
        </min>
        <max>
          <x>1223</x>
          <y>-565</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>1029</xMin>
        <yMin>-694</yMin>
        <xMax>1223</xMax>
        <yMax>-565</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Ha-hah! Wonderful!

Okay. So, I know of a T.O.R.V.A.K. Pylon facility which will suffice! I'll enter the coordinates to your map and you can head over and acquire one... that should provide plenty of energy!

Great! Excellent! You had best be on your way then, okay, goodbye!"

The professor heads back inside the laboratory frantically.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid</nodeName>
              <nodeDiscription>The professor, whose name you didn't quite catch, told you he needs a large energy source to create a Flux Capacitor.

He told you to acquire one at a T.O.R.V.A.K. Pylon Facility.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
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
                <x>182</x>
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>12</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Follow him inside.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1063</x>
        <y>-485</y>
        <position>
          <x>1063</x>
          <y>-485</y>
        </position>
        <center>
          <x>1160</x>
          <y>-420.5</y>
        </center>
        <min>
          <x>1063</x>
          <y>-485</y>
        </min>
        <max>
          <x>1257</x>
          <y>-356</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>1063</xMin>
        <yMin>-485</yMin>
        <xMax>1257</xMax>
        <yMax>-356</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Ha-hah! Wonderful!

Okay. Unfortunately I don't know of any T.O.R.V.A.K. facility that has access to amount of energy I need.

However! There is a checkpoint not too far from here that might be persuaded to give you more information regarding these matters! I'll tell you where they are, yes? And you go collect the energy source!

Great! Excellent! You had best be on your way then, okay, goodbye!"

The professor heads back inside the laboratory frantically.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Checkpoint</nodeName>
              <nodeDiscription>The professor, who didn't bother to mention his name, told you he needs a large energy source to create a Flux Capacitor.

He suspected T.O.R.V.A.K. would have them, but did not know where to go looking.

He suggested convincing a T.O.R.V.A.K. checkpoint to tell you where to locate them.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Move out!</Name>
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
                <x>182</x>
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Follow him inside.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1379</x>
        <y>-625</y>
        <position>
          <x>1379</x>
          <y>-625</y>
        </position>
        <center>
          <x>1476</x>
          <y>-551.5</y>
        </center>
        <min>
          <x>1379</x>
          <y>-625</y>
        </min>
        <max>
          <x>1573</x>
          <y>-478</y>
        </max>
        <width>194</width>
        <height>147</height>
        <size>
          <x>194</x>
          <y>147</y>
        </size>
        <xMin>1379</xMin>
        <yMin>-625</yMin>
        <xMax>1573</xMax>
        <yMax>-478</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You enter the laboratory, which is filled with machines and experiments making all manner of sounds.

Amidst the chaos the professor is running around, pulling levers, adjusting dials and scribbling notes whilst mumbling to himself.

He doesn't appear to have taken notice of you.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid</nodeName>
              <nodeDiscription>The professor, whose name you didn't quite catch, told you he needs a large energy source to create a Flux Capacitor.

He told you to acquire one at a T.O.R.V.A.K. Pylon Facility.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Leave.</Name>
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
                <x>182</x>
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Speak to him.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1378</x>
        <y>-455</y>
        <position>
          <x>1378</x>
          <y>-455</y>
        </position>
        <center>
          <x>1475</x>
          <y>-390.5</y>
        </center>
        <min>
          <x>1378</x>
          <y>-455</y>
        </min>
        <max>
          <x>1572</x>
          <y>-326</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>1378</xMin>
        <yMin>-455</yMin>
        <xMax>1572</xMax>
        <yMax>-326</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You enter the laboratory, which is filled with machines and experiments making all manner of sounds.

Amidst the chaos the professor is running around, pulling levers, adjusting dials and scribbling notes whilst mumbling to himself.

He doesn't appear to have taken notice of you.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Checkpoint</nodeName>
              <nodeDiscription>The professor, who didn't bother to mention his name, told you he needs a large energy source to create a Flux Capacitor.

He suspected T.O.R.V.A.K. would have them, but did not know where to go looking.

He suggested convincing a T.O.R.V.A.K. checkpoint to tell you where to locate them.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Leave.</Name>
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
                <x>182</x>
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Speak to him.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1751</x>
        <y>-412</y>
        <position>
          <x>1751</x>
          <y>-412</y>
        </position>
        <center>
          <x>1848</x>
          <y>-362</y>
        </center>
        <min>
          <x>1751</x>
          <y>-412</y>
        </min>
        <max>
          <x>1945</x>
          <y>-312</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>1751</xMin>
        <yMin>-412</yMin>
        <xMax>1945</xMax>
        <yMax>-312</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The professor looks confused as he spots you.

"Back so soon? Great! Give me the energy source!

You don't have it? Right... it was only a minute. Why are you here then? You should be on your way!

Onwards! Gogo! I've got work to do! Goodbye! Lovely seeing you!"</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Checkpoint</nodeName>
              <nodeDiscription>The professor, who didn't bother to mention his name, told you he needs a large energy source to create a Flux Capacitor.

He suspected T.O.R.V.A.K. would have them, but did not know where to go looking.

He suggested convincing a T.O.R.V.A.K. checkpoint to tell you where to locate them.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Let's go, then.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1664</x>
        <y>-590</y>
        <position>
          <x>1664</x>
          <y>-590</y>
        </position>
        <center>
          <x>1761</x>
          <y>-540</y>
        </center>
        <min>
          <x>1664</x>
          <y>-590</y>
        </min>
        <max>
          <x>1858</x>
          <y>-490</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>1664</xMin>
        <yMin>-590</yMin>
        <xMax>1858</xMax>
        <yMax>-490</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The professor looks confused as he spots you.

"Back so soon? Great! Give me the energy source!

You don't have it? Right... it was only a minute. Why are you here then? You should be on your way!

Onwards! Gogo! I've got work to do! Goodbye! Lovely seeing you!"</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid</nodeName>
              <nodeDiscription>The professor, whose name you didn't quite catch, told you he needs a large energy source to create a Flux Capacitor.

He told you to acquire one at a T.O.R.V.A.K. Pylon Facility.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Let's go, then.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>236</x>
        <y>-286</y>
        <position>
          <x>236</x>
          <y>-286</y>
        </position>
        <center>
          <x>339.5</x>
          <y>-225.5</y>
        </center>
        <min>
          <x>236</x>
          <y>-286</y>
        </min>
        <max>
          <x>443</x>
          <y>-165</y>
        </max>
        <width>207</width>
        <height>121</height>
        <size>
          <x>207</x>
          <y>121</y>
        </size>
        <xMin>236</xMin>
        <yMin>-286</yMin>
        <xMax>443</xMax>
        <yMax>-165</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Curses! You are cleverer than I anticipated.

You were right in thinking that I did not, in fact, have super science weapons.

I subject to your mercy! Take everything you want! Don't harm my experiments!"</Text>
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
                <x>195</x>
                <y>65</y>
                <position>
                  <x>195</x>
                  <y>65</y>
                </position>
                <center>
                  <x>200</x>
                  <y>70</y>
                </center>
                <min>
                  <x>195</x>
                  <y>65</y>
                </min>
                <max>
                  <x>205</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>65</yMin>
                <xMax>205</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>7</ToDialog>
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
                <x>195</x>
                <y>83</y>
                <position>
                  <x>195</x>
                  <y>83</y>
                </position>
                <center>
                  <x>200</x>
                  <y>88</y>
                </center>
                <min>
                  <x>195</x>
                  <y>83</y>
                </min>
                <max>
                  <x>205</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>83</yMin>
                <xMax>205</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>17</ToDialog>
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
                <x>195</x>
                <y>101</y>
                <position>
                  <x>195</x>
                  <y>101</y>
                </position>
                <center>
                  <x>200</x>
                  <y>106</y>
                </center>
                <min>
                  <x>195</x>
                  <y>101</y>
                </min>
                <max>
                  <x>205</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>195</xMin>
                <yMin>101</yMin>
                <xMax>205</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ask about a Flux Capacitor.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>580</x>
        <y>-271</y>
        <position>
          <x>580</x>
          <y>-271</y>
        </position>
        <center>
          <x>655.5</x>
          <y>-221</y>
        </center>
        <min>
          <x>580</x>
          <y>-271</y>
        </min>
        <max>
          <x>731</x>
          <y>-171</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>580</xMin>
        <yMin>-271</yMin>
        <xMax>731</xMax>
        <yMax>-171</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"So... a Flux Capacitor you say!

Came to the right place, you did. Quite an expert on those babies, if I might say so myself.

I have one lying around, actually! You could buy it off me, no problem! Afraid it is custom made, though, so you'll need my help to actually install it on your spaceship... little bit of insurance, you might say, it stops people simply killing me and stealing it! Ha-hah!

You'd be surprised how often people try that."</Text>
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
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>18</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Right...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>912</x>
        <y>-270</y>
        <position>
          <x>912</x>
          <y>-270</y>
        </position>
        <center>
          <x>1052.5</x>
          <y>-183.5</y>
        </center>
        <min>
          <x>912</x>
          <y>-270</y>
        </min>
        <max>
          <x>1193</x>
          <y>-97</y>
        </max>
        <width>281</width>
        <height>173</height>
        <size>
          <x>281</x>
          <y>173</y>
        </size>
        <xMin>912</xMin>
        <yMin>-270</yMin>
        <xMax>1193</xMax>
        <yMax>-97</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"So yes! Got one for sale! Only $500!

I'll go get it! Pleasure doing business with you."</Text>
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
                <x>269</x>
                <y>65</y>
                <position>
                  <x>269</x>
                  <y>65</y>
                </position>
                <center>
                  <x>274</x>
                  <y>70</y>
                </center>
                <min>
                  <x>269</x>
                  <y>65</y>
                </min>
                <max>
                  <x>279</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>269</xMin>
                <yMin>65</yMin>
                <xMax>279</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>19</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-500</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Buy it. [$]</Name>
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
                <x>269</x>
                <y>109</y>
                <position>
                  <x>269</x>
                  <y>109</y>
                </position>
                <center>
                  <x>274</x>
                  <y>114</y>
                </center>
                <min>
                  <x>269</x>
                  <y>109</y>
                </min>
                <max>
                  <x>279</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>269</xMin>
                <yMin>109</yMin>
                <xMax>279</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We lack the parts.</Name>
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
                <x>269</x>
                <y>153</y>
                <position>
                  <x>269</x>
                  <y>153</y>
                </position>
                <center>
                  <x>274</x>
                  <y>158</y>
                </center>
                <min>
                  <x>269</x>
                  <y>153</y>
                </min>
                <max>
                  <x>279</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>269</xMin>
                <yMin>153</yMin>
                <xMax>279</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>30</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Could we come to another arrangement?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1668</x>
        <y>-273</y>
        <position>
          <x>1668</x>
          <y>-273</y>
        </position>
        <center>
          <x>1743</x>
          <y>-223</y>
        </center>
        <min>
          <x>1668</x>
          <y>-273</y>
        </min>
        <max>
          <x>1818</x>
          <y>-173</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>1668</xMin>
        <yMin>-273</yMin>
        <xMax>1818</xMax>
        <yMax>-173</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The professor scuttles into his laboratory and emerges shortly after, followed by a floating drone carrying a large cargo crate.

"Right! Load this baby up and let's head to your spaceship! I'll fix that baby up real good!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Great, let's go!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1255</x>
        <y>-313</y>
        <position>
          <x>1255</x>
          <y>-313</y>
        </position>
        <center>
          <x>1395.5</x>
          <y>-208.5</y>
        </center>
        <min>
          <x>1255</x>
          <y>-313</y>
        </min>
        <max>
          <x>1536</x>
          <y>-104</y>
        </max>
        <width>281</width>
        <height>209</height>
        <size>
          <x>281</x>
          <y>209</y>
        </size>
        <xMin>1255</xMin>
        <yMin>-313</yMin>
        <xMax>1536</xMax>
        <yMax>-104</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"You do? That is mighty unfortunate!

I'm a man of science, no philantropist... come back when you have the parts? Yes? I'll keep it ready until you head back.

What did we agree upon again? $300 right? No time to keep chatting, got work to do! See you later! Goodbye!"

The professor scrambles back inside his laboratory and shuts the door.

You'll have to come back later.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Buying1</nodeName>
              <nodeDiscription>The professor, who didn't bother introducing himself, told you he can sell you a Flux Capacitor for 500 parts. He seems very absent-minded, however, so he might forget how much he charged when you head back.

Return to his laboratory when you've collected enough.</nodeDiscription>
              <pos>Distance</pos>
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>Alright, I'll be back.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>269</x>
                <y>109</y>
                <position>
                  <x>269</x>
                  <y>109</y>
                </position>
                <center>
                  <x>274</x>
                  <y>114</y>
                </center>
                <min>
                  <x>269</x>
                  <y>109</y>
                </min>
                <max>
                  <x>279</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>269</xMin>
                <yMin>109</yMin>
                <xMax>279</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>19</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Yes, that's right. [$]</Name>
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
                <x>269</x>
                <y>153</y>
                <position>
                  <x>269</x>
                  <y>153</y>
                </position>
                <center>
                  <x>274</x>
                  <y>158</y>
                </center>
                <min>
                  <x>269</x>
                  <y>153</y>
                </min>
                <max>
                  <x>279</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>269</xMin>
                <yMin>153</yMin>
                <xMax>279</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>30</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Could we come to another arrangement?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>898</x>
        <y>-47</y>
        <position>
          <x>898</x>
          <y>-47</y>
        </position>
        <center>
          <x>1023</x>
          <y>3</y>
        </center>
        <min>
          <x>898</x>
          <y>-47</y>
        </min>
        <max>
          <x>1148</x>
          <y>53</y>
        </max>
        <width>250</width>
        <height>100</height>
        <size>
          <x>250</x>
          <y>100</y>
        </size>
        <xMin>898</xMin>
        <yMin>-47</yMin>
        <xMax>1148</xMax>
        <yMax>53</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Quite right. I did mention I lacked super science weapons.

The only flaw in your plan, however, is the aforementioned lack of energy sources I have lying around... Afraid threatening me won't accomplish anything.

Except perhaps to satisfy some latent anger management issues."
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
                <x>238</x>
                <y>65</y>
                <position>
                  <x>238</x>
                  <y>65</y>
                </position>
                <center>
                  <x>243</x>
                  <y>70</y>
                </center>
                <min>
                  <x>238</x>
                  <y>65</y>
                </min>
                <max>
                  <x>248</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>238</xMin>
                <yMin>65</yMin>
                <xMax>248</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Armsdealers</nodeName>
              <nodeDiscription>The professor, who didn't bother mentioning his name, told you he can get you a Flux Capacitor if you help him with his troubles.

Apparently he made a deal with some privateer arms dealers, who he wants taken care of.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Fine, point me to the arms dealers.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>890</x>
        <y>69</y>
        <position>
          <x>890</x>
          <y>69</y>
        </position>
        <center>
          <x>987</x>
          <y>133.5</y>
        </center>
        <min>
          <x>890</x>
          <y>69</y>
        </min>
        <max>
          <x>1084</x>
          <y>198</y>
        </max>
        <width>194</width>
        <height>129</height>
        <size>
          <x>194</x>
          <y>129</y>
        </size>
        <xMin>890</xMin>
        <yMin>69</yMin>
        <xMax>1084</xMax>
        <yMax>198</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Uhhmm... yes. Yes you could do that.

But surely you wouldn't be able to live with such a horrid act! Think about your conscience!"

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>23</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Hand it over...</Name>
        </DialogButton>
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
                <y>109</y>
                <position>
                  <x>182</x>
                  <y>109</y>
                </position>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <min>
                  <x>182</x>
                  <y>109</y>
                </min>
                <max>
                  <x>192</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Armsdealers</nodeName>
              <nodeDiscription>The professor, who didn't bother mentioning his name, told you he can get you a Flux Capacitor if you help him with his troubles.

Apparently he made a deal with some privateer arms dealers, who he wants taken care of.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>You're right, I'll help.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1196</x>
        <y>44</y>
        <position>
          <x>1196</x>
          <y>44</y>
        </position>
        <center>
          <x>1274.5</x>
          <y>94</y>
        </center>
        <min>
          <x>1196</x>
          <y>44</y>
        </min>
        <max>
          <x>1353</x>
          <y>144</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>1196</xMin>
        <yMin>44</yMin>
        <xMax>1353</xMax>
        <yMax>144</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Damn and blast... folks around these wastelands are all the same!"

The professor produces a Flux Capacitor from within his laboratory, which you quickly load into your cargo bay.

You leave the laboratory, and this bumbling fool, behind.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>244</x>
        <y>-96</y>
        <position>
          <x>244</x>
          <y>-96</y>
        </position>
        <center>
          <x>390.5</x>
          <y>-22.5</y>
        </center>
        <min>
          <x>244</x>
          <y>-96</y>
        </min>
        <max>
          <x>537</x>
          <y>51</y>
        </max>
        <width>293</width>
        <height>147</height>
        <size>
          <x>293</x>
          <y>147</y>
        </size>
        <xMin>244</xMin>
        <yMin>-96</yMin>
        <xMax>537</xMax>
        <yMax>51</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The man mentioned having "mighty science weapons", are you sure you want to attempt to shoot him?

It might result in your death.</Text>
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
                <position>
                  <x>281</x>
                  <y>65</y>
                </position>
                <center>
                  <x>286</x>
                  <y>70</y>
                </center>
                <min>
                  <x>281</x>
                  <y>65</y>
                </min>
                <max>
                  <x>291</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>281</xMin>
                <yMin>65</yMin>
                <xMax>291</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>26</ToDialog>
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
                <x>281</x>
                <y>83</y>
                <position>
                  <x>281</x>
                  <y>83</y>
                </position>
                <center>
                  <x>286</x>
                  <y>88</y>
                </center>
                <min>
                  <x>281</x>
                  <y>83</y>
                </min>
                <max>
                  <x>291</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>281</xMin>
                <yMin>83</yMin>
                <xMax>291</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>25</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>I'm sure, shoot him!</Name>
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
                <y>127</y>
                <position>
                  <x>281</x>
                  <y>127</y>
                </position>
                <center>
                  <x>286</x>
                  <y>132</y>
                </center>
                <min>
                  <x>281</x>
                  <y>127</y>
                </min>
                <max>
                  <x>291</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>281</xMin>
                <yMin>127</yMin>
                <xMax>291</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Fine, ask about the Flux Capacitor instead.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>581</x>
        <y>195</y>
        <position>
          <x>581</x>
          <y>195</y>
        </position>
        <center>
          <x>665</x>
          <y>246.5</y>
        </center>
        <min>
          <x>581</x>
          <y>195</y>
        </min>
        <max>
          <x>749</x>
          <y>298</y>
        </max>
        <width>168</width>
        <height>103</height>
        <size>
          <x>168</x>
          <y>103</y>
        </size>
        <xMin>581</xMin>
        <yMin>195</yMin>
        <xMax>749</xMax>
        <yMax>298</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You blast the man before he has a chance to react. 

Upon inspection of his corpse, all you find is a variety of different coloured pencils. He was evidently bluffing.</Text>
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
                <x>156</x>
                <y>65</y>
                <position>
                  <x>156</x>
                  <y>65</y>
                </position>
                <center>
                  <x>161</x>
                  <y>70</y>
                </center>
                <min>
                  <x>156</x>
                  <y>65</y>
                </min>
                <max>
                  <x>166</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>156</xMin>
                <yMin>65</yMin>
                <xMax>166</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>28</ToDialog>
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
                <x>156</x>
                <y>83</y>
                <position>
                  <x>156</x>
                  <y>83</y>
                </position>
                <center>
                  <x>161</x>
                  <y>88</y>
                </center>
                <min>
                  <x>156</x>
                  <y>83</y>
                </min>
                <max>
                  <x>166</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>156</xMin>
                <yMin>83</yMin>
                <xMax>166</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>27</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Enter the laboratory.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>619</x>
        <y>71</y>
        <position>
          <x>619</x>
          <y>71</y>
        </position>
        <center>
          <x>694</x>
          <y>121</y>
        </center>
        <min>
          <x>619</x>
          <y>71</y>
        </min>
        <max>
          <x>769</x>
          <y>171</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>619</xMin>
        <yMin>71</yMin>
        <xMax>769</xMax>
        <yMax>171</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>It turns out the man was not bluffing, as he blasts you with some kind of weird energy blast before you have a chance to shoot.

You drop your weapon as your flesh starts to dissolve, all that remains is a glowing puddle of goo.

You have died.

You lost the game.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EndGame">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <victory>false</victory>
            </ButtonAction>
          </Actions>
          <Name>Damn...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>891</x>
        <y>352</y>
        <position>
          <x>891</x>
          <y>352</y>
        </position>
        <center>
          <x>966.5</x>
          <y>402</y>
        </center>
        <min>
          <x>891</x>
          <y>352</y>
        </min>
        <max>
          <x>1042</x>
          <y>452</y>
        </max>
        <width>151</width>
        <height>100</height>
        <size>
          <x>151</x>
          <y>100</y>
        </size>
        <xMin>891</xMin>
        <yMin>352</yMin>
        <xMax>1042</xMax>
        <yMax>452</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You enter the laboratory, which is filled with machines and experiments making all manner of sounds.

After a quick search, you find a Flux Capacitor, but it doesn't seem to be working.

Alongside it, you find some scribbled notes belonging to the late professor.

" Flux Capacitor 2.0

- 187 percent more functionality.
- Requires additional power
- 1.21 Gigawats insufficient.
- Requires T.O.R.V.A.K. Energy Pylon
- Location of T.O.R.V.A.K. Facility known
- Need leverage to obtain one.</Text>
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
                <position>
                  <x>139</x>
                  <y>65</y>
                </position>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <min>
                  <x>139</x>
                  <y>65</y>
                </min>
                <max>
                  <x>149</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>29</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Take it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>891</x>
        <y>222</y>
        <position>
          <x>891</x>
          <y>222</y>
        </position>
        <center>
          <x>966</x>
          <y>272</y>
        </center>
        <min>
          <x>891</x>
          <y>222</y>
        </min>
        <max>
          <x>1041</x>
          <y>322</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>891</xMin>
        <yMin>222</yMin>
        <xMax>1041</xMax>
        <yMax>322</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You enter the laboratory, which is filled with machines and experiments making all manner of sounds.

After a quick search, you find a fully functional Flux Capacitor!

You return it to your convoy and stash it into your cargo hold.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1134</x>
        <y>320</y>
        <position>
          <x>1134</x>
          <y>320</y>
        </position>
        <center>
          <x>1231</x>
          <y>370</y>
        </center>
        <min>
          <x>1134</x>
          <y>320</y>
        </min>
        <max>
          <x>1328</x>
          <y>420</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>1134</xMin>
        <yMin>320</yMin>
        <xMax>1328</xMax>
        <yMax>420</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You take the Flux Capacitor and return to your convoy.

The scribbled notes contained the coordinates of a T.O.R.V.A.K. Pylon Facility, which you enter into your map.

If you acquire a Energy Pylon from the facility, you should be able to get the Flux Capacitor working again.</Text>
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_PylonRaid2</nodeName>
              <nodeDiscription>You obtained a Flux Capacitor, but it doesn't appear to be functional.

The late professor's notes indicated that you need a sufficient energy source to get it to work. You should head to the T.O.R.V.A.K. Pylon Facility to obtain one.</nodeDiscription>
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
        <x>1594</x>
        <y>-48</y>
        <position>
          <x>1594</x>
          <y>-48</y>
        </position>
        <center>
          <x>1793.5</x>
          <y>16.5</y>
        </center>
        <min>
          <x>1594</x>
          <y>-48</y>
        </min>
        <max>
          <x>1993</x>
          <y>81</y>
        </max>
        <width>399</width>
        <height>129</height>
        <size>
          <x>399</x>
          <y>129</y>
        </size>
        <xMin>1594</xMin>
        <yMin>-48</yMin>
        <xMax>1993</xMax>
        <yMax>81</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Another arrangement? Like what?

It's not as if you happen to be a psychopathic murderer who'd enjoy killing dozens of raiders that have been bothering me recently, are you?

Hah, I wouldn't be so lucky."</Text>
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
                <x>387</x>
                <y>65</y>
                <position>
                  <x>387</x>
                  <y>65</y>
                </position>
                <center>
                  <x>392</x>
                  <y>70</y>
                </center>
                <min>
                  <x>387</x>
                  <y>65</y>
                </min>
                <max>
                  <x>397</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>387</xMin>
                <yMin>65</yMin>
                <xMax>397</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>31</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Actually... I am that person.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>387</x>
                <y>109</y>
                <position>
                  <x>387</x>
                  <y>109</y>
                </position>
                <center>
                  <x>392</x>
                  <y>114</y>
                </center>
                <min>
                  <x>387</x>
                  <y>109</y>
                </min>
                <max>
                  <x>397</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>387</xMin>
                <yMin>109</yMin>
                <xMax>397</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Buying1</nodeName>
              <nodeDiscription>The professor, who didn't bother introducing himself, told you he can sell you a Flux Capacitor for 500 parts. He seems very absent-minded, however, so he might forget how much he charged when you head back.

Return to his laboratory when you've collected enough.</nodeDiscription>
              <pos>Distance</pos>
              <distance>1</distance>
            </ButtonAction>
          </Actions>
          <Name>No, you're right. I'll come back later with the parts.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2072</x>
        <y>-161</y>
        <position>
          <x>2072</x>
          <y>-161</y>
        </position>
        <center>
          <x>2169</x>
          <y>-111</y>
        </center>
        <min>
          <x>2072</x>
          <y>-161</y>
        </min>
        <max>
          <x>2266</x>
          <y>-61</y>
        </max>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>2072</xMin>
        <yMin>-161</yMin>
        <xMax>2266</xMax>
        <yMax>-61</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Oh! Errr... no offense meant of course. Psychopathic murderers are lovely people, some of my best friends are psychopaths.

Great, well. Forget the parts. Take care of a particularly nasty bunch of raiders led by one George Cageman and you'll get your Flux Capacitor."
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
                <position>
                  <x>182</x>
                  <y>65</y>
                </position>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <min>
                  <x>182</x>
                  <y>65</y>
                </min>
                <max>
                  <x>192</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_FluxCapacitor_Cageman</nodeName>
              <nodeDiscription>The professor asked you take care of a group of raiders who have been bothering him. He promised to give you a Flux Capacitor once you've defeated them.

Apparently they're led by one George Cageman.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Will do!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_M_S_FluxCapacitor</Name>
</Scenario>