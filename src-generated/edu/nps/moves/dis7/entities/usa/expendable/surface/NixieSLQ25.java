package edu.nps.moves.dis7.entities.usa.expendable.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2dd8a273;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: SURFACE;
 *
 * Entity type uid: 22269
 */
public class NixieSLQ25 extends EntityType
{
    /** Default constructor */
    public NixieSLQ25()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 22267, Active emitter
        setSubCategory((byte)0); // uid 22268, Active Emitter, Other
        setSpecific((byte)1); // uid 22269, Nixie SLQ 25
    }
}
