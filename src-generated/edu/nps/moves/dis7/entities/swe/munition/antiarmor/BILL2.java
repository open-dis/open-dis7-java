package edu.nps.moves.dis7.entities.swe.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28bf82d9;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 25587
 */
public class BILL2 extends EntityType
{
    /** Default constructor */
    public BILL2()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 25584, Guided
        setSubCategory((byte)1); // uid 25585, BILL Anti-Tank Missile
        setSpecific((byte)2); // uid 25587, BILL 2
    }
}
