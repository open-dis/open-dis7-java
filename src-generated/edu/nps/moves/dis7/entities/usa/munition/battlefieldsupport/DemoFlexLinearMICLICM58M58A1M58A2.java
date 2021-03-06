package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69f9b561;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 25103
 */
public class DemoFlexLinearMICLICM58M58A1M58A2 extends EntityType
{
    /** Default constructor */
    public DemoFlexLinearMICLICM58M58A1M58A2()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)3); // uid 20279, Fixed
        setSubCategory((byte)3); // uid 25091, Demolition Charges
        setSpecific((byte)12); // uid 25103, Demo Flex Linear (MICLIC) M58/M58A1/M58A2
    }
}
