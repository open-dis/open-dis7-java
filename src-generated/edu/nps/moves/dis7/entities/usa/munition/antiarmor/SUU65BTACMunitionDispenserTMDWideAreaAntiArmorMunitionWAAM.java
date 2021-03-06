package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5822ecda;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 19649
 */
public class SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM extends EntityType
{
    /** Default constructor */
    public SUU65BTACMunitionDispenserTMDWideAreaAntiArmorMunitionWAAM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)51); // uid 19649, SUU-65/B TAC Munition Dispenser (TMD) Wide Area Anti-Armor Munition (WAAM)
    }
}
