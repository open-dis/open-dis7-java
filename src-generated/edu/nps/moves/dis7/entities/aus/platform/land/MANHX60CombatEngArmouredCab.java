package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@26f0a63f;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29720
 */
public class MANHX60CombatEngArmouredCab extends EntityType
{
    /** Default constructor */
    public MANHX60CombatEngArmouredCab()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29716, MAN HX60 - 4x4
        setSpecific((byte)1); // uid 29717, MAN HX60 Tray
        setExtra((byte)3); // uid 29720, MAN HX60 Combat Eng, Armoured Cab
    }
}
