package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a55e82a;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 25003
 */
public class MK61Mod0SUS extends EntityType
{
    /** Default constructor */
    public MK61Mod0SUS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 25001, Signal
        setSubCategory((byte)1); // uid 25002, Pyrotechnic SUS (Signal Underwater Sound)
        setSpecific((byte)1); // uid 25003, MK 61 Mod 0 SUS
    }
}
