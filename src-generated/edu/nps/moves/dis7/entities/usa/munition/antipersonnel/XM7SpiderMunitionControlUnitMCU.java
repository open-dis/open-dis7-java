package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@50ff7063;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 25326
 */
public class XM7SpiderMunitionControlUnitMCU extends EntityType
{
    /** Default constructor */
    public XM7SpiderMunitionControlUnitMCU()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 19863, Fixed
        setSubCategory((byte)1); // uid 19864, Bounding mines
        setSpecific((byte)5); // uid 25325, XM-7 Spider
        setExtra((byte)1); // uid 25326, XM-7 Spider, Munition Control Unit (MCU)
    }
}
