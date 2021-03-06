package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cde8c6c;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31736
 */
public class DDG113JohnFinn extends EntityType
{
    /** Default constructor */
    public DDG113JohnFinn()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 11373, Arleigh Burke Class
        setSpecific((byte)63); // uid 31736, DDG 113 John Finn
    }
}
