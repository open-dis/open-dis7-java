package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5116ac09;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32360
 */
public class _2S6M1TunguskaM12K22M1 extends EntityType
{
    /** Default constructor */
    public _2S6M1TunguskaM12K22M1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)12); // uid 13112, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)4); // uid 13120, 2S6 Tunguska SA-19 Grison (2K22)
        setExtra((byte)2); // uid 32360, 2S6M1 Tunguska-M1 (2K22M1)
    }
}
