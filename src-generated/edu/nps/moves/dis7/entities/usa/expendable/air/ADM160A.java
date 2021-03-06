package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5fa5c8cf;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 26668
 */
public class ADM160A extends EntityType
{
    /** Default constructor */
    public ADM160A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 22257, Winged Decoy
        setSubCategory((byte)2); // uid 26667, Miniature Air-Launched Decoy
        setSpecific((byte)1); // uid 26668, ADM-160A
    }
}
